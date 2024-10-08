package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5oz  reason: invalid class name and case insensitive filesystem */
public enum C295835oz {
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    TRENDING("trending"),
    TEMPLATES("templates"),
    NEARBY("nearby"),
    CREATOR_INSPIRATION("creator_inspiration");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C295835oz[] r0;
        A02 = 0oU.A00(r0);
        A01 = new HashMap();
        for (C295835oz r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C295835oz(String str) {
        this.A00 = str;
    }
}
