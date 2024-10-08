package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;
import java.util.Set;

public final class Oy8 implements AnonymousClass0lh {
    public final UserSession A00;
    public final Object A01 = new Object();
    public final Set A02 = AnonymousClass7TE.A1F();

    public Oy8(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(ISendDirectMessageCallback iSendDirectMessageCallback) {
        C282295Cn A002 = C282285Cm.A00(this.A00);
        C72665PEu pEu = new C72665PEu(this, iSendDirectMessageCallback);
        synchronized (A002) {
            A002.A00 = pEu;
        }
    }

    public final void onSessionWillEnd() {
        C282285Cm.A00(this.A00).A00();
    }
}
