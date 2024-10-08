package X;

import java.security.GeneralSecurityException;

/* renamed from: X.996  reason: invalid class name */
public final /* synthetic */ class AnonymousClass996 implements C3739097k {
    public final AnonymousClass97G AMH(AnonymousClass983 r4, Integer num) {
        AnonymousClass994 r42 = (AnonymousClass994) r4;
        AnonymousClass97I r0 = AnonymousClass995.A02;
        int i = r42.A00;
        if (i == 32) {
            C375079Cd A00 = C375079Cd.A00(i);
            if (i == A00.A00.A00.length) {
                if (r42.A00()) {
                    if (num == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                } else if (num != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                return new AnonymousClass998(r42, C393259w9.A00(r42, num), A00, num);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
