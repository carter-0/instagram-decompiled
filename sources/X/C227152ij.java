package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.2ij  reason: invalid class name and case insensitive filesystem */
public final class C227152ij {
    public final 1FL A00;

    public C227152ij(1F9 r3, File file, String str) {
        String str2;
        0qQ.A0B(file, 2);
        try {
            str2 = file.getCanonicalPath();
        } catch (IOException unused) {
            str2 = file.getAbsolutePath();
        }
        this.A00 = r3.A00(str, str2, "stash_extras");
    }
}
