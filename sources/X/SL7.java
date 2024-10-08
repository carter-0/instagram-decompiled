package X;

import com.facebook.common.dextricks.Constants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public abstract class SL7 {
    public static final AtomicReference A00 = new AtomicReference();

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.io.File r4, java.nio.ByteBuffer r5) {
        /*
            r3 = 0
            r5.position(r3)
            r2 = 0
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x002e }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x002e }
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch:{ all -> 0x0024 }
            r2.write(r5)     // Catch:{ all -> 0x0024 }
            r2.force(r3)     // Catch:{ all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x0024 }
            r1.close()     // Catch:{ all -> 0x0024 }
            r2.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            r1.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            return
        L_0x0024:
            r0 = move-exception
            if (r2 == 0) goto L_0x002a
            r2.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            r1.close()     // Catch:{ IOException -> 0x002f }
            throw r0
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SL7.A01(java.io.File, java.nio.ByteBuffer):void");
    }

    public static ByteBuffer A00(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        AtomicReference atomicReference = A00;
        byte[] bArr = (byte[]) atomicReference.getAndSet((Object) null);
        if (bArr == null) {
            bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                atomicReference.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArray.length);
                allocateDirect.put(byteArray);
                return (ByteBuffer) allocateDirect.position(0);
            }
        }
    }
}
