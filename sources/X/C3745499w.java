package X;

import java.security.GeneralSecurityException;

/* renamed from: X.99w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3745499w implements AnonymousClass97E {
    public final Object AJN(AnonymousClass97G r5) {
        C3745599x r52 = (C3745599x) r5;
        if (C40216AWg.A05.A00()) {
            C3743599d r2 = r52.A00;
            int i = r2.A02;
            if (i == 16) {
                return new C40216AWg(r52.A02.A02(C375049Ca.A00), r52.A01.A01(), r2.A00);
            }
            throw new GeneralSecurityException(002.A0O("AesEaxJce only supports 16 byte tag size, not ", i));
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }
}
