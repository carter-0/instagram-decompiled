package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public abstract class VB0 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            case 1:
                return "FILL_SCREEN";
            case 2:
                return "SQUARE_CROP";
            default:
                return "CLIP_TRANSFORM";
        }
    }
}
