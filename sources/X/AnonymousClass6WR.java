package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;

/* renamed from: X.6WR  reason: invalid class name */
public final class AnonymousClass6WR implements C247813gx {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C250973mM A03;
    public final /* synthetic */ C309426Yf A04;
    public final /* synthetic */ C317116mk A05;
    public final /* synthetic */ C316006kx A06;
    public final /* synthetic */ String A07;

    public final void DO4(C240983Nk r6) {
        0qQ.A0B(r6, 0);
        C255773uh r3 = this.A02;
        if (r3.CWu()) {
            if (r3.A1b()) {
                String str = r6.A03;
                r3.A0e(str);
                AnonymousClass6VB.A00(this.A01).A0E(this.A03, str);
            }
            UserSession userSession = this.A01;
            1Xj r1 = r3.A0b;
            r1.getClass();
            AnonymousClass6YF.A02(this.A00, userSession, r1);
            AnonymousClass6VB.A00(userSession).A0D(r3, false);
        }
        C309426Yf r2 = this.A04;
        r2.A0l = true;
        this.A05.DzS(r3, r2, true);
    }

    public AnonymousClass6WR(AnonymousClass0iw r1, UserSession userSession, C255773uh r3, C250973mM r4, C309426Yf r5, C317116mk r6, C316006kx r7, String str) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = str;
    }

    public final void DEN() {
        C255773uh r3 = this.A02;
        UserSession userSession = this.A01;
        if (r3.A1s(userSession)) {
            this.A06.A0t.setVisibility(0);
        }
        if (r3.CWu()) {
            AnonymousClass6VB.A00(userSession).A08(r3);
            1Xj r7 = r3.A0b;
            r7.getClass();
            AnonymousClass6YF.A01(this.A00, userSession, r7);
            String str = r3.A0k;
            0qQ.A07(str);
            String str2 = this.A07;
            0qQ.A0B(str2, 1);
            0qV A042 = C61970qY.A04();
            0wc A012 = AnonymousClass0kN.A01(LS4.A00, userSession);
            0Aj A002 = A012.A00(A012.A00, "reel_loading_error");
            A002.AAJ("error_type", "reel_media_fail_to_load");
            A002.AAJ("network_connection_cellular_type", 0qT.A00(A042.A00));
            A002.AAJ("network_connection_state", C61970qY.A06());
            A002.AAJ("network_connection_type", 0qU.A00(A042.A01));
            A002.AAJ("reel_module_source", str2);
            Long l = null;
            User A2A = r7.A2A(userSession);
            if (A2A != null) {
                l = 00y.A0n(10, A2A.getId());
            }
            A002.A9F("reel_author_id", l);
            A002.AAJ("reel_id", str);
            A002.AAJ("reel_media_id", r7.getId());
            A002.A9F(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, 00y.A0n(10, userSession.A06));
            A002.Cgf();
        }
        C309426Yf r1 = this.A04;
        r1.A0l = false;
        this.A05.DzS(r3, r1, false);
    }
}
