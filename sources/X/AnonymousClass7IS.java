package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7IS  reason: invalid class name */
public final class AnonymousClass7IS {
    public final 0wc A00;

    public final void A00(C254743sy r4, boolean z) {
        String str;
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_edit_message");
        if (A002.isSampled()) {
            if (z) {
                str = "thread_upsell_shown";
            } else {
                str = "thread_upsell_dismissed";
            }
            A002.AAJ("action", str);
            A002.AAJ("message_type", 2FW.A1g.toString());
            A002.AAJ("message_id", "");
            A002.A7p("is_e2ee", false);
            A002.AAJ("open_thread_id", C67003Mgb.A01(r4));
            A002.A9F("occamadillo_thread_id", C67003Mgb.A00(r4));
            A002.Cgf();
        }
    }

    public AnonymousClass7IS(UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(new 0xG("direct_thread"), userSession);
    }
}
