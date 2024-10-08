package X;

import java.security.GeneralSecurityException;

/* renamed from: X.99p  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3744799p implements C3739097k {
    public final AnonymousClass97G AMH(AnonymousClass983 r4, Integer num) {
        C3743299a r42 = (C3743299a) r4;
        AnonymousClass97I r0 = C3744399l.A04;
        int i = r42.A01;
        if (i != 24) {
            C375079Cd A00 = C375079Cd.A00(i);
            if (i == A00.A00.A00.length) {
                if (r42.A00()) {
                    if (num == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                } else if (num != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                return new C3744599n(r42, AnonymousClass9DQ.A00(r42, num), A00, num);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }
}
