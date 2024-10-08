package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public abstract class O24 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "empty_avatar_element";
            case 1:
                return "avatar_effect_element";
            case 2:
                return "switch_effect";
            case 3:
                return "reset";
            case 4:
                return "avatar_status_request_failure";
            case 5:
                return "avatar_effect_status_request_failure";
            case 6:
                return "avatar_metadata_request_failure";
            case 7:
                return "camera_render_failure";
            case 8:
                return "sidebar_avatar_button";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE;
        }
    }
}
