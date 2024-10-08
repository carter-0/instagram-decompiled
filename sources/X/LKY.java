package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public abstract class LKY {
    public static final Integer[] A00 = AnonymousClass05K.A00(3);

    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "MASK";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "OVERLAY";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
