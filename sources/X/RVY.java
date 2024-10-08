package X;

import com.facebook.react.modules.statusbar.StatusBarModule;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

public abstract class RVY {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return StatusBarModule.HEIGHT_KEY;
            case 2:
                return "MIN_WIDTH";
            case 3:
                return "MAX_WIDTH";
            case 4:
                return "MIN_HEIGHT";
            case 5:
                return "MAX_HEIGHT";
            case 6:
                return "PADDING_START";
            case 7:
                return "PADDING_TOP";
            case 8:
                return "PADDING_END";
            case 9:
                return "PADDING_BOTTOM";
            case 10:
                return "PADDING_LEFT";
            case 11:
                return "PADDING_RIGHT";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "PADDING_HORIZONTAL";
            case 13:
                return "PADDING_VERTICAL";
            case 14:
                return "PADDING_ALL";
            case 15:
                return "MARGIN_START";
            case 16:
                return "MARGIN_TOP";
            case 17:
                return "MARGIN_END";
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return "MARGIN_BOTTOM";
            case 19:
                return "MARGIN_LEFT";
            case 20:
                return "MARGIN_RIGHT";
            case 21:
                return "MARGIN_HORIZONTAL";
            case 22:
                return "MARGIN_VERTICAL";
            case 23:
                return "MARGIN_ALL";
            default:
                return "WIDTH";
        }
    }
}
