package X;

import java.util.List;

/* renamed from: X.HVb  reason: case insensitive filesystem */
public abstract class C54844HVb {
    public static final C53310Glw A00(1Xj r11) {
        String str;
        String BKL;
        String str2;
        String str3;
        List list = null;
        if (!r11.CcK()) {
            return null;
        }
        C250513lZ A0w = C51966G9m.A0w(r11);
        if (A0w != null) {
            str = A0w.AZ4();
        } else {
            str = null;
        }
        if (str != null) {
            String id = r11.getId();
            if (id != null) {
                C250513lZ A0w2 = C51966G9m.A0w(r11);
                if (A0w2 == null || (BKL = A0w2.BKL()) == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                C250513lZ A0w3 = C51966G9m.A0w(r11);
                if (A0w3 != null) {
                    str2 = A0w3.C9L();
                } else {
                    str2 = null;
                }
                String BMm = r11.A0C.BMm();
                C247733gp A1U = r11.A1U();
                if (A1U != null) {
                    str3 = A1U.A0d;
                } else {
                    str3 = null;
                }
                String BMq = r11.A0C.BMq();
                List A3P = r11.A3P();
                C250513lZ A0w4 = C51966G9m.A0w(r11);
                if (A0w4 != null) {
                    list = A0w4.getCookies();
                }
                return new C53310Glw(str, id, BKL, str2, BMm, str3, BMq, A3P, list);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
