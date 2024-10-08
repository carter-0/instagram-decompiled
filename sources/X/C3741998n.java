package X;

import java.security.GeneralSecurityException;

/* renamed from: X.98n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3741998n implements C3739097k {
    public final AnonymousClass97G AMH(AnonymousClass983 r4, Integer num) {
        C3742798v r42 = (C3742798v) r4;
        AnonymousClass97I r0 = AnonymousClass98X.A04;
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
            return new AnonymousClass98Z(r42, C393269wA.A00(r42, num), A00, num);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
