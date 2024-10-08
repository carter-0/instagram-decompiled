package X;

import java.security.Provider;
import java.security.Signature;

/* renamed from: X.9Da  reason: invalid class name and case insensitive filesystem */
public final class C375299Da implements AnonymousClass9DW {
    public final /* bridge */ /* synthetic */ Object BHx(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
