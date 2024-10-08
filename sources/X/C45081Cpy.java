package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Cpy  reason: case insensitive filesystem */
public abstract class C45081Cpy {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass05K.A00(5)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "one_click_checkout";
                    break;
                case 2:
                    str2 = AnonymousClass000.A00(780);
                    break;
                case 3:
                    str2 = "view_in_cart";
                    break;
                case 4:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str2 = "external_link";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return AnonymousClass05K.A00;
    }
}
