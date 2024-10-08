package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ij0  reason: case insensitive filesystem */
public final class C57945Ij0 implements Runnable {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C57214ITb A01;
    public final /* synthetic */ AnonymousClass3W1 A02;
    public final /* synthetic */ AnonymousClass34I A03;

    public C57945Ij0(1Xj r1, C57214ITb iTb, AnonymousClass3W1 r3, AnonymousClass34I r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = iTb;
    }

    public final void run() {
        UserSession userSession;
        AnonymousClass3WA r0;
        AnonymousClass3W1 r2 = this.A02;
        1sy r1 = r2.A0o;
        if ((r1 == 1sy.A0A || r1 == 1sy.A0B) && r2.A0m == AnonymousClass3WA.ORGANIC_SHOW_LESS) {
            AnonymousClass34I r3 = this.A03;
            AnonymousClass3W1 BQr = r3.A03.BQr(this.A00);
            if (!BQr.A1y) {
                BQr.A1y = true;
                AnonymousClass3W1.A00(BQr, 6);
            }
            userSession = r3.A01;
        } else {
            AnonymousClass34I r4 = this.A03;
            userSession = r4.A01;
            if (C240133Js.A00(userSession).A01) {
                r0 = AnonymousClass3WA.ORGANIC_REPORT_FALSE_NEWS;
            } else {
                r0 = AnonymousClass3WA.ORGANIC_REPORT;
            }
            r2.A0m = r0;
            this.A01.A00(r4.A02, r4.A00.getScrollingViewProxy());
        }
        C240133Js.A00(userSession).A01();
    }
}
