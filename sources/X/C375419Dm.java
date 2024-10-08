package X;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9Dm  reason: invalid class name and case insensitive filesystem */
public final class C375419Dm implements AnonymousClass98Q {
    public static final C3739197l A02 = C3739197l.A01;
    public final SecretKey A00;
    public final byte[] A01;

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        if (bArr != null) {
            byte[] A002 = AnonymousClass9B0.A00(12);
            AlgorithmParameterSpec A003 = AnonymousClass9E3.A00(A002);
            Cipher cipher = (Cipher) AnonymousClass9E3.A01.get();
            cipher.init(1, this.A00, A003);
            if (!(bArr2 == null || bArr2.length == 0)) {
                cipher.updateAAD(bArr2);
            }
            int length = bArr.length;
            int outputSize = cipher.getOutputSize(length);
            byte[] bArr4 = this.A01;
            int length2 = bArr4.length;
            if (outputSize <= (Integer.MAX_VALUE - length2) - 12) {
                int i = length2 + 12;
                byte[] copyOf = Arrays.copyOf(bArr4, i + outputSize);
                System.arraycopy(A002, 0, copyOf, length2, 12);
                if (cipher.doFinal(bArr3, 0, length, copyOf, i) == outputSize) {
                    return copyOf;
                }
                throw new GeneralSecurityException("not enough data written");
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new NullPointerException("plaintext is null");
    }

    public static C375419Dm A00(C3744599n r3) {
        C3743299a r2 = r3.A00;
        int i = r2.A00;
        if (i == 12) {
            int i2 = r2.A02;
            if (i2 == 16) {
                return new C375419Dm(r3.A01, r3.A02.A02(C375049Ca.A00));
            }
            throw new GeneralSecurityException(002.A0O("Expected tag Size 16, got ", i2));
        }
        throw new GeneralSecurityException(002.A0O("Expected IV Size 12, got ", i));
    }

    public final byte[] AOH(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.A01;
            int length2 = bArr3.length;
            int i = length2 + 12;
            if (length < i + 16) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (C3740397x.A02(bArr3, bArr)) {
                byte[] bArr4 = new byte[12];
                System.arraycopy(bArr, length2, bArr4, 0, 12);
                AlgorithmParameterSpec A002 = AnonymousClass9E3.A00(bArr4);
                Cipher cipher = (Cipher) AnonymousClass9E3.A01.get();
                cipher.init(2, this.A00, A002);
                if (!(bArr2 == null || bArr2.length == 0)) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, i, (length - length2) - 12);
            } else {
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
        } else {
            throw new NullPointerException("ciphertext is null");
        }
    }

    public C375419Dm(C3740497y r3, byte[] bArr) {
        if (A02.A00()) {
            C374829Ay.A01(bArr.length);
            this.A00 = new SecretKeySpec(bArr, "AES");
            this.A01 = r3.A01();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
