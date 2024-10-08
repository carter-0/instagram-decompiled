package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public abstract class S9Z {
    public static Integer A00(String str) {
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("EDITABLE")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("SELECTED")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("UNSELECTED")) {
            return AnonymousClass05K.A0N;
        }
        if (str.equals("UNEDITABLE")) {
            return AnonymousClass05K.A0Y;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "EDITABLE";
            case 2:
                return "SELECTED";
            case 3:
                return "UNSELECTED";
            case 4:
                return "UNEDITABLE";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
