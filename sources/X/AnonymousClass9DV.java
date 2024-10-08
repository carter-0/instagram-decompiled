package X;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: X.9DV  reason: invalid class name */
public final class AnonymousClass9DV implements AnonymousClass9DW {
    public final /* bridge */ /* synthetic */ Object BHx(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
