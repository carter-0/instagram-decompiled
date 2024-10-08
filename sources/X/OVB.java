package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class OVB {
    public final 0wc A00;
    public final String A01;

    public OVB(AnonymousClass0iw r2, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
        this.A01 = str;
    }

    public static void A00(0Aj r2, OVB ovb, String str) {
        r2.AAJ("event", str);
        r2.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ovb.A01);
        r2.AAJ("component", "toggle");
    }

    public final void A01(String str, Boolean bool) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_waverly_ig_event");
        A00(A0e, this, str);
        A0e.AAJ("step", "ig_message_settings");
        A0e.A7p("attempted_toggle_value", bool);
        A0e.AAJ("message_controls_settings_version", "v2");
        A0e.AAJ("error_message", "Eligible For Toggle But No Toggle Value");
        A0e.AAJ("error_identifier", "UNEXPECTED_VALUE");
        A0e.Cgf();
    }
}
