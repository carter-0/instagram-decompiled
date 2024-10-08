package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxY  reason: case insensitive filesystem */
public enum C16579UxY {
    LEGACY_CHAT_STICKER(""),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    SUBSCRIBER("subscriber"),
    DISCOVERABLE("discoverable"),
    BROADCAST("broadcast"),
    AI_AGENT("ai_agent"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16579UxY[] uxYArr;
        A02 = 0oU.A00(uxYArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16579UxY uxY : values()) {
            linkedHashMap.put(uxY.A00, uxY);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16579UxY(String str) {
        this.A00 = str;
    }
}
