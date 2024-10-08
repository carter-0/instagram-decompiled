package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.KtB  reason: case insensitive filesystem */
public abstract class C63204KtB {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "TOOL";
                break;
            case 2:
                str = "ADJUST";
                break;
            case 3:
                str = "AUDIO";
                break;
            case 4:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "FILTER";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
