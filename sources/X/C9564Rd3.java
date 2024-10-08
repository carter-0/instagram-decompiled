package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Rd3  reason: case insensitive filesystem */
public abstract class C9564Rd3 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "u";
            case 1:
                return "s";
            case 2:
                return "a";
            case 3:
                return "cp";
            case 4:
                return "ecp";
            case 5:
                return "pf";
            case 6:
                return "no_auto_fg";
            case 7:
                return "chat_on";
            case 8:
                return "fg";
            case 9:
                return "d";
            case 10:
                return "ds";
            case 11:
                return "nwt";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "nwst";
            case 13:
                return "mqtt_sid";
            case 14:
                return "st";
            case 15:
                return "ct";
            case 16:
                return "aid";
            case 17:
                return "log";
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return "dc";
            case 19:
                return "h";
            case 20:
                return "fbnsck";
            case 21:
                return "fbnscs";
            case 22:
                return "fbnsdi";
            case 23:
                return "fbnsds";
            case 24:
                return "luid";
            case 25:
                return "clientStack";
            case 26:
                return "app_specific_info";
            default:
                return "nwti";
        }
    }
}
