package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxD  reason: case insensitive filesystem */
public enum C16561UxD {
    CART("cart"),
    WISHLIST("wishlist"),
    HISTORY("history"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16561UxD[] uxDArr;
        A02 = 0oU.A00(uxDArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16561UxD uxD : values()) {
            linkedHashMap.put(uxD.A00, uxD);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16561UxD(String str) {
        this.A00 = str;
    }
}
