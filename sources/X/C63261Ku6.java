package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Ku6  reason: case insensitive filesystem */
public abstract class C63261Ku6 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "profile";
            case 1:
                return AnonymousClass000.A00(2907);
            case 2:
                return AnonymousClass000.A00(286);
            case 3:
                return "fan_management_consideration";
            case 4:
                return AnonymousClass000.A00(142);
            case 5:
                return "fan_club_custom_benefits_selection";
            case 6:
                return "subscription_manager";
            case 7:
                return AnonymousClass000.A00(2613);
            case 8:
                return "story_viewer";
            case 9:
                return C273654mx.A00(3371);
            case 10:
                return "edit_story";
            case 11:
                return "camera";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "creator_management_settings";
            case 13:
                return "subscriber_list";
            case 14:
                return "removed_subscriber_list";
            case 15:
                return "feed";
            case 16:
                return "reels_feed";
            case 17:
                return "reels_viewer";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return AnonymousClass000.A00(1278);
            case 19:
                return AnonymousClass000.A00(3508);
            case 20:
                return "creator_settings_fan_club_guided_activation";
            default:
                return "fan_club_guided_activation";
        }
    }
}
