package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class PEQ implements C333597Zo {
    public final 1Ng A00;
    public final AnonymousClass6EZ A01;

    public PEQ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = AnonymousClass6EY.A00(userSession, "MsysThreadLeaver");
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }

    public final void Cfp(C254743sy r5) {
        if (r5 instanceof MsysThreadId) {
            1aU A0P = C66582MXn.A0N(this.A01.A00.A02.A0M(new C72010Ouk(((MsysThreadId) r5).A00)), "tam_client_participant_leave_thread").A0P(C318146oT.A01);
            1a8 A0P2 = C66581MXm.A0P();
            A0P2.A02(A0P, new PUC(12, (Object) A0P2, (Object) r5, (Object) this));
            return;
        }
        throw DbT.A0m();
    }
}
