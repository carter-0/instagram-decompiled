package X;

import java.security.GeneralSecurityException;

/* renamed from: X.99P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass99P implements C3739097k {
    public final AnonymousClass97G AMH(AnonymousClass983 r9, Integer num) {
        AnonymousClass99S r3 = (AnonymousClass99S) r9;
        AnonymousClass97I r0 = AnonymousClass99K.A04;
        int i = r3.A00;
        if (i == 16 || i == 32) {
            C375079Cd A00 = C375079Cd.A00(i);
            int i2 = r3.A01;
            C375079Cd A002 = C375079Cd.A00(i2);
            if (i != A00.A00.A00.length) {
                throw new GeneralSecurityException("AES key size mismatch");
            } else if (i2 == A002.A00.A00.length) {
                Integer num2 = num;
                if (r3.A00()) {
                    if (num == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                } else if (num != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                return new AnonymousClass99M(r3, C393219w5.A00(r3, num), A00, A002, num2);
            } else {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
        } else {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }
}
