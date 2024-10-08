package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7D5  reason: invalid class name */
public final class AnonymousClass7D5 {
    public final 0wc A00;
    public final UserSession A01;

    public final void A00(String str, String str2) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_message_multi_react_overflow_pill");
        if (A002.isSampled()) {
            A002.AAJ("message_id", str);
            A002.AAJ("open_thread_id", str2);
            A002.AAJ("action", "tap");
            A002.Cgf();
        }
    }

    public AnonymousClass7D5(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(new 0xG("direct_thread"), userSession);
    }
}
