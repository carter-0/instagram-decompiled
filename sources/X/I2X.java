package X;

import com.instagram.common.session.UserSession;

public abstract class I2X {
    public static final void A01(UserSession userSession, C247733gp r2, 1Xj r3) {
        r2.A0O = true;
        r2.A02++;
        DbT.A0j(userSession).equals(C51966G9m.A11(r3));
    }

    public static final void A02(UserSession userSession, C247733gp r3, 1Xj r4) {
        r3.A0O = false;
        r3.A02 = Math.max(0, r3.A02 - 1);
        DbT.A0j(userSession).equals(C51966G9m.A11(r4));
    }

    public static final C247733gp A00(C247733gp r3, 1Xj r4) {
        String str = r3.A0F;
        1i5 r0 = r4.A0d;
        if (str == null) {
            return r0.A05.A00(r3.A0G);
        }
        C247733gp A00 = r0.A05.A00(str);
        if (A00 == null) {
            return null;
        }
        for (C247733gp r1 : A00.A0L) {
            if (0qQ.A0K(r1, r3)) {
                return r1;
            }
        }
        return null;
    }
}
