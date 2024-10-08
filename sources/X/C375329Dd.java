package X;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: X.9Dd  reason: invalid class name and case insensitive filesystem */
public final class C375329Dd implements AnonymousClass9DW {
    public final /* bridge */ /* synthetic */ Object BHx(String str, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
