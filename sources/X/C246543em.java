package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3em  reason: invalid class name and case insensitive filesystem */
public enum C246543em {
    A07(0),
    BOTTOM_GRADIENT(1),
    BOTTOM_BUTTON(2),
    CORNER_BUTTON(3);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C246543em[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C246543em r1 : values()) {
            linkedHashMap.put(Integer.valueOf(r1.A00), r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C246543em(int i) {
        this.A00 = i;
    }
}
