package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.4O2  reason: invalid class name */
public abstract class AnonymousClass4O2 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "stories";
            case 2:
                return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            case 3:
                return "live";
            case 4:
                return "live_replay";
            case 5:
                return C273654mx.A00(2983);
            case 6:
                return "direct_audio";
            case 7:
                return "music";
            case 8:
                return "local";
            case 9:
                return "cowatch_local";
            default:
                return "feed";
        }
    }
}
