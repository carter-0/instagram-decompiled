package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: X.97j  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3738997j implements C3739097k {
    public final AnonymousClass97G AMH(AnonymousClass983 r6, Integer num) {
        AnonymousClass981 r62 = (AnonymousClass981) r6;
        AnonymousClass97I r0 = AnonymousClass97L.A03;
        int i = r62.A00;
        if (i == 64) {
            C375079Cd A00 = C375079Cd.A00(i);
            if (i == A00.A00.A00.length) {
                if (r62.A00()) {
                    if (num == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                } else if (num != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                return new AnonymousClass97N(r62, C375099Cg.A00(r62, num), A00, num);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new InvalidAlgorithmParameterException(002.A0n("invalid key size: ", ". Valid keys must have ", " bytes.", i, 64));
    }
}
