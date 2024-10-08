package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public abstract class ABF {
    public static Integer A00(String str) {
        if (str.equals("PUSH")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("MQTT")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MQTT";
            case 2:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            default:
                return "PUSH";
        }
    }
}
