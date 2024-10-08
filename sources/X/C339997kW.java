package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7kW  reason: invalid class name and case insensitive filesystem */
public enum C339997kW {
    ;
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C339997kW[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C339997kW r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C339997kW() {
        this.A00 = "GREEN_SCREEN";
    }
}
