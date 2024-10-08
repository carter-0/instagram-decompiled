package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.JbS  reason: case insensitive filesystem */
public abstract class C59903JbS {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "scene_capture_type";
            case 2:
                return "date_time_original";
            case 3:
                return "date_time_digitized";
            case 4:
                return "software";
            case 5:
                return "maker_note";
            case 6:
                return "camera_make";
            case 7:
                return AnonymousClass000.A00(1155);
            case 8:
                return "xmp_data";
            case 9:
                return "image_description";
            case 10:
                return AnonymousClass000.A00(3325);
            case 11:
                return AnonymousClass000.A00(4758);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "aperture";
            case 13:
                return AnonymousClass000.A00(5259);
            case 14:
                return AnonymousClass000.A00(4787);
            case 15:
                return "flash";
            case 16:
                return "lens_model";
            case 17:
                return "metering_mode";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "focal_plane_x_resolution";
            case 19:
                return "focal_plane_y_resolution";
            case 20:
                return "focal_plane_resolution_unit";
            default:
                return "scene_type";
        }
    }
}
