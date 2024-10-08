package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.Eqx  reason: case insensitive filesystem */
public abstract class C49192Eqx {
    public static final String A00(String str) {
        switch (str.hashCode()) {
            case -309425751:
                if (str.equals("profile")) {
                    return "profile";
                }
                break;
            case -254613841:
                if (str.equals(AnonymousClass000.A00(3852))) {
                    return "story_viewer_list";
                }
                break;
            case 705032657:
                if (str.equals("newsfeed_you")) {
                    return "activity_feed";
                }
                break;
            case 890612334:
                if (str.equals("self_comments_v2_feed_contextual_self_profile")) {
                    return "report";
                }
                break;
            case 1518401927:
                if (str.equals(C66579MXk.A00(731))) {
                    return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
                }
                break;
        }
        return str;
    }
}
