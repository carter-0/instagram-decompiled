package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3sQ  reason: invalid class name and case insensitive filesystem */
public enum C254403sQ {
    MESSAGE_WARNING("message_warning"),
    MESSAGE_SEND_FAILED("message_send_failed"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C254403sQ[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C254403sQ r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C254403sQ(String str) {
        this.A00 = str;
    }
}
