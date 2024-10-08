package X;

import com.instagram.common.session.UserSession;

public final class IOJ implements C61110lV, 0lm {
    public final UserSession A00;

    public IOJ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        if (182.A06(0Tu.A05, userSession, 36320657226670853L)) {
            14i.A04(15Y.A02, this, false, false);
        } else {
            14i.A05(this);
        }
    }

    public final void A00() {
        UserSession userSession = this.A00;
        0ug A002 = 0tq.A00(userSession);
        C62500to r4 = new C62500to(A002);
        String str = r4.A00;
        if (str != null && str.length() == 0) {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("feed/timeline_metadata_update/");
            A0a.A0G("feed_view_info", str);
            1OC A0S = DbU.A0S(A0a, 1XP.class, 1XY.class);
            H51.A00(A0S, r4, A002, 7);
            1ES.A05(A0S, 902662556, 3, false, false);
        }
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-2070627620);
        A00();
        AnonymousClass0fD.A0A(-1172910769, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-543678614, AnonymousClass0fD.A03(246510867));
    }

    public final void onUserSessionWillEnd(boolean z) {
        A00();
        if (JVU.A01(this.A00, AnonymousClass05K.A15)) {
            14i.A07(this);
            14i.A06(this);
        }
    }
}
