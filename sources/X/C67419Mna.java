package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Mna  reason: case insensitive filesystem */
public abstract class C67419Mna {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "BLENDED";
            case 2:
                return "HASHTAG";
            case 3:
                return "USER";
            case 4:
                return "USER_GRID";
            case 5:
                return "USER_HSCROLL";
            case 6:
                return "PLACE";
            case 7:
                return "KEYWORD";
            case 8:
                return "ECHO";
            case 9:
                return "AUDIO";
            case 10:
                return "CLIPS";
            case 11:
                return "IGTV_PROFILE";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "EFFECT";
            case 13:
                return "SHOPPING_SEARCH";
            case 14:
                return "MAP_QUERY";
            case 15:
                return "MAP_SEARCH";
            case 16:
                return "UNKNOWN";
            case 17:
                return "HCM_AUDIO";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "HCM_META_AI";
            case 19:
                return "HCM_USER";
            case 20:
                return "HCM_THREADS";
            case 21:
                return "HCM_PLACES";
            case 22:
                return "HCM_REELS_TRENDS";
            case 23:
                return "HCM_ACCOUNT";
            case 24:
                return "EMPTY_SERP";
            case 25:
                return "UPSELL";
            case 26:
                return "BARCELONA_TAG";
            case 27:
                return AnonymousClass000.A00(978);
            default:
                return "TYPEAHEAD";
        }
    }
}
