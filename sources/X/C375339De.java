package X;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: X.9De  reason: invalid class name and case insensitive filesystem */
public final class C375339De implements AnonymousClass9DW {
    public final /* bridge */ /* synthetic */ Object BHx(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
