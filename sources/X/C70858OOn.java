package X;

import java.io.File;

/* renamed from: X.OOn  reason: case insensitive filesystem */
public final class C70858OOn {
    public static final long A00(C70858OOn oOn, File file, int i) {
        File[] listFiles;
        int i2;
        long j = 0;
        if (file == null || !file.exists()) {
            return 0;
        }
        if (file.isFile()) {
            long j2 = (long) i;
            return (((file.length() + j2) - 1) / j2) * j2;
        } else if (!file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length - 1 < 0) {
            return 0;
        } else {
            while (true) {
                int i3 = i2 - 1;
                j += A00(oOn, listFiles[i2], i);
                if (i3 < 0) {
                    return j;
                }
                i2 = i3;
            }
        }
    }
}
