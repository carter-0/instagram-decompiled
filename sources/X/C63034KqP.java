package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.KqP  reason: case insensitive filesystem */
public abstract class C63034KqP {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "approx_earnings";
            case 2:
                return "switch_on";
            case 3:
                return "switch_off_confirmation";
            case 4:
                return "monetisation_status";
            case 5:
                return "payout_account";
            case 6:
                return "learn_more";
            case 7:
                return "turn_on_gifts";
            case 8:
                return "turn_off_gifts";
            case 9:
                return "keep";
            case 10:
                return "exit";
            case 11:
                return "info";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "top_reels";
            case 13:
                return "reel";
            case 14:
                return "in_development";
            case 15:
                return "start_earning";
            case 16:
                return "change_global_gifts_settings";
            case 17:
                return "ok";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "hide_gifts_count";
            default:
                return "unhide_gifts_count";
        }
    }
}
