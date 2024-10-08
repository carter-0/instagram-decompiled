package X;

import java.security.GeneralSecurityException;

/* renamed from: X.997  reason: invalid class name */
public final /* synthetic */ class AnonymousClass997 implements AnonymousClass97E {
    public final Object AJN(AnonymousClass97G r3) {
        AnonymousClass998 r32 = (AnonymousClass998) r3;
        AnonymousClass97I r0 = AnonymousClass995.A02;
        if (r32.A00.A00 == 32) {
            return new C40231AWv(r32);
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
