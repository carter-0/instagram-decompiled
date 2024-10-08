package X;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: X.9Dc  reason: invalid class name and case insensitive filesystem */
public final class C375319Dc implements AnonymousClass9DW {
    public final /* bridge */ /* synthetic */ Object BHx(String str, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
