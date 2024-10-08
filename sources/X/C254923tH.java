package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3tH  reason: invalid class name and case insensitive filesystem */
public enum C254923tH {
    DJANGO("ig_django"),
    MI("ig_messenger_infra"),
    ACT("ig_advanced_crypto_transport"),
    DJANGO_ACT_MIXED("ig_django_msys_mixed");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C254923tH[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C254923tH r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    public final boolean A00() {
        if (this == ACT || this == MI) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: public */
    C254923tH(String str) {
        this.A00 = str;
    }
}
