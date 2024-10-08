package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7kU  reason: invalid class name and case insensitive filesystem */
public enum C339977kU {
    HORIZONTAL("HORIZONTAL"),
    VERTICAL("VERTICAL");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C339977kU[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C339977kU r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C339977kU(String str) {
        this.A00 = str;
    }
}
