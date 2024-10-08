package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2mp  reason: invalid class name and case insensitive filesystem */
public abstract class C229092mp {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass05K.A00(2)) {
            if (1 - num.intValue() != 0) {
                str2 = NetInfoModule.CONNECTION_TYPE_NONE;
            } else {
                str2 = "logo";
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return AnonymousClass05K.A00;
    }
}
