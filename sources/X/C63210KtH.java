package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.KtH  reason: case insensitive filesystem */
public abstract class C63210KtH {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ALT_TEXT";
            case 2:
                return "AUDIO_FILTERS";
            case 3:
                return "AUTO_SHARING";
            case 4:
                return "SPINS";
            case 5:
                return "ALSO_SHARE_TO_FEED";
            case 6:
                return "AUDIENCE";
            case 7:
                return "AUDIO_TRANSLATION";
            case 8:
                return "BRANDED_CONTENT";
            case 9:
                return "DAISY_CONTROL";
            case 10:
                return "DEAL_SELECTOR";
            case 11:
                return "FUNDRAISER";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "GEO_GATING";
            case 13:
                return "LINK_TO_HIGHLIGHT";
            case 14:
                return "LOCATION";
            case 15:
                return "MEDIA_QUALITY";
            case 16:
                return "META_VERIFIED_ADD_LINK";
            case 17:
                return "MONETIZATION";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "PRIVACY_OPTION";
            case 19:
                return "PRODUCT_TAG";
            case 20:
                return "PROFILE_DISPLAY";
            case 21:
                return "RECOMMEND_ON_FB";
            case 22:
                return "RENAME_ORIGINAL_AUDIO";
            case 23:
                return "SCHEDULED_CONTENT";
            case 24:
                return "SHARE_TO_FB";
            case 25:
                return "SUBSCRIBER_ONLY";
            case 26:
                return "TAG_PEOPLE";
            case 27:
                return "THIRD_PARTY_DOWNLOAD";
            case 28:
                return "TRANSLATION";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return "ADD_MESSAGE";
            case 30:
                return "BIO_PRODUCT";
            case 31:
                return "GEN_AI_LABEL";
            case 32:
                return "TEMPLATES";
            case 33:
                return "DISABLE_COMMENTS";
            case 34:
                return "GIFTS";
            case 35:
                return "ACCESSIBILITY";
            case 36:
                return "TRIALS";
            case 37:
                return "UPCOMING_EVENT";
            case 38:
                return "ADD_CHANNEL";
            case 39:
                return "OPEN_CAROUSEL";
            case 40:
                return "INTERNAL_POST";
            case Seq.NULL_REFNUM:
                return "XPOST_TO";
            case Seq.RefTracker.REF_OFFSET:
                return "BOOST_POST";
            case 43:
                return "ADD_MUSIC";
            case 44:
                return "SHARE_TO_THREADS";
            default:
                return "ADVANCED_SETTINGS";
        }
    }
}
