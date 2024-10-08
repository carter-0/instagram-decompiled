package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Khy  reason: case insensitive filesystem */
public enum C62568Khy {
    NUM_SELECTED_PRODUCTS("num_selected_products"),
    NUM_SELECTED_COLLECTIONS("num_selected_collections"),
    DISABLE_DISCOUNTS_ON_PRODUCTS_SELECTION("disable_discounts_on_products_selection"),
    DISABLE_PRODUCTS_ON_AUTOTAG_DISCOUNT("disable_products_on_autotag_discount"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62568Khy[] khyArr;
        A02 = 0oU.A00(khyArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C62568Khy khy : values()) {
            linkedHashMap.put(khy.A00, khy);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C62568Khy(String str) {
        this.A00 = str;
    }
}
