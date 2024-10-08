package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6Ov  reason: invalid class name and case insensitive filesystem */
public enum C307106Ov {
    A07(0),
    CHEVRON_AND_TEXT(1),
    CHEVRON_ONLY(2),
    CHEVRON_ONLY_ABOVE_CTA(6),
    PERSIST_CHEVRON_AND_TEXT(1001);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C307106Ov[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C307106Ov r1 : values()) {
            linkedHashMap.put(Integer.valueOf(r1.A00), r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C307106Ov(int i) {
        this.A00 = i;
    }
}
