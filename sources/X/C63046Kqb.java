package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Kqb  reason: case insensitive filesystem */
public abstract class C63046Kqb {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "FIRST_TIME_FULL_SCREEN";
                break;
            case 2:
                str = "PERSISTENT_EDUCATION";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
