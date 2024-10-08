package X;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Locale;

public final class S4R {
    public static S4R A02;
    public final SID A00 = new SID();
    public final boolean A01;

    public S4R(boolean z) {
        this.A01 = z;
    }

    public final String A00() {
        KeyStore.Entry A012 = this.A00.A01("w6CmevIyM/PL6Q5uUDw=");
        try {
            if (A012 instanceof KeyStore.PrivateKeyEntry) {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(((KeyStore.PrivateKeyEntry) A012).getCertificate().getPublicKey().getEncoded());
                byte[] digest = instance.digest();
                StringBuilder A1A = AnonymousClass7TE.A1A();
                for (byte valueOf : digest) {
                    A1A.append(String.format(Locale.US, "%02x", new Object[]{Byte.valueOf(valueOf)}));
                }
                return A1A.toString();
            }
            throw AnonymousClass7TE.A0z("Attestation key is not PrivateKeyEntry in keystore");
        } catch (IllegalArgumentException | IllegalStateException | GeneralSecurityException e) {
            throw new Exception("Unable to get key hash", e);
        }
    }

    public final byte[] A01(RDV rdv, String str, byte[] bArr) {
        KeyStore.Entry A012 = this.A00.A01(str);
        try {
            if (A012 instanceof KeyStore.PrivateKeyEntry) {
                Signature instance = Signature.getInstance(rdv.A00);
                instance.initSign(((KeyStore.PrivateKeyEntry) A012).getPrivateKey());
                instance.update(bArr);
                return instance.sign();
            }
            throw AnonymousClass7TE.A0z("Attestation key is not PrivateKeyEntry in keystore");
        } catch (IllegalArgumentException | IllegalStateException | GeneralSecurityException e) {
            throw new Exception("Unable to sign data", e);
        }
    }
}
