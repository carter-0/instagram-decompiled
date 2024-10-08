package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.HXe  reason: case insensitive filesystem */
public abstract class C54896HXe {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            case 2:
                str = "TAB_ONLY";
                break;
            default:
                str = "ALL";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
