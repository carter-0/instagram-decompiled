package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.89W  reason: invalid class name */
public final class AnonymousClass89W {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public AnonymousClass89W(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 2);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final void A00(C367118qD r5) {
        UserSession userSession = this.A01;
        0wc A012 = AnonymousClass0kN.A01(this.A00, userSession);
        0Aj A002 = A012.A00(A012.A00, "fb_branded_content_logger_event");
        if (A002.isSampled()) {
            A002.A8M(r5, "event");
            A002.A9F("ig_creator_igid", 00y.A0n(10, userSession.A06));
            A002.Cgf();
        }
    }
}
