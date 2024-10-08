package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: X.SAi  reason: case insensitive filesystem */
public abstract class C11107SAi {
    public static final TAG A00(TAG tag) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(tag.A00());
            return C9872Ril.A00(Arrays.copyOf(digest, digest.length));
        } catch (NoSuchAlgorithmException e) {
            throw Pxe.A0e(e);
        }
    }

    public static final TAG A01(X509Certificate x509Certificate) {
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        if (encoded != null) {
            return A00(C9872Ril.A00(Arrays.copyOf(encoded, encoded.length)));
        }
        throw AnonymousClass7TE.A0w("public key doesn't support encoding");
    }
}
