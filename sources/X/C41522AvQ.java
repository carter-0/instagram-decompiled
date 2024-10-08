package X;

import java.security.GeneralSecurityException;

/* renamed from: X.AvQ  reason: case insensitive filesystem */
public final class C41522AvQ extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            return AnonymousClass9DU.A01.A00.BHw("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
