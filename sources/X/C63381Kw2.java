package X;

import java.util.Set;

/* renamed from: X.Kw2  reason: case insensitive filesystem */
public abstract class C63381Kw2 {
    public static final AnonymousClass55U A00(C63790L6w l6w, LP8 lp8) {
        AnonymousClass7TG.A1N(lp8, l6w);
        AnonymousClass3Q2 r5 = lp8.A0D;
        1XP r2 = l6w.A01;
        r5.A1d.A00++;
        r5.A0b(AnonymousClass3QD.NOT_UPLOADED);
        if (r5.A3b != null) {
            if (182.A06(0Tu.A05, lp8.A0C, 36318861930469909L)) {
                String A0Z = JTQ.A0Z();
                0qQ.A0B(A0Z, 0);
                r5.A3t = A0Z;
            }
        }
        AnonymousClass9IQ r1 = r5.A0j;
        if (r1.A01) {
            r5.A3u = null;
            ((Set) r1.A00).clear();
        }
        r5.A09++;
        String str = "Failed on configure: Reply: Media needs reupload";
        if (r2 != null) {
            String str2 = r2.mErrorTitle;
            if (!(str2 == null || str2.length() == 0)) {
                str = 002.A0g(str, " Title: ", str2);
            }
            String errorMessage = r2.getErrorMessage();
            if (!(errorMessage == null || errorMessage.length() == 0)) {
                str = 002.A0g(str, " Message: ", r2.getErrorMessage());
            }
            String str3 = r2.mErrorSource;
            if (!(str3 == null || str3.length() == 0)) {
                str = 002.A0g(str, " Source: ", str3);
            }
            String str4 = r2.mErrorBody;
            if (!(str4 == null || str4.length() == 0)) {
                str = 002.A0g(str, " Body: ", str4);
            }
        }
        AnonymousClass55U A02 = lp8.A02(AnonymousClass55S.A0L, str);
        lp8.A0E.EFk(A02.A01, r5, (1us) null, str, l6w.A02);
        return A02;
    }
}
