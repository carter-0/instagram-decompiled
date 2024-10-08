package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public abstract class AAD {
    public static Integer A00(String str) {
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("INPUT")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("MODEL")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("INPUT_AND_MODEL")) {
            return AnonymousClass05K.A0N;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INPUT";
            case 2:
                return "MODEL";
            case 3:
                return "INPUT_AND_MODEL";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
