package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Ls  reason: invalid class name and case insensitive filesystem */
public final class C306326Ls implements C247813gx {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C250973mM A03;
    public final /* synthetic */ C309426Yf A04;
    public final /* synthetic */ C309666Zd A05;

    public final void DO4(C240983Nk r6) {
        0qQ.A0B(r6, 0);
        C255773uh r3 = this.A02;
        if (r3.CWu()) {
            String str = r6.A03;
            r3.A0e(str);
            if (r3.A1b()) {
                AnonymousClass6VB.A00(this.A01).A0E(this.A03, str);
            }
            UserSession userSession = this.A01;
            AnonymousClass6VB.A00(userSession).A0D(r3, false);
            1Xj r1 = r3.A0b;
            r1.getClass();
            AnonymousClass6YF.A02(this.A00, userSession, r1);
        }
        C309426Yf r2 = this.A04;
        r2.A0l = true;
        this.A05.DzS(r3, r2, true);
    }

    public C306326Ls(AnonymousClass0iw r1, UserSession userSession, C255773uh r3, C250973mM r4, C309426Yf r5, C309666Zd r6) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
    }

    public final void DEN() {
        C255773uh r4 = this.A02;
        if (r4.CWu()) {
            if (r4.A1b()) {
                AnonymousClass6VB.A00(this.A01).A0E(this.A03, (String) null);
            }
            UserSession userSession = this.A01;
            AnonymousClass6VB.A00(userSession).A08(r4);
            1Xj r1 = r4.A0b;
            r1.getClass();
            AnonymousClass6YF.A01(this.A00, userSession, r1);
        }
        C309426Yf r12 = this.A04;
        r12.A0l = false;
        this.A05.DzS(r4, r12, false);
    }
}
