package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sC  reason: invalid class name and case insensitive filesystem */
public enum C391009sC {
    SIMPLE_CTA_END_CARD("simple_cta_end_card");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391009sC[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391009sC r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C391009sC(String str) {
        this.A00 = str;
    }
}
