package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nez  reason: case insensitive filesystem */
public final class C69120Nez extends OTZ {
    public final UserSession A00;
    public final C72187Oxw A01;
    public final C70706OHb A02;
    public final 17i A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69120Nez(UserSession userSession, O9R o9r) {
        super(o9r);
        17i A002 = 17h.A00(userSession);
        C72187Oxw oxw = (C72187Oxw) userSession.A01(C72187Oxw.class, C73852Pkp.A00);
        C70706OHb oHb = new C70706OHb(userSession);
        C51972G9s.A1D(A002, oxw);
        this.A00 = userSession;
        this.A03 = A002;
        this.A01 = oxw;
        this.A02 = oHb;
    }
}
