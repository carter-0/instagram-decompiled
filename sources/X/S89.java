package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public abstract class S89 {
    public static Integer A00(String str) {
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("FACEBOOK_APPLICATION_WEB")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("FACEBOOK_APPLICATION_NATIVE")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("FACEBOOK_APPLICATION_SERVICE")) {
            return AnonymousClass05K.A0N;
        }
        if (str.equals("CHROME_CUSTOM_TAB")) {
            return AnonymousClass05K.A0Y;
        }
        if (str.equals("WEB_VIEW")) {
            return AnonymousClass05K.A0j;
        }
        if (str.equals("TEST_USER")) {
            return AnonymousClass05K.A0u;
        }
        if (str.equals("CLIENT_TOKEN")) {
            return AnonymousClass05K.A15;
        }
        if (str.equals("FXCAL")) {
            return AnonymousClass05K.A1F;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FACEBOOK_APPLICATION_WEB";
            case 2:
                return "FACEBOOK_APPLICATION_NATIVE";
            case 3:
                return "FACEBOOK_APPLICATION_SERVICE";
            case 4:
                return "CHROME_CUSTOM_TAB";
            case 5:
                return "WEB_VIEW";
            case 6:
                return "TEST_USER";
            case 7:
                return "CLIENT_TOKEN";
            case 8:
                return "FXCAL";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
