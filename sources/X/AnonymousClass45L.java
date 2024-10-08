package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.45L  reason: invalid class name */
public final class AnonymousClass45L implements FilenameFilter {
    public static final AnonymousClass45L A00 = new AnonymousClass45L();

    public final boolean accept(File file, String str) {
        0qQ.A0A(str);
        if (!00p.A0k(str, "tmp_photo_", false) || !00p.A0i(str, ".jpg", false)) {
            return false;
        }
        return true;
    }
}
