package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxV  reason: case insensitive filesystem */
public enum C16576UxV {
    PRODUCT("singlebrand_product"),
    MULTI_BRAND("multibrand_product"),
    BRANDS_WITH_PRODUCTS("brands_with_products"),
    RECONSIDERATION_PRODUCTS("reconsideration_products"),
    TAGGED_PRODUCTS("tagged_products"),
    FEATURED_PRODUCTS("featured_products"),
    UNRECOGNIZED("ShoppingPivotItemType_unspecified");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16576UxV[] uxVArr;
        A02 = 0oU.A00(uxVArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16576UxV uxV : values()) {
            linkedHashMap.put(uxV.A00, uxV);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16576UxV(String str) {
        this.A00 = str;
    }
}
