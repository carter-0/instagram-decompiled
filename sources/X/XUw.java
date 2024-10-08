package X;

import com.instagram.react.modules.base.IgReactQEModule;

public abstract class XUw {
    public static byte A00(byte b) {
        switch (b) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 6:
                return 6;
            case 8:
            case 16:
                return 8;
            case 10:
                return 10;
            case 11:
            case 20:
                return 11;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 19:
                return 19;
            default:
                throw DbW.A0a("type=", b);
        }
    }
}
