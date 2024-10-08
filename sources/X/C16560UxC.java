package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxC  reason: case insensitive filesystem */
public enum C16560UxC {
    PRODUCT_DETAILS_PAGE(0),
    ADS_PRODUCT_PAGE(1),
    IN_APP_BROWSER(2),
    SHOPLESS_IN_APP_BROWSER(3);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16560UxC[] uxCArr;
        A02 = 0oU.A00(uxCArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16560UxC uxC : values()) {
            C51967G9n.A1O(uxC, linkedHashMap, uxC.A00);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16560UxC(int i) {
        this.A00 = i;
    }
}
