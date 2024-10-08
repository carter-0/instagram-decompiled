package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3mJ  reason: invalid class name and case insensitive filesystem */
public enum C250943mJ {
    UNKNOWN(0),
    MULTIPLE_CHOICE(1),
    SHORT_ANSWER(2),
    CONTACT_INFO(3),
    GENERIC_OFFSITE(4);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        C250943mJ[] r0;
        08f A002 = 0oU.A00(r0);
        A02 = A002;
        int A0L = 0se.A0L(0Yv.A1E(A002, 10));
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (Object next : A002) {
            linkedHashMap.put(Integer.valueOf(((C250943mJ) next).A00), next);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C250943mJ(int i) {
        this.A00 = i;
    }
}
