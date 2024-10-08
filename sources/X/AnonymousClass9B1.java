package X;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* renamed from: X.9B1  reason: invalid class name */
public final class AnonymousClass9B1 extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
        } catch (GeneralSecurityException unused) {
            try {
                secureRandom = SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
            } catch (GeneralSecurityException unused2) {
                try {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                } catch (GeneralSecurityException unused3) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName(Pxd.A00(255)).getMethod("newProvider", new Class[0]).invoke((Object) null, new Object[0]));
                    } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                        throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                    } catch (GeneralSecurityException unused4) {
                        secureRandom = new SecureRandom();
                    }
                }
            }
        }
        secureRandom.nextLong();
        return secureRandom;
    }
}
