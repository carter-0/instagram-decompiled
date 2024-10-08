package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import kotlin.Deprecated;
import org.webrtc.EglBase14Impl;

@Deprecated(message = "Do not use this class. Instead use modal fragment navigation: https://www.internalfb.com/intern/wiki/Igs2/Config/Destinations/")
/* renamed from: X.XXm  reason: case insensitive filesystem */
public abstract class C21345XXm {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ACCESSIBILITY_SETTINGS";
            case 2:
                return "ACCOUNTS_CENTER";
            case 3:
                return "ACCOUNT_PRIVACY";
            case 4:
                return "ACCOUNT_STATUS";
            case 5:
                return "ADD_ACCOUNT";
            case 6:
                return "ADD_NEW_PROFESSIONAL_ACCOUNT";
            case 7:
                return "AD_PAYMENTS";
            case 8:
                return "AD_PLACEMENTS";
            case 9:
                return "AVATAR_SETTINGS";
            case 10:
                return "BLOCKED_ACCOUNTS";
            case 11:
                return "BRANDED_CONTENT";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "BUSINESS";
            case 13:
                return "CALLING";
            case 14:
                return "CART";
            case 15:
                return "CREATOR";
            case 16:
                return "DARK_MODE";
            case 17:
                return "DATA_SAVER_OPTIONS";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "FAVORITES";
            case 19:
                return "FOLLOW_AND_INVITE_FRIENDS";
            case 20:
                return "HIDDEN_WORDS";
            case 21:
                return "INSIGHTS";
            case 22:
                return "INTERNAL_SETTINGS";
            case 23:
                return "LANGUAGE_SETTINGS";
            case 24:
                return "LIMITED_INTERACTIONS";
            case 25:
                return "LOGIN_INFO";
            case 26:
                return "LOG_OUT";
            case 27:
                return "LOG_OUT_ALL_ACCOUNTS";
            case 28:
                return "MANAGED_TAGGED_MEDIA";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return "MESSAGES";
            case 30:
                return "META_VERIFIED";
            case 31:
                return "NOTIFICATION_SETTINGS";
            case 32:
                return "PRIVACY_CENTER";
            case 33:
                return "QUIET_MODE";
            case 34:
                return "RESTRICTED_ACCOUNTS";
            case 35:
                return "SAVED";
            case 36:
                return "SCHEDULED_CONTENT";
            case 37:
                return "SHARE_WITH_OTHER_APPS";
            case 38:
                return "SMART_GLASSES_TOOLKIT";
            case 39:
                return "SWITCH_TO_PROFESSIONAL";
            default:
                return "ABOUT";
        }
    }
}
