package X;

import com.instagram.common.session.UserSession;

public abstract class O34 {
    public static final C72764PJa A00(UserSession userSession, C62875Knp knp) {
        String str;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(knp, userSession);
        if (knp instanceof C69217NhX) {
            C69217NhX nhX = (C69217NhX) knp;
            String str2 = nhX.A03;
            if (str2 != null && (str = nhX.A04) != null) {
                return new C69215NhV(userSession2, nhX.A02, str2, str, nhX.A05);
            }
            boolean z = nhX.A06;
            String str3 = nhX.A02;
            String str4 = nhX.A05;
            if (z) {
                return new C69213NhT(userSession2, str3, str4);
            }
            return new C69214NhU(userSession2, str3, str4);
        } else if (knp instanceof C69216NhW) {
            C69216NhW nhW = (C69216NhW) knp;
            return new C69212NhS(userSession, nhW.A00, nhW.A01);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}
