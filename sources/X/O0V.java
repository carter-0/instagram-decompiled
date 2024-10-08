package X;

import com.instagram.common.session.UserSession;

public abstract class O0V {
    public static void A00(UserSession userSession, 1fi r7, C254783t2 r8, String str, String str2, int i, boolean z) {
        C254783t2 r1 = r8;
        String str3 = str2;
        if (r8 == null || AnonymousClass48O.A05(i)) {
            String A06 = r7.A06();
            if (str2 == null) {
                str3 = r7.A04.A03();
            }
            String str4 = str;
            if (str != null && str.length() != 0 && !str.equals("0")) {
                new C300915yA(userSession).A03(r1, A06, str4, str3, z);
                if (C278384wn.A00(userSession).A01.get(str3) != null) {
                    O0W.A00(userSession).A00((C66515MUt) null, str3);
                }
            }
        }
    }
}
