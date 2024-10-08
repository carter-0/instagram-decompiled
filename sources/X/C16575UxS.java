package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxS  reason: case insensitive filesystem */
public enum C16575UxS {
    REQUESTED_CHAT("requested_chat"),
    JOINED_CHAT("joined_chat"),
    CHAT_FULL("chat_full"),
    CHAT_ENDED("chat_ended"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16575UxS[] uxSArr;
        A02 = 0oU.A00(uxSArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16575UxS uxS : values()) {
            linkedHashMap.put(uxS.A00, uxS);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16575UxS(String str) {
        this.A00 = str;
    }
}
