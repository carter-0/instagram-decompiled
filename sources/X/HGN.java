package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class HGN extends C243843aC {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C317286n1 A02;
    public final /* synthetic */ C267064at A03;

    public final void DGO(User user) {
        0qQ.A0B(user, 0);
        if (!user.CPV()) {
            this.A03.A03(this.A00, this.A01, user);
            return;
        }
        C317286n1 r0 = this.A02;
        if (r0 != null) {
            r0.DGJ();
        }
    }

    public HGN(AnonymousClass0iw r1, UserSession userSession, C317286n1 r3, C267064at r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final void DGP(User user) {
        C317286n1 r1 = this.A02;
        if (r1 != null) {
            r1.DGK(true);
        }
    }

    public final void DGR(EWA ewa, User user) {
        C317286n1 r0 = this.A02;
        if (r0 != null) {
            r0.DGJ();
        }
    }
}
