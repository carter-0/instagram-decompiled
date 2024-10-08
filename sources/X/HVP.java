package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class HVP {
    public static final void A00(UserSession userSession, AnonymousClass4DU r9, String str, String str2, String str3) {
        Long l;
        UserSession userSession2 = userSession;
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U != null) {
            AnonymousClass4DU r6 = r9;
            0wc A0b = C51973G9u.A0b(r9, userSession);
            Long l2 = null;
            C254523sc A02 = C254513sb.A02(userSession2, A0U, r6, (C249763kK) null, (Integer) null, C51967G9n.A0j(), AnonymousClass000.A00(3373));
            if (A02 != null) {
                User A11 = C51966G9m.A11(A0U);
                if (A11 != null) {
                    A02.A5I = 1aC.A06(A11.B6o());
                }
                if (str2 != null) {
                    l = C51971G9r.A0n(0, 1Xv.A06(str2));
                } else {
                    l = null;
                }
                if (str3 != null) {
                    l2 = C51971G9r.A0n(0, 1Xv.A06(str3));
                }
                XXB.A00(A0b, A02, r6, l, l2);
            }
        }
    }
}
