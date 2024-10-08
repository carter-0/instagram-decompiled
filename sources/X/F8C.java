package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class F8C {
    public static final User A00(UserSession userSession, C47326Dut dut) {
        if (userSession != null) {
            17i A00 = 17h.A00(userSession);
            User A02 = A00.A02(dut.A04);
            if (A02 != null) {
                int i = dut.A00;
                if (i == 0) {
                    A02.A0y(dut.A07);
                    return A02;
                } else if (i == 1) {
                    A02.A1B(dut.A08);
                    return A02;
                } else {
                    throw DbW.A0a("Unrecognized interop user type: ", i);
                }
            } else {
                User user = new User(dut.A04, dut.A05);
                user.A0l(dut.A01);
                user.A0t(dut.A03);
                user.A0s(dut.A02);
                user.A0c(dut.A00);
                int i2 = dut.A00;
                if (i2 == 0) {
                    user.A0y(dut.A07);
                } else if (i2 == 1) {
                    user.A1B(dut.A08);
                } else {
                    throw DbW.A0a("Unrecognized interop user type: ", i2);
                }
                return A00.A01(user, false, false);
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A01(User user, C47326Dut dut) {
        dut.A01 = user.Bh3();
        dut.A05 = user.getUsername();
        String fullName = user.getFullName();
        if (fullName == null) {
            fullName = "";
        }
        dut.A03 = fullName;
        dut.A04 = user.getId();
        dut.A02 = user.BST();
        dut.A00 = user.BIW();
        dut.A08 = user.CXO();
        dut.A07 = user.CPV();
    }
}
