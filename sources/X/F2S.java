package X;

import com.instagram.common.session.UserSession;

public final class F2S {
    public final 0wc A00;
    public final AnonymousClass0iw A01;
    public final C230012om A02;
    public final String A03;

    public F2S(AnonymousClass0iw r2, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = r2;
        this.A03 = str;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
        this.A02 = new C230012om(r2, userSession);
    }

    public final void A00(AnonymousClass3UM r4, String str, int i) {
        AnonymousClass7TG.A1N(r4, str);
        AnonymousClass6KM r1 = new AnonymousClass6KM(str, r4.getId(), this.A01.getModuleName());
        r1.A00 = i;
        DbW.A1M(r4, r1);
        r1.A04 = r4.getAlgorithm();
        r1.A0B = r4.BxN();
        r1.A05 = this.A03;
        DbV.A1T(r1, this.A02);
    }
}
