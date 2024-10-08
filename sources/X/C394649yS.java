package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.9yS  reason: invalid class name and case insensitive filesystem */
public abstract class C394649yS {
    public static final String A00(2Nn r7, File file, String str) {
        try {
            String canonicalPath = file.getCanonicalPath();
            0qQ.A07(canonicalPath);
            String canonicalPath2 = r7.A01().getCanonicalPath();
            0qQ.A07(canonicalPath2);
            if (!canonicalPath.startsWith(canonicalPath2)) {
                File A03 = C39907AIy.A03(r7, str, C39907AIy.A04(file), "copy_for_drafts");
                if (file.length() >= 157286400 || A03.getUsableSpace() - file.length() <= 52428800) {
                    0kD.A06("DraftUtils", 002.A0e("Unable to copy source video to drafts. File size (MB): ", "1048576", file.length()), (Throwable) null);
                    return null;
                }
                0b9.A01(file, A03);
                return A03.getCanonicalPath();
            }
        } catch (IOException e) {
            0kD.A06("DraftUtils", "Unable to copy source video to drafts", e);
        }
        return null;
    }
}
