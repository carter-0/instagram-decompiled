package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2hT  reason: invalid class name and case insensitive filesystem */
public enum C226612hT {
    INAPPLICABLE("-2"),
    UNKNOWN("-1"),
    AD("4"),
    INSTAGRAM_PHOTO("15"),
    INSTAGRAM_VIDEO("16"),
    INSTAGRAM_PROFILE_PIC("19");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C226612hT[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C226612hT r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C226612hT(String str) {
        this.A00 = str;
    }
}
