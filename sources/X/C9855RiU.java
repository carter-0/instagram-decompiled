package X;

import com.instagram.model.androidlink.AndroidLink;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.RiU  reason: case insensitive filesystem */
public abstract class C9855RiU {
    public static final String A00(AndroidLink androidLink) {
        Integer BMu = androidLink.BMu();
        if (BMu == null) {
            return "";
        }
        switch (((AnonymousClass47L) AnonymousClass47L.A01.get(BMu.intValue())).ordinal()) {
            case 0:
                return "webclick";
            case 1:
                return "appinstall";
            case 2:
                return "deeplink";
            case 3:
                return "phone";
            case 4:
                return "map";
            case 5:
                return "canvas_action";
            case 6:
                return "leadads";
            case 7:
                return "profilevisit";
            case 8:
                return "clicktodirect";
            case 9:
                return "shopping_sheet_action";
            case 10:
                return "mini_shop_storefront";
            case 11:
                return C273654mx.A00(52);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
                return "mini_shop_collection";
            case 14:
                return "igtv_channel";
            case 15:
                return "igtv_video";
            case 16:
                return "clips_viewer_video";
            case 17:
                return AnonymousClass000.A00(1123);
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return AnonymousClass000.A00(2808);
            case 19:
                return "ar_camera";
            case 20:
                return "organic_shop_collection";
            case 21:
                return "join_channel";
            default:
                throw AnonymousClass7TE.A1K();
        }
    }
}
