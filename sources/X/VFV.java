package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

public abstract class VFV {
    public static final C17884Vhb A00(UNQ unq, UserSession userSession, User user) {
        User CCd;
        AnonymousClass7TG.A1N(userSession, unq);
        AnonymousClass3HX r4 = unq.A02;
        1Nr r3 = null;
        if (r4 != null) {
            1Nr A01 = AnonymousClass3P9.A01(userSession, r4);
            if (A01 == null) {
                if (user != null) {
                    r3 = new 1Nr(user);
                }
                A01 = r3;
            }
            User A0j = DbT.A0j(userSession);
            if (!(A01 == null || (CCd = A01.CCd()) == null)) {
                user = CCd;
            }
            boolean A0K = 0qQ.A0K(A0j, user);
            1OP r0 = 1OP.$redex_init_class;
            ReelStore A03 = ReelStore.A03(userSession);
            0qQ.A07(A03);
            r3 = A03.A0H(r4, A01, A0K);
        }
        return new C17884Vhb(unq.A00, unq.A01, r3);
    }
}
