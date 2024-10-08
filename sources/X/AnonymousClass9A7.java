package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9A7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9A7 implements C3739097k {
    public final AnonymousClass97G AMH(AnonymousClass983 r4, Integer num) {
        AnonymousClass9AB r42 = (AnonymousClass9AB) r4;
        AnonymousClass97I r0 = AnonymousClass9A4.A03;
        int i = r42.A00;
        C375079Cd A00 = C375079Cd.A00(i);
        if (i == A00.A00.A00.length) {
            if (r42.A00()) {
                if (num == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
            } else if (num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new AnonymousClass9A6(r42, C393239w7.A00(r42, num), A00, num);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
