package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public abstract class I2Z {
    public static final void A01(C2809354u r4, UserSession userSession, String str) {
        String str2;
        AnonymousClass7TF.A1B(userSession, 0, str);
        1Xj A00 = A00(userSession, str);
        if (A00 != null) {
            0sn A3b = A00.A3b();
            if (A3b == null) {
                A3b = 0sn.A00;
            }
            ArrayList A0U = 00k.A0U(A3b);
            C2809354u r0 = (C2809354u) 00k.A0J(A0U);
            if (r0 != null) {
                str2 = r0.getUserId();
            } else {
                str2 = null;
            }
            if (C51966G9m.A1W(userSession, str2)) {
                A0U.set(0, r4);
            } else {
                A0U.add(0, r4);
            }
            A00.A4I(A0U);
            C51967G9n.A1K(userSession, A00);
        }
    }

    public static final 1Xj A00(UserSession userSession, String str) {
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U == null) {
            return null;
        }
        return A0U.A1e(userSession);
    }

    public static final void A02(UserSession userSession, String str, String str2, boolean z) {
        1Xj A00 = A00(userSession, str);
        if (A00 != null) {
            0sn<C2809354u> A3b = A00.A3b();
            if (A3b == null) {
                A3b = 0sn.A00;
            }
            ArrayList A0r = AnonymousClass7TG.A0r(A3b);
            for (C2809354u r1 : A3b) {
                if (0qQ.A0K(r1.getId(), str2)) {
                    C56009HrH AKG = r1.AKG();
                    AKG.A02 = Boolean.valueOf(z);
                    r1 = AKG.A00();
                }
                A0r.add(r1);
            }
            A00.A4I(A0r);
            C51967G9n.A1K(userSession, A00);
        }
    }
}
