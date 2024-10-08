package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.KqY  reason: case insensitive filesystem */
public abstract class C63043KqY {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        if (1 != intValue) {
            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        } else {
            str = "FIRST_TIME_BONUS";
        }
        return C51966G9m.A04(str, intValue);
    }
}
