package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5FH  reason: invalid class name */
public enum AnonymousClass5FH {
    NONE(0),
    INSTALLED(1);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass5FH[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass5FH r1 : values()) {
            linkedHashMap.put(Integer.valueOf(r1.A00), r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass5FH(int i) {
        this.A00 = i;
    }
}
