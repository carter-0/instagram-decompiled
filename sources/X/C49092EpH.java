package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.EpH  reason: case insensitive filesystem */
public abstract class C49092EpH {
    public static final String A00(G9c g9c, String str) {
        String str2;
        0qQ.A0B(str, 0);
        switch (g9c.BkZ().intValue()) {
            case 1:
                str2 = "avatar_sticker_upsell";
                break;
            case 2:
                str2 = "caption";
                break;
            case 3:
                str2 = AnonymousClass000.A00(1160);
                break;
            case 4:
                str2 = "comments";
                break;
            case 5:
                str2 = "creation_gen_ai";
                break;
            case 6:
                str2 = AnonymousClass000.A00(278);
                break;
            case 7:
                str2 = "dpa";
                break;
            case 8:
                str2 = "fb_xposting_to_ig";
                break;
            case 9:
                str2 = C273654mx.A00(2410);
                break;
            case 10:
                str2 = C273654mx.A00(2414);
                break;
            case 11:
                str2 = "hashtag";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str2 = "location";
                break;
            case 13:
                str2 = "magic_mod";
                break;
            case 14:
                str2 = "mentions";
                break;
            case 15:
                str2 = BaseViewManager.STATE_MIXED;
                break;
            case 16:
                str2 = "more_info";
                break;
            case 17:
                str2 = "polaroid_sticker";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                str2 = "product";
                break;
            case 19:
                str2 = "product_collection";
                break;
            case 20:
                str2 = "reshared_post";
                break;
            case 21:
                str2 = "threads_app_upsell";
                break;
            case 22:
                str2 = "translation";
                break;
            case 23:
                str2 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                break;
            case 24:
                str2 = "wearable";
                break;
            case 25:
                str2 = "superlative";
                break;
            default:
                str2 = "avatar_nux_entry";
                break;
        }
        return 002.A0g(str, "_context_sheet_", str2);
    }
}
