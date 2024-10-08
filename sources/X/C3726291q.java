package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.91q  reason: invalid class name and case insensitive filesystem */
public final class C3726291q {
    public final 0wc A00;

    public final void A00(C391519tD r4, String str) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_upsell");
        if (A002.isSampled()) {
            A002.AAJ("open_thread_id", str);
            A002.A8M(r4, "action");
            A002.AAJ(AnonymousClass000.A00(92), "fan_club_bc_upsell_messaging_led_banner_key");
            A002.A8M(C69434Nle.DIALOG, "upsell_layout");
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) null);
            A002.A7p("is_showing_another_upsell", (Boolean) null);
            A002.Cgf();
        }
    }

    public final void A01(C391519tD r4, String str, String str2) {
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "direct_upsell");
        if (A002.isSampled()) {
            A002.AAJ("open_thread_id", str);
            A002.A8M(r4, "action");
            A002.AAJ(AnonymousClass000.A00(92), "fan_club_bc_upsell_dialog_key");
            A002.A8M(C69434Nle.DIALOG, "upsell_layout");
            A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            A002.A7p("is_showing_another_upsell", (Boolean) null);
            A002.Cgf();
        }
    }

    public C3726291q(UserSession userSession) {
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "direct_upsell";
        this.A00 = r1.A00();
    }
}
