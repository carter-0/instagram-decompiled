package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.EpX  reason: case insensitive filesystem */
public abstract class C49108EpX {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "login";
            case 2:
                return "create";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE;
        }
    }
}
