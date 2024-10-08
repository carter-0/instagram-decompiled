package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Ny3  reason: case insensitive filesystem */
public abstract class C70149Ny3 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "HOUR_ONE";
            case 2:
                return "HOUR_SIX";
            case 3:
                return "CUSTOM";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
