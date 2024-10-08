package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

public final class LPH {
    public final C59722JVg A00;
    public final 0wc A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public static void A00(0Aj r2, C59722JVg jVg, Integer num) {
        String str;
        r2.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, jVg.A00);
        switch (num.intValue()) {
            case 0:
                str = "post_share_sheet";
                break;
            case 1:
                str = "reels_share_sheet";
                break;
            case 2:
                str = "schedule_picker";
                break;
            case 3:
                str = "draft_overflow";
                break;
            case 4:
                str = "view_all_scheduled_content";
                break;
            case 5:
                str = "view_single_scheduled_content";
                break;
            case 6:
                str = "remove_facebook_sharing_info";
                break;
            case 7:
                str = "remove_barcelona_sharing_info";
                break;
            case 8:
                str = "remove_draft_fundraiser";
                break;
            case 9:
                str = "remove_shopping_metadata";
                break;
            case 10:
                str = "remove_upcoming_event";
                break;
            case 11:
                str = "remove_selected_users";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str = "remove_branded_content";
                break;
            case 13:
                str = "remove_custom_audience";
                break;
            case 14:
                str = "remove_other";
                break;
            case 15:
                str = "blocked_facebook_sharing_info";
                break;
            case 16:
                str = "blocked_close_friends";
                break;
            case 17:
                str = "blocked_exclusive_content";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                str = "blocked_trials";
                break;
            case 19:
                str = "blocked_custom_audience";
                break;
            case 20:
                str = "blocked_upcoming_events";
                break;
            case 21:
                str = "blocked_audio_translations";
                break;
            case 22:
                str = "blocked_gen_ai_attribution_sticker";
                break;
            case 23:
                str = "blocked_poll";
                break;
            default:
                str = "cancel_scheduling";
                break;
        }
        r2.AAJ("step", str);
    }

    public final void A01(C59722JVg jVg) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "content_scheduling_finish_step");
        if (A0e.isSampled()) {
            DbS.A1N(A0e, jVg.A00);
            DbS.A1H(A0e, "schedule_picker");
            A0e.Cgf();
        }
    }

    public final void A02(C59722JVg jVg) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "content_scheduling_start_step");
        if (A0e.isSampled()) {
            DbS.A1N(A0e, jVg.A00);
            DbS.A1H(A0e, "schedule_picker");
            A0e.Cgf();
        }
    }

    public final void A03(C59722JVg jVg) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "content_scheduling_tap_component");
        if (A0e.isSampled()) {
            DbS.A1N(A0e, jVg.A00);
            DbS.A1H(A0e, "schedule_picker");
            A0e.AAJ("component", "done");
            A0e.Cgf();
        }
    }

    public final void A04(C59722JVg jVg, Integer num) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "content_scheduling_view_component");
        if (A0e.isSampled()) {
            A00(A0e, jVg, num);
            A0e.AAJ("component", "unsupported_features_alert");
            A0e.Cgf();
        }
    }

    public final void A05(Integer num) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "content_scheduling_finish_step");
        if (A0e.isSampled()) {
            A00(A0e, this.A00, num);
            A0e.Cgf();
        }
    }

    public final void A06(Integer num) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "content_scheduling_start_step");
        if (A0e.isSampled()) {
            A00(A0e, this.A00, num);
            A0e.Cgf();
        }
    }

    public final void A07(Integer num) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "content_scheduling_view_component");
        if (A0e.isSampled()) {
            A00(A0e, this.A00, num);
            A0e.AAJ("component", "schedule");
            A0e.Cgf();
        }
    }

    public final void A08(Integer num, Integer num2) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "content_scheduling_tap_component");
        if (A0e.isSampled()) {
            A00(A0e, this.A00, num);
            switch (num2.intValue()) {
                case 0:
                    str = "done";
                    break;
                case 1:
                    str = "schedule";
                    break;
                case 2:
                    str = "single_media";
                    break;
                case 3:
                    str = C273654mx.A00(994);
                    break;
                default:
                    str = "unsupported_features_alert";
                    break;
            }
            A0e.AAJ("component", str);
            A0e.Cgf();
        }
    }

    public LPH(C59722JVg jVg, AnonymousClass0iw r3, UserSession userSession) {
        AnonymousClass7TG.A1Q(userSession, r3);
        this.A00 = jVg;
        this.A03 = userSession;
        this.A02 = r3;
        this.A01 = AnonymousClass0kN.A01(r3, userSession);
    }
}
