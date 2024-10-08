package X;

import java.io.InputStream;

/* renamed from: X.Mfj  reason: case insensitive filesystem */
public abstract class C66950Mfj {
    public static void A00(0fA r3, 1zH r4, C227052iZ r5, InputStream inputStream, String str, long j) {
        int i;
        String str2;
        if (r4 == null || !r4.A01) {
            i = Integer.MAX_VALUE;
        } else {
            i = r4.A00;
        }
        if (j <= ((long) i)) {
            r5.A02(inputStream);
            return;
        }
        int A07 = 00l.A07(str, ".", str.length() - 1);
        if (A07 != -1) {
            str2 = str.substring(A07);
            0qQ.A07(str2);
        } else {
            str2 = "file_extension_not_found";
        }
        C279724zC.A00(r3, "ERROR_LARGE_FILE", new C58737Iwk(j, str2, 0));
    }
}
