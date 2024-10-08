package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Cy  reason: invalid class name and case insensitive filesystem */
public final class C327977Cy {
    public final 0wc A00;

    public C327977Cy(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public static final void A00(C69489NmX nmX, C69462Nm6 nm6, C69487NmV nmV, C327977Cy r6, String str, String str2) {
        0wc r2 = r6.A00;
        0Aj A002 = r2.A00(r2.A00, "thread_action_system_activity");
        A002.A9F(AnonymousClass000.A00(2792), Long.valueOf(System.currentTimeMillis()));
        A002.AAJ("consumer_id", str);
        A002.AAJ("page_id", str2);
        A002.A8M(nm6, "event_type");
        A002.A8M(nmV, "flow_step");
        A002.AAJ("ig_locale", AnonymousClass1Q2.A00());
        A002.A8M(nmX, "thread_activity");
        A002.Cgf();
    }
}
