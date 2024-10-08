package X;

import java.util.HashMap;

/* renamed from: X.9E9  reason: invalid class name */
public enum AnonymousClass9E9 {
    DHKEM_P256_SHA256(16, 32),
    DHKEM_P384_SHA384(17, 48),
    DHKEM_P512_SHA512(18, 64),
    DHKEM_X25519_SHA256(32, 32);
    
    public static final HashMap A02 = null;
    public final int A00;
    public final int A01;

    /* access modifiers changed from: public */
    static {
        AnonymousClass9E9[] r0;
        08f<AnonymousClass9E9> A002 = 0oU.A00(r0);
        A03 = A002;
        A02 = new HashMap();
        for (AnonymousClass9E9 r2 : A002) {
            A02.put(Integer.valueOf(r2.A01), r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass9E9(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
