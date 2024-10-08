package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AWs  reason: case insensitive filesystem */
public final class C40228AWs implements YAV {
    public final int A00;

    public final byte[] EKp(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length != this.A00) {
            throw new InvalidAlgorithmParameterException(002.A0O("Unexpected key length: ", length));
        } else if (AnonymousClass9E3.A00.A00()) {
            C374829Ay.A01(length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            if (bArr2.length != 12) {
                throw AnonymousClass7TG.A0q("iv is wrong size");
            } else if (bArr3.length <= 2147483619) {
                AlgorithmParameterSpec A002 = AnonymousClass9E3.A00(bArr2);
                ThreadLocal threadLocal = AnonymousClass9E3.A01;
                ((Cipher) threadLocal.get()).init(1, secretKeySpec, A002);
                return ((Cipher) threadLocal.get()).doFinal(bArr3);
            } else {
                throw AnonymousClass7TG.A0q("plaintext too long");
            }
        } else {
            throw AnonymousClass7TG.A0q("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
    }

    public final byte[] AaA() {
        int i = this.A00;
        if (i == 16) {
            return C21996Xq3.A00;
        }
        if (i == 32) {
            return C21996Xq3.A01;
        }
        throw AnonymousClass7TG.A0q("Could not determine HPKE AEAD ID");
    }

    public final int BK7() {
        return this.A00;
    }

    public C40228AWs(int i) {
        if (i == 16 || i == 32) {
            this.A00 = i;
            return;
        }
        throw new InvalidAlgorithmParameterException(002.A0O(C66579MXk.A00(630), i));
    }
}
