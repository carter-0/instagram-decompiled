package X;

import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.VEk  reason: case insensitive filesystem */
public abstract class C17010VEk {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "2";
            case 2:
                return "4";
            case 3:
                return "5";
            default:
                return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
    }
}
