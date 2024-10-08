package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5j7  reason: invalid class name and case insensitive filesystem */
public enum C292535j7 {
    MAJOR("major_unit"),
    MINOR("minor_unit");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C292535j7[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C292535j7 r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C292535j7(String str) {
        this.A00 = str;
    }
}
