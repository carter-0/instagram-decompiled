package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HMf  reason: case insensitive filesystem */
public enum C54648HMf {
    A04(0),
    PERSISTENT(1),
    PAUSED_ONLY(2);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C54648HMf[] hMfArr;
        A02 = 0oU.A00(hMfArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C54648HMf hMf : values()) {
            C51967G9n.A1O(hMf, A0x, hMf.A00);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C54648HMf(int i) {
        this.A00 = i;
    }
}
