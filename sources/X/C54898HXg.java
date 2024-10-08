package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.HXg  reason: case insensitive filesystem */
public abstract class C54898HXg {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = AnonymousClass000.A00(2130);
                break;
            case 2:
                str = "RESHARE";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
