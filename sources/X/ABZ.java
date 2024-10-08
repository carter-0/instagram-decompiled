package X;

import com.instagram.realtimeclient.RealtimeSubscription;

public abstract class ABZ {
    public static Integer A00(String str) {
        if (str.equals("FXAccountItemEligibilityEligible")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("FXAccountItemEligibilityIneligible")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("FXAccountItemEligibilityNoData")) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            case 2:
                return "2";
            default:
                return "0";
        }
    }
}
