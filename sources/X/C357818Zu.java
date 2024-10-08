package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.8Zu  reason: invalid class name and case insensitive filesystem */
public abstract class C357818Zu {
    public static final void A00(File file) {
        if (!file.exists() && !file.mkdirs()) {
            IOException e = null;
            StringBuilder sb = new StringBuilder();
            sb.append("could not make directory: ");
            try {
                sb.append(file.getCanonicalPath());
                sb.append("-canonical");
            } catch (IOException e2) {
                e = e2;
                sb.append(file.getAbsolutePath());
                sb.append("-absolute");
            }
            IOException iOException = new IOException(sb.toString());
            if (e != null) {
                iOException.initCause(e);
            }
            throw iOException;
        }
    }
}
