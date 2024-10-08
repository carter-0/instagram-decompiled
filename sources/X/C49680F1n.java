package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F1n  reason: case insensitive filesystem */
public final class C49680F1n {
    public final 0wc A00;

    public C49680F1n(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A02(userSession);
    }

    public final void A00(String str) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "dogfooding_rageshake_event");
        if (A0e.isSampled()) {
            A0e.AAJ("event_type", str);
            A0e.Cgf();
        }
    }
}
