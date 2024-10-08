package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8JI  reason: invalid class name */
public enum AnonymousClass8JI {
    REMIX(0, true),
    REFERENCE(1, false),
    SEQUENTIAL_REMIX(2, true),
    TEMPLATE(3, false);
    
    public static final Map A02 = null;
    public final String A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass8JI[] r0;
        A03 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass8JI r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A02 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass8JI(int i, boolean z) {
        this.A00 = r2;
        this.A01 = z;
    }
}
