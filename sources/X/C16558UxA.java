package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxA  reason: case insensitive filesystem */
public enum C16558UxA {
    BELOW_THUMBNAIL("below_thumbnail"),
    ON_THUMBNAIL_TOP("on_thumbnail_top"),
    ON_THUMBNAIL_TOP_EMPHASIZED("on_thumbnail_top_emphasized"),
    ON_THUMBNAIL_BOTTOM("on_thumbnail_bottom");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16558UxA[] uxAArr;
        A02 = 0oU.A00(uxAArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16558UxA uxA : values()) {
            linkedHashMap.put(uxA.A00, uxA);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16558UxA(String str) {
        this.A00 = str;
    }
}
