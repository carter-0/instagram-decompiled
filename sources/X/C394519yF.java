package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9yF  reason: invalid class name and case insensitive filesystem */
public abstract class C394519yF {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "library";
            case 2:
                return "3rd_party";
            case 3:
                return "archive_reel_share";
            case 4:
                return "poll_result_share";
            case 5:
                return C273654mx.A00(378);
            case 6:
                return "feed_post_reshare";
            case 7:
                return "reel_clips_reshare";
            case 8:
                return "reel_igtv_reshare";
            case 9:
                return "visual_reply_remix";
            case 10:
                return C273654mx.A00(3193);
            case 11:
                return "archive_on_this_day_reshare";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "activity_feed_on_this_day_reshare";
            case 13:
                return C273654mx.A00(2201);
            case 14:
                return AnonymousClass000.A00(3641);
            case 15:
                return C273654mx.A00(3158);
            case 16:
                return C273654mx.A00(3355);
            case 17:
                return C273654mx.A00(1011);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "shoutout_share";
            case 19:
                return "guide_share";
            case 20:
                return "voting_share";
            case 21:
                return AnonymousClass000.A00(3347);
            case 22:
                return "info_center_fact_share";
            case 23:
                return "standalone_fundraiser_sticker_from_bloks";
            case 24:
                return C273654mx.A00(2419);
            case 25:
                return "remix_reply_reshare";
            case 26:
                return "unknown";
            default:
                return "camera";
        }
    }
}
