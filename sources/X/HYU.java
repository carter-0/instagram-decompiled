package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public abstract class HYU {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "MORE_RESULTS";
                break;
            case 2:
                str = "RETRY";
                break;
            case 3:
                str = "EDIT_PROMPT";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
