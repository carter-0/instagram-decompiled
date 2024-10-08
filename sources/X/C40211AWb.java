package X;

import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AWb  reason: case insensitive filesystem */
public final class C40211AWb implements AnonymousClass98Q {
    public static final ThreadLocal A02 = new C41518AvM();
    public static final byte[] A03 = C374809Aw.A01("a0784d7a4716f3feb4f64e7f4b39bf04");
    public static final byte[] A04 = C374809Aw.A01("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] A05 = C374809Aw.A01("070000004041424344454647");
    public static final C3739197l A06 = C3739197l.A00;
    public final SecretKey A00;
    public final byte[] A01;

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        if (bArr != null) {
            byte[] A002 = AnonymousClass9B0.A00(12);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(A002);
            Cipher cipher = (Cipher) A02.get();
            AnonymousClass7TH.A0e(this.A00, ivParameterSpec, cipher, bArr2, 1);
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
                throw AnonymousClass7TG.A0q("not enough data written");
            }
            throw AnonymousClass7TG.A0q("plaintext too long");
        }
        throw AnonymousClass7TE.A11("plaintext is null");
    }

    public final byte[] AOH(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.A01;
            int length2 = bArr3.length;
            int i = length2 + 12;
            if (length < i + 16) {
                throw AnonymousClass7TG.A0q("ciphertext too short");
            } else if (C3740397x.A02(bArr3, bArr)) {
                byte[] bArr4 = new byte[12];
                System.arraycopy(bArr, length2, bArr4, 0, 12);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
                Cipher cipher = (Cipher) A02.get();
                AnonymousClass7TH.A0e(this.A00, ivParameterSpec, cipher, bArr2, 2);
                return cipher.doFinal(bArr, i, (length - length2) - 12);
            } else {
                throw AnonymousClass7TG.A0q("Decryption failed (OutputPrefix mismatch).");
            }
        } else {
            throw AnonymousClass7TE.A11("ciphertext is null");
        }
    }

    public C40211AWb(byte[] bArr, byte[] bArr2) {
        if (!A06.A00()) {
            throw AnonymousClass7TG.A0q("Can not use ChaCha20Poly1305 in FIPS-mode.");
        } else if (A02.get() == null) {
            throw AnonymousClass7TG.A0q("JCE does not support algorithm: ChaCha20-Poly1305");
        } else if (bArr.length == 32) {
            this.A00 = new SecretKeySpec(bArr, "ChaCha20");
            this.A01 = bArr2;
        } else {
            throw new InvalidKeyException(AnonymousClass000.A00(1037));
        }
    }
}
