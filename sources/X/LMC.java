package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class LMC {
    public final UserSession A00;
    public final C308436Ug A01;

    public static final C60961JuJ A00(C60932Jtq jtq, LMC lmc) {
        String str = jtq.A03;
        User user = jtq.A02;
        C60954JuC juC = jtq.A01;
        long j = juC.A01;
        return new C60961JuJ(DbS.A0V(juC.A04), 1OP.A01(lmc.A00, user), user, str, (int) jtq.A00, 1, j, jtq.A04, C308436Ug.A02(user));
    }

    public LMC(UserSession userSession, C308436Ug r2) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = userSession;
        this.A01 = r2;
    }
}
