package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7di  reason: invalid class name and case insensitive filesystem */
public enum C335897di {
    PRODUCTION(0),
    AUTHOR_LINE(1),
    BOTTOM_ACTION_LINE(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C335897di[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C335897di r1 : values()) {
            linkedHashMap.put(Integer.valueOf(r1.A00), r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C335897di(int i) {
        this.A00 = i;
    }
}
