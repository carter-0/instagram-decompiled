package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Ej3  reason: case insensitive filesystem */
public abstract class C48718Ej3 {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass05K.A00(5)) {
            if (0qQ.A0K(C46644DiP.A04(num), str)) {
                return num;
            }
            switch (num.intValue()) {
                case 1:
                    str2 = "right_in";
                    break;
                case 2:
                    str2 = "right_out";
                    break;
                case 3:
                    str2 = "bottom_in";
                    break;
                case 4:
                    str2 = "cds_fade_in";
                    break;
                default:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return AnonymousClass05K.A00;
    }
}
