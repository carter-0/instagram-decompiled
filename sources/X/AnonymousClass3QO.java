package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3QO  reason: invalid class name */
public enum AnonymousClass3QO {
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    CLOSE_FRIENDS("besties"),
    FAN_CLUB("fan_club"),
    ROLL_CALL_FOLLOWERS("followers_only_rollcall"),
    ROLL_CALL_MUTUALS("mutual_followers_rollcall"),
    CUSTOM("custom"),
    FOLLOWERS_ONLY("followers_only"),
    FRIEND_LIST("friend_list"),
    PUBLIC_CHAT("public_chat"),
    HALLPASS("hallpass"),
    SHARE_TO_DIRECT_PREVIEW("share_to_direct_preview"),
    OPAL("opal"),
    MUTUAL_FOLLOWERS("mutual_followers"),
    REPLY_CONTROL("reply_control");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass3QO[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass3QO r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass3QO(String str) {
        this.A00 = str;
    }
}
