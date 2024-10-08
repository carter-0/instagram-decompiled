package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4K5  reason: invalid class name */
public enum AnonymousClass4K5 {
    PRODUCTION(""),
    ENDCARD_AUTOPLAY("endcard_autoplay"),
    THREE_CARDS("three_cards"),
    UP_NEXT_OVERLAY("up_next_overlay"),
    RIFU_OVERLAY("rifu_overlay");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass4K5[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass4K5 r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass4K5(String str) {
        this.A00 = str;
    }
}
