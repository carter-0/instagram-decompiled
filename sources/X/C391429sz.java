package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9sz  reason: invalid class name and case insensitive filesystem */
public enum C391429sz {
    ;
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391429sz[] r3;
        A02 = 0oU.A00(r3);
        int A0L2 = 0se.A0L(r5);
        if (A0L2 < 16) {
            A0L2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2);
        for (C391429sz r2 : values()) {
            linkedHashMap.put(r2.A00, r2);
        }
        A01 = linkedHashMap;
    }

    public static C391429sz A00(String str, String str2, int i) {
        return new C391429sz(str, i, str2);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C391429sz(String str) {
        this.A00 = str;
    }
}
