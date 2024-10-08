package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.57K  reason: invalid class name */
public enum AnonymousClass57K {
    AT_SHOP("at_shop"),
    DROP("drop"),
    DROP_V2("drop_v2"),
    SALE("sale"),
    SELLER_CURATED("seller_curated"),
    SELLER_CURATED_V2("seller_curated_v2"),
    DISCOUNT("discount"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass57K[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass57K r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass57K(String str) {
        this.A00 = str;
    }
}
