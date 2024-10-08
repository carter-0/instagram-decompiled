package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F9v  reason: case insensitive filesystem */
public final class C49855F9v {
    public final 0wc A00;

    public C49855F9v(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = DbW.A0J(userSession, "direct_thread_iab_interstitial");
    }

    public static final void A00(C49855F9v f9v, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(f9v.A00, "messaging_browser_interstitial");
        if (A0e.isSampled()) {
            A0e.AAJ("interstitial_event_name", str);
            A0e.Cgf();
        }
    }
}
