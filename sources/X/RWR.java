package X;

import com.instagram.react.modules.base.IgReactQEModule;

public abstract class RWR {
    public static String A00(int i) {
        if (i == 1) {
            return "APP_PERFX_IN_SCROLL";
        }
        if (i == 2) {
            return "APP_PERFX_IN_ANIMATION";
        }
        if (i == 3) {
            return "APP_PERFX_IN_GLITCHABLE_PLAYBACK";
        }
        if (i == 5) {
            return "APP_PERFX_TYPING";
        }
        switch (i) {
            case 9:
                return "APP_PERFX_ACTIVITY_FOREGROUND";
            case 10:
                return "APP_PERFX_ACTIVITY_FIRST_FRAME";
            case 11:
                return "APP_PERFX_TAB_FIRST_FRAME";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "APP_PERFX_DIALOG_FIRST_FRAME";
            case 13:
                return "APP_PERFX_FRAGMENT_FIRST_FRAME";
            case 14:
                return "APP_PERFX_IN_CONT_UPDATE";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
