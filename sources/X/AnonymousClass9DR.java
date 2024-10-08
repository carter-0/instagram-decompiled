package X;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9DR  reason: invalid class name */
public final class AnonymousClass9DR implements AnonymousClass97H {
    public static final C3739197l A03 = C3739197l.A00;
    public static final Collection A04 = Arrays.asList(new Integer[]{64});
    public static final byte[] A05 = new byte[16];
    public final AnonymousClass9DS A00;
    public final byte[] A01;
    public final byte[] A02;

    public final byte[] AOI(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.A02;
        int length2 = bArr3.length;
        int i = length2 + 16;
        if (length < i) {
            throw new GeneralSecurityException("Ciphertext too short.");
        } else if (C3740397x.A02(bArr3, bArr)) {
            Cipher cipher = (Cipher) AnonymousClass9DU.A01.A00.BHw("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i);
            byte[] bArr4 = (byte[]) copyOfRange.clone();
            bArr4[8] = (byte) (bArr4[8] & Byte.MAX_VALUE);
            bArr4[12] = (byte) (bArr4[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.A01, "AES"), new IvParameterSpec(bArr4));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i, length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                doFinal = new byte[0];
            }
            if (MessageDigest.isEqual(copyOfRange, A00(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        } else {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    public final byte[] ASE(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) AnonymousClass9DU.A01.A00.BHw("AES/CTR/NoPadding");
            byte[] A002 = A00(bArr2, bArr);
            byte[] bArr3 = (byte[]) A002.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.A01, "AES"), new IvParameterSpec(bArr3));
            return C375459Dq.A04(this.A02, A002, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    private byte[] A00(byte[]... bArr) {
        byte[] bArr2;
        AnonymousClass9DS r7 = this.A00;
        byte[] AIg = r7.AIg(A05, 16);
        byte[] bArr3 = bArr[0];
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] A022 = C375459Dq.A02(C375349Df.A00(AIg), r7.AIg(bArr3, 16));
        byte[] bArr4 = bArr[1];
        int length = bArr4.length;
        if (length >= 16) {
            int length2 = A022.length;
            if (length >= length2) {
                int i = length - length2;
                bArr2 = Arrays.copyOf(bArr4, length);
                for (int i2 = 0; i2 < length2; i2++) {
                    int i3 = i + i2;
                    bArr2[i3] = (byte) (bArr2[i3] ^ A022[i2]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else {
            byte[] copyOf = Arrays.copyOf(bArr4, 16);
            copyOf[length] = Byte.MIN_VALUE;
            bArr2 = C375459Dq.A02(copyOf, C375349Df.A00(A022));
        }
        return r7.AIg(bArr2, 16);
    }

    public AnonymousClass9DR(C3740497y r4, byte[] bArr) {
        if (A03.A00()) {
            Collection collection = A04;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i = length / 2;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.A01 = Arrays.copyOfRange(bArr, i, length);
                this.A00 = new AnonymousClass9DS(copyOfRange);
                this.A02 = r4.A01();
                return;
            }
            throw new InvalidKeyException(002.A0c("invalid key size: ", " bytes; key must have 64 bytes", length));
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }
}
