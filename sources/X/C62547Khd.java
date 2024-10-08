package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Khd  reason: case insensitive filesystem */
public enum C62547Khd {
    FILTER(0),
    TRIM(1);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62547Khd[] khdArr;
        A02 = 0oU.A00(khdArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62547Khd khd : values()) {
            C51967G9n.A1O(khd, A0x, khd.A00);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62547Khd(int i) {
        this.A00 = i;
    }
}
