package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3YG  reason: invalid class name */
public abstract class AnonymousClass3YG {
    public static final boolean A01(UserSession userSession, 1Xj r6) {
        int i;
        List<1Xj> Alu;
        int i2;
        int A0z = r6.A0z();
        ArrayList A3G = r6.A3G();
        if (A3G != null) {
            i = 00k.A0a(A3G).size();
        } else {
            i = 0;
        }
        if (A0z + i > 3) {
            return false;
        }
        1Xj A1e = r6.A1e(userSession);
        if (!A1e.A5D() || (Alu = A1e.A0C.Alu()) == null) {
            return true;
        }
        if ((Alu instanceof Collection) && Alu.isEmpty()) {
            return true;
        }
        for (1Xj r0 : Alu) {
            0qQ.A0B(r0, 0);
            int A0z2 = r0.A0z();
            ArrayList A3G2 = r0.A3G();
            if (A3G2 != null) {
                i2 = 00k.A0a(A3G2).size();
            } else {
                i2 = 0;
            }
            if (A0z2 + i2 > 3) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A00(UserSession userSession, 1Xj r2) {
        if (r2.A1e(userSession).CcK() || r2.A1e(userSession).A63()) {
            return true;
        }
        return false;
    }
}
