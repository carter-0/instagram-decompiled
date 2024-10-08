package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.HaO  reason: case insensitive filesystem */
public abstract class C54991HaO {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass05K.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "edit";
                    break;
                case 2:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str2 = "retry";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return AnonymousClass05K.A0C;
    }
}
