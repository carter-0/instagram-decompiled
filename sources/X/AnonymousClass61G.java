package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.61G  reason: invalid class name */
public final class AnonymousClass61G {
    public final /* synthetic */ AnonymousClass6ET A00;

    public AnonymousClass61G(AnonymousClass6ET r1) {
        this.A00 = r1;
    }

    public final void A00() {
        UserSession userSession = this.A00.A00.A09;
        C22340Xzp xzp = new C22340Xzp();
        0qQ.A0B(userSession, 1);
        C54963HZt.A00(AnonymousClass0kN.A01(xzp, userSession), new C268674do(new AnonymousClass9JA((Integer) -1, "DirectUserScopedInitializer_maybeInitializeSecureConsent() with exception", "DirectUserScopedInitializer_SCF_loading_error", false)), "SCF_Android_Observer_Error");
    }

    public final void A01() {
        UserSession userSession = this.A00.A00.A09;
        AnonymousClass630 r4 = new AnonymousClass630(userSession);
        AnonymousClass61N r1 = r4.A02;
        if (r1.A01(1) && C66797Mcj.A01(userSession, false)) {
            new LNv(r4.A01).A00("igd_nudity_detection_model_loading_on_init");
        } else if (r1.A00.get(1) == null && C66797Mcj.A01(userSession, true)) {
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36325897087235418L)) {
                r4.A00(new C65307Lr1(r4), true);
            }
        }
        AnonymousClass631 r42 = new AnonymousClass631(userSession);
        if (r42.A04() && 0qQ.A0K(r42.A03.A00.get(108), true)) {
            r42.A00((G70) null, AnonymousClass0t1.A01.A01(r42.A01).A2I());
        }
        if (r42.A03() && 0qQ.A0K(r42.A03.A00.get(109), true)) {
            r42.A02(AnonymousClass0t1.A01.A01(r42.A01).A2H());
        }
        if (r42.A05()) {
            AnonymousClass19S A02 = 19E.A02(r42.A02);
            C376909Ju r2 = new C376909Ju(r42, (AnonymousClass4D7) null, 15);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A02);
        }
    }
}
