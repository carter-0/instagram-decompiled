package X;

import com.instagram.common.session.UserSession;

public final class WXJ implements C247813gx {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ C309426Yf A04;
    public final /* synthetic */ C67602Mqa A05;
    public final /* synthetic */ C317286n1 A06;

    public final void DO4(C240983Nk r6) {
        C250973mM r2;
        0qQ.A0B(r6, 0);
        C255773uh r3 = this.A03;
        if (r3.A1b() && (r2 = this.A05.A07) != null) {
            AnonymousClass6VB.A00(this.A01).A0E(r2, r6.A03);
        }
        UserSession userSession = this.A01;
        AnonymousClass6VB.A00(userSession).A0D(r3, false);
        AnonymousClass6YF.A02(this.A00, userSession, this.A02);
        C309426Yf r22 = this.A04;
        r22.A0l = true;
        this.A06.DzS(r3, r22, true);
    }

    public WXJ(AnonymousClass0iw r1, UserSession userSession, 1Xj r3, C255773uh r4, C309426Yf r5, C67602Mqa mqa, C317286n1 r7) {
        this.A03 = r4;
        this.A05 = mqa;
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r5;
        this.A06 = r7;
    }

    public final void DEN() {
        C309426Yf r3 = this.A04;
        r3.A0l = false;
        C317286n1 r0 = this.A06;
        C255773uh r1 = this.A03;
        r0.DzS(r1, r3, false);
        UserSession userSession = this.A01;
        AnonymousClass6VB.A00(userSession).A08(r1);
        AnonymousClass6YF.A01(this.A00, userSession, this.A02);
    }
}
