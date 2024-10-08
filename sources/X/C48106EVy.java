package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EVy  reason: case insensitive filesystem */
public enum C48106EVy {
    CART("cart"),
    MENU("menu"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C48106EVy[] eVyArr;
        A02 = 0oU.A00(eVyArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C48106EVy eVy : values()) {
            A0x.put(eVy.A00, eVy);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C48106EVy(String str) {
        this.A00 = str;
    }
}
