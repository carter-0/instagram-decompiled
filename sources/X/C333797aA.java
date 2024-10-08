package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7aA  reason: invalid class name and case insensitive filesystem */
public enum C333797aA {
    SUBSCRIBERS_ONLY("subscriber_comments_only"),
    NOT_SET("no_filter");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C333797aA[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C333797aA r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C333797aA(String str) {
        this.A00 = str;
    }
}
