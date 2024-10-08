package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5wE  reason: invalid class name and case insensitive filesystem */
public final class C299925wE {
    public final Map A00;
    public final Map A01;

    public C299925wE() {
        C299915wD[] values = C299915wD.values();
        0qQ.A0B(values, 1);
        int A0L = 0se.A0L(r6);
        A0L = A0L < 16 ? 16 : A0L;
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C299915wD r1 : values) {
            linkedHashMap.put(r1.A01, r1);
        }
        this.A00 = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(A0L);
        for (C299915wD r12 : values) {
            linkedHashMap2.put(Integer.valueOf(r12.A00), r12);
        }
        this.A01 = linkedHashMap2;
    }
}
