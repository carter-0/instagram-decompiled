package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxB  reason: case insensitive filesystem */
public enum C16559UxB {
    UNRECOGNIZED("ProductRelationType_unspecified"),
    TAGGED_PRODUCT("tagged_product"),
    SAME_MERCHANT("same_merchant"),
    SHOP_SIMILAR("shop_similar");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16559UxB[] uxBArr;
        A02 = 0oU.A00(uxBArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16559UxB uxB : values()) {
            linkedHashMap.put(uxB.A00, uxB);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16559UxB(String str) {
        this.A00 = str;
    }
}
