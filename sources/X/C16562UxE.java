package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxE  reason: case insensitive filesystem */
public enum C16562UxE {
    PRODUCT("product"),
    COLLECTION("collection"),
    SELLER("seller"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16562UxE[] uxEArr;
        A02 = 0oU.A00(uxEArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16562UxE uxE : values()) {
            linkedHashMap.put(uxE.A00, uxE);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16562UxE(String str) {
        this.A00 = str;
    }
}
