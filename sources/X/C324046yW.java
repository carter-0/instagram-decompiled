package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6yW  reason: invalid class name and case insensitive filesystem */
public final class C324046yW {
    public 0xa A00;
    public final UserSession A01;

    public final void A01(User user) {
        0xa r1 = this.A00;
        if (r1.getBoolean(user.getId(), false)) {
            0xY AR4 = r1.AR4();
            AR4.E5T(user.getId(), false);
            AR4.ED3(002.A0R(user.getId(), "_report_reason"));
            AR4.apply();
            user.A0d(this.A01);
        }
    }

    public static C324046yW A00(UserSession userSession) {
        return (C324046yW) userSession.A01(C324046yW.class, new C324056yX(userSession));
    }

    public final void A02(User user, int i) {
        if (user != null) {
            0xY AR4 = this.A00.AR4();
            AR4.E5T(user.getId(), true);
            AR4.E5Z(002.A0R(user.getId(), "_report_reason"), i);
            AR4.apply();
            user.A0d(this.A01);
        }
    }

    public C324046yW(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = 1Al.A01(userSession).A03(1An.A2i);
    }
}
