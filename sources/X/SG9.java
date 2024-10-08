package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;

public final class SG9 {
    public static final Integer A00(Throwable th) {
        if (th instanceof RKD) {
            return AnonymousClass05K.A00;
        }
        if (th instanceof RJY) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0C;
    }

    public final LinkedHashMap A01(Throwable th) {
        String str;
        String str2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (th != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            A1H.put("underlying_error_message", message);
            boolean z = th instanceof RKD;
            if (z) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else if (th instanceof RJY) {
                str = "2";
            } else {
                str = "Unknown";
            }
            A1H.put("error_reason", str);
            if (z) {
                str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else if (th instanceof RJY) {
                str2 = "2";
            } else {
                str2 = "0";
            }
            A1H.put("error_resource", str2);
            String str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            A1H.put("error_severity", str3);
            A1H.put("error_renderer", str3);
            if (!(!(th instanceof RJZ))) {
                str3 = "2";
            }
            A1H.put("error_recoverability", str3);
        }
        return A1H;
    }
}
