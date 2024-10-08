package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.70E  reason: invalid class name */
public enum AnonymousClass70E {
    CLEAN("clean"),
    CONTROL("control"),
    FAMILIAR("familiar");
    
    public static final Map A01 = null;
    public static final AnonymousClass70E[] A02 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass70E[] r0;
        A03 = 0oU.A00(r0);
        AnonymousClass70E[] values = values();
        A02 = values;
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass70E r1 : values) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass70E(String str) {
        this.A00 = str;
    }
}
