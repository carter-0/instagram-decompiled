package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8CA  reason: invalid class name */
public enum AnonymousClass8CA {
    NONE(0),
    WEB_URL(1),
    IGTV(2),
    BUSINESS_TRANSACTION(3),
    AR_EFFECT(4),
    PROFILE_SHOP(5),
    SHOPPING_PRODUCT(7),
    SHOPPING_PRODUCT_COLLECTION(8),
    INSTAGRAM_SHOP(9);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass8CA[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass8CA r1 : values()) {
            linkedHashMap.put(Integer.valueOf(r1.A00), r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass8CA(int i) {
        this.A00 = i;
    }
}
