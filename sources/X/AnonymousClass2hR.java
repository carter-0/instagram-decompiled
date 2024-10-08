package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2hR  reason: invalid class name */
public enum AnonymousClass2hR {
    INAPPLICABLE("-2"),
    UNKNOWN("-1"),
    HAYSTACK_AD("45"),
    INSTAGRAM_VIDEO("50");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass2hR[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass2hR r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass2hR(String str) {
        this.A00 = str;
    }
}
