package X;

import com.facebook.proxygen.TraceEventType;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.Kqd  reason: case insensitive filesystem */
public abstract class C63048Kqd {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ufi";
            case 1:
                return "reel";
            case 2:
                return "reel_contextual_link";
            case 3:
                return "reel_overflow_menu";
            case 4:
                return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
            case 5:
                return "notification";
            default:
                return TraceEventType.Push;
        }
    }
}
