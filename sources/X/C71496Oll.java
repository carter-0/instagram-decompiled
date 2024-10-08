package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Oll  reason: case insensitive filesystem */
public final class C71496Oll implements AnonymousClass06Q {
    public final /* synthetic */ 0hq A00;
    public final /* synthetic */ AnonymousClass7SZ A01;

    public C71496Oll(0hq r1, AnonymousClass7SZ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onBackStackChanged() {
        if (this.A00.A0M() <= 0) {
            UserSession userSession = this.A01.A00.A10;
            2Dm A002 = 2L2.A00(userSession);
            P3X p3x = new P3X();
            0qQ.A0B(A002, 1);
            1bO A003 = 1bO.A00(userSession);
            0qQ.A07(A003);
            new C66741Mbm(p3x, A003, A002).AUu(AnonymousClass496.A00, C2611948q.ALL, "manual_refresh");
        }
    }
}
