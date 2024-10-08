package X;

import com.instagram.common.session.UserSession;

public final class EKI extends ELQ {
    public final /* synthetic */ C47526E6m A00;

    public final void D9T(AnonymousClass3UM r3, String str, int i) {
        0qQ.A0B(r3, 0);
        super.D9T(r3, str, i);
        C47526E6m e6m = this.A00;
        E9L e9l = e6m.A00;
        if (e9l == null) {
            0qQ.A0F("accountDiscoveryAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        e9l.A01(r3);
        DbX.A0R(e6m.A08).A00(new C319666qz(r3));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EKI(UserSession userSession, C47526E6m e6m) {
        super(e6m, e6m, userSession);
        this.A00 = e6m;
    }
}
