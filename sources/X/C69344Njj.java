package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Njj  reason: case insensitive filesystem */
public enum C69344Njj {
    UNKNOWN("UNKNOWN"),
    APPROVED("APPROVED"),
    DENIED("DENIED"),
    DISMISSED("DISMISSED");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C69344Njj[] njjArr;
        A02 = 0oU.A00(njjArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C69344Njj njj : values()) {
            A0x.put(njj.A00, njj);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C69344Njj(String str) {
        this.A00 = str;
    }
}
