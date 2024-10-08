package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uz7  reason: case insensitive filesystem */
public enum C16671Uz7 {
    GRID("grid"),
    GRID_WITH_SINGLE_IMAGE_FALLBACK("grid_with_single_image_fallback"),
    HSCROLL("hscroll"),
    PRODUCT_GRID_LIST("product_grid_list"),
    SLIDESHOW("slideshow");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16671Uz7[] uz7Arr;
        A02 = 0oU.A00(uz7Arr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16671Uz7 uz7 : values()) {
            linkedHashMap.put(uz7.A00, uz7);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C16671Uz7(String str) {
        this.A00 = str;
    }
}
