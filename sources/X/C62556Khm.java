package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Khm  reason: case insensitive filesystem */
public enum C62556Khm {
    IN_REVIEW(1),
    MONETIZED(2),
    LITTLE_TO_NO_MONETIZATION(3);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62556Khm[] khmArr;
        A02 = 0oU.A00(khmArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62556Khm khm : values()) {
            C51967G9n.A1O(khm, A0x, khm.A00);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62556Khm(int i) {
        this.A00 = i;
    }
}
