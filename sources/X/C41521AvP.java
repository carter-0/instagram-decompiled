package X;

import java.security.GeneralSecurityException;

/* renamed from: X.AvP  reason: case insensitive filesystem */
public final class C41521AvP extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            return AnonymousClass9DU.A01.A00.BHw("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
