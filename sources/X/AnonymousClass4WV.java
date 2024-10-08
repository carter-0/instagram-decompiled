package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4WV  reason: invalid class name */
public enum AnonymousClass4WV {
    ALMOST_TALL("almost_tall"),
    BALANCED("balanced"),
    RATIO("ratio"),
    PORTRAIT("portrait");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass4WV[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass4WV r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass4WV(String str) {
        this.A00 = str;
    }
}
