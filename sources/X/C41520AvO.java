package X;

import java.security.GeneralSecurityException;

/* renamed from: X.AvO  reason: case insensitive filesystem */
public final class C41520AvO extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            return AnonymousClass9DU.A01.A00.BHw("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
