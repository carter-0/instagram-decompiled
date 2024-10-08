package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kwk  reason: case insensitive filesystem */
public abstract class C63424Kwk {
    public static final void A00(UserSession userSession, String str, String str2, boolean z) {
        String valueOf;
        0qQ.A0B(userSession, 0);
        16V A0J = AnonymousClass7TF.A0Q(userSession).A0J();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_fb_xposting_toggle");
        if (A0e.isSampled()) {
            A0e.AAJ("toggle_name", "ig_fb_xposting_setting_option");
            A0e.AAJ(TraceFieldType.AdhocEventName, str);
            A0e.AAJ("toggle_surface", "ig_feed_composer");
            if (A0J == null) {
                valueOf = "unknown";
            } else {
                valueOf = String.valueOf(A0J.A00);
            }
            A0e.A7p("toggle_state", JTP.A0g(A0e, "account_type", valueOf, z));
            A0e.AAJ("toggle_context", str2);
            A0e.Cgf();
        }
    }
}
