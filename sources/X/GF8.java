package X;

import com.instagram.common.session.UserSession;

public final class GF8 implements C59604JPy {
    public 0sP A00;
    public final UserSession A01;
    public final C51979GAc A02;

    public GF8(UserSession userSession, C51979GAc gAc) {
        this.A01 = userSession;
        this.A02 = gAc;
    }

    public final void CwZ(C267324bN r3, C52058GDe gDe, boolean z) {
        AnonymousClass7TG.A1O(r3, gDe);
        if (!z && !r3.CcK()) {
            C61083JwL jwL = new C61083JwL(r3, gDe);
            0sP r0 = this.A00;
            if (r0 != null) {
                r0.invoke(jwL);
            }
        }
    }

    public final void Eb0(0sP r1) {
        this.A00 = r1;
    }
}
