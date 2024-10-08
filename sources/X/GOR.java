package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public abstract class GOR {
    public static String A00(Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                i = 2195;
                break;
            case 2:
                i = 2506;
                break;
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
        return AnonymousClass000.A00(i);
    }
}
