package X;

import java.security.KeyStore;
import java.security.PublicKey;

public final class S1U {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(new C13998To0(this, 23));
    public final boolean A01;

    public final PublicKey A00(String str) {
        0qQ.A0B(str, 0);
        try {
            KeyStore.Entry A012 = ((S4R) this.A00.getValue()).A00.A01(str);
            if (A012 instanceof KeyStore.PrivateKeyEntry) {
                PublicKey publicKey = ((KeyStore.PrivateKeyEntry) A012).getCertificate().getPublicKey();
                0qQ.A07(publicKey);
                return publicKey;
            }
            throw AnonymousClass7TE.A0z("Attestation key is not PrivateKeyEntry in keystore");
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw new Exception(002.A0g("Unable to get key (keyName=", str, ")"), e);
        } catch (RJV e2) {
            throw new Exception("Failed to retrieve public key", e2);
        }
    }

    public S1U(boolean z) {
        this.A01 = z;
    }
}
