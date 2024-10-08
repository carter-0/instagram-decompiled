package X;

import java.util.HashMap;

/* renamed from: X.9sU  reason: invalid class name and case insensitive filesystem */
public enum C391189sU {
    DHKEM_P256_SHA256(16, 32),
    DHKEM_P384_SHA384(17, 48),
    DHKEM_P512_SHA512(18, 64),
    DHKEM_X25519_SHA256(32, 32);
    
    public static final HashMap A02 = null;
    public final int A00;
    public final int A01;

    /* access modifiers changed from: public */
    static {
        A02 = AnonymousClass7TE.A1E();
        for (C391189sU r2 : values()) {
            A02.put(Integer.valueOf(r2.A01), r2);
        }
    }

    /* access modifiers changed from: public */
    C391189sU(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
