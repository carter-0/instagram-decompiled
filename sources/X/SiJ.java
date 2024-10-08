package X;

import java.io.File;
import java.nio.ByteBuffer;

public final class SiJ implements C13812Thf {
    public final File A00;

    public final void cancel() {
    }

    public final void cleanup() {
    }

    public final Class AvH() {
        return ByteBuffer.class;
    }

    public final Integer AvP() {
        return AnonymousClass05K.A00;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|(2:19|20)|21|22|29|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:8|9|10|11|12|13|14|15|16) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CgB(X.RE3 r11, X.C13692TfA r12) {
        /*
            r10 = this;
            java.io.File r3 = r10.A00     // Catch:{ IOException -> 0x004e }
            r4 = 0
            long r8 = r3.length()     // Catch:{ all -> 0x004c }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0045
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x004c }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x004c }
            java.nio.channels.FileChannel r4 = r1.getChannel()     // Catch:{ all -> 0x0034 }
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0034 }
            java.nio.MappedByteBuffer r0 = r4.map(r5, r6, r8)     // Catch:{ all -> 0x0034 }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ all -> 0x0034 }
            r4.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r1.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            r12.D7o(r0)     // Catch:{ IOException -> 0x004e }
            return
        L_0x0034:
            r0 = move-exception
            if (r4 == 0) goto L_0x003a
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            r1.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004d
        L_0x003e:
            java.lang.String r0 = "File unsuitable for memory mapping"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x004c }
            goto L_0x004b
        L_0x0045:
            java.lang.String r0 = "File too large to map into memory"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x004c }
        L_0x004b:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
        L_0x004d:
            throw r0     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            r2 = move-exception
            r1 = 3
            java.lang.String r0 = "ByteBufferFileLoader"
            android.util.Log.isLoggable(r0, r1)
            r12.DOG(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SiJ.CgB(X.RE3, X.TfA):void");
    }

    public SiJ(File file) {
        this.A00 = file;
    }
}
