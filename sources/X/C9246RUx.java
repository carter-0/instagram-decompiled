package X;

import com.facebook.zstd.ZstdOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.RUx  reason: case insensitive filesystem */
public abstract class C9246RUx {
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, org.tukaani.xz.LZMA2Options] */
    public static long A00(File file, File file2, int i, int i2) {
        GZIPOutputStream gZIPOutputStream;
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.totalMemory() - runtime.freeMemory();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(JTO.A0t(file2));
            if (i == 1) {
                try {
                    gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } else if (i == 2) {
                gZIPOutputStream = new ZstdOutputStream(bufferedOutputStream, 4096, i2);
            } else {
                ? obj = new Object();
                obj.A00(i2);
                gZIPOutputStream = new 0on(bufferedOutputStream, obj);
            }
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    gZIPOutputStream.write(bArr, 0, read);
                } else {
                    long freeMemory2 = runtime.totalMemory() - runtime.freeMemory();
                    gZIPOutputStream.flush();
                    gZIPOutputStream.close();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    return freeMemory2 - freeMemory;
                }
            }
            throw th;
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                C9153RRe.A00(th2, th3);
                throw th2;
            }
        }
    }
}
