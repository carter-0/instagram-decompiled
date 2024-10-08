package X;

import com.instagram.common.session.UserSession;

public final class WXI implements C247813gx {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C250973mM A02;
    public final /* synthetic */ C309426Yf A03;
    public final /* synthetic */ C317116mk A04;

    public final void DO4(C240983Nk r6) {
        0qQ.A0B(r6, 0);
        C255773uh r3 = this.A01;
        if (r3.A1b()) {
            String str = r6.A03;
            r3.A0e(str);
            AnonymousClass6VB.A00(this.A00).A0E(this.A02, str);
        }
        AnonymousClass6VB.A00(this.A00).A0D(r3, false);
        C309426Yf r2 = this.A03;
        r2.A0l = true;
        this.A04.DzS(r3, r2, true);
    }

    public WXI(UserSession userSession, C255773uh r2, C250973mM r3, C309426Yf r4, C317116mk r5) {
        this.A01 = r2;
        this.A00 = userSession;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void DEN() {
        AnonymousClass6VC A002 = AnonymousClass6VB.A00(this.A00);
        C255773uh r3 = this.A01;
        A002.A08(r3);
        C309426Yf r1 = this.A03;
        r1.A0l = false;
        this.A04.DzS(r3, r1, false);
    }
}
