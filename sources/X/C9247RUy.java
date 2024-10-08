package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.RUy  reason: case insensitive filesystem */
public abstract class C9247RUy {
    public static void A00(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                IOException iOException = new IOException(file.getAbsolutePath());
                IOException iOException2 = new IOException(absolutePath);
                iOException2.initCause(iOException);
                throw iOException2;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(file.getAbsolutePath());
        }
    }
}
