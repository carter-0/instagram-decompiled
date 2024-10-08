package X;

import java.security.GeneralSecurityException;

/* renamed from: X.9E4  reason: invalid class name */
public final class AnonymousClass9E4 extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            return AnonymousClass9DU.A01.A00.BHw("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
