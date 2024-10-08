package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class Fl9 implements 0Gm {
    public final /* synthetic */ C47705EDo A00;

    public final void ENG(UserSession userSession) {
        17i A002 = 17h.A00(userSession);
        C47705EDo eDo = this.A00;
        C67623Mqv mqv = C67620Mqs.A04;
        User user = eDo.A00;
        if (user != null) {
            A002.A01(user, false, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public Fl9(C47705EDo eDo) {
        this.A00 = eDo;
    }
}
