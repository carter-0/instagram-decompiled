package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DeA  reason: case insensitive filesystem */
public enum C46388DeA {
    UNKNOWN(0),
    NEW(1),
    RENEW(2),
    RESURRECTED(3);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C46388DeA[] deAArr;
        A02 = 0oU.A00(deAArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C46388DeA deA : values()) {
            A0x.put(Integer.valueOf(deA.A00), deA);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C46388DeA(int i) {
        this.A00 = i;
    }
}
