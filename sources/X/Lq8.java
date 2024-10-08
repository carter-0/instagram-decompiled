package X;

import com.instagram.common.session.UserSession;

public final class Lq8 implements B1U {
    public final UserSession A00;
    public final C331897Sw A01;

    public final void BNe(C317966o8 r6, C62320sa r7, 0sP r8) {
        0qQ.A0B(r7, 2);
        C331897Sw r3 = this.A01;
        String url = r6.A0H.getUrl();
        C65341Lrh lrh = new C65341Lrh(2, r7, r8);
        C331897Sw r0 = C331897Sw.A0A;
        r3.A05(lrh, url);
    }

    public /* synthetic */ Lq8(UserSession userSession) {
        C331897Sw r0 = C331897Sw.A0A;
        C331897Sw A002 = C331917Sy.A00(C51966G9m.A0P(userSession));
        0qQ.A0B(A002, 2);
        this.A00 = userSession;
        this.A01 = A002;
    }
}
