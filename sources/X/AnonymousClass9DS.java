package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9DS  reason: invalid class name */
public final class AnonymousClass9DS implements AnonymousClass9DT {
    public static final C3739197l A03 = C3739197l.A00;
    public byte[] A00;
    public byte[] A01;
    public final SecretKey A02;

    public final byte[] AIg(byte[] bArr, int i) {
        byte[] A022;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        } else if (A03.A00()) {
            Cipher cipher = (Cipher) AnonymousClass9DU.A01.A00.BHw("AES/ECB/NoPadding");
            cipher.init(1, this.A02);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            int i2 = max * 16;
            int i3 = max - 1;
            int i4 = i3 * 16;
            if (i2 == length) {
                A022 = C375459Dq.A03(bArr, this.A00, i4, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = Byte.MIN_VALUE;
                    A022 = C375459Dq.A02(copyOf, this.A01);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr2 = new byte[16];
            for (int i5 = 0; i5 < i3; i5++) {
                bArr2 = cipher.doFinal(C375459Dq.A03(bArr2, bArr, 0, i5 * 16, 16));
            }
            return Arrays.copyOf(cipher.doFinal(C375459Dq.A02(A022, bArr2)), i);
        } else {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }

    public AnonymousClass9DS(byte[] bArr) {
        C374829Ay.A01(bArr.length);
        this.A02 = new SecretKeySpec(bArr, "AES");
        if (A03.A00()) {
            Cipher cipher = (Cipher) AnonymousClass9DU.A01.A00.BHw("AES/ECB/NoPadding");
            cipher.init(1, this.A02);
            byte[] A002 = C375349Df.A00(cipher.doFinal(new byte[16]));
            this.A00 = A002;
            this.A01 = C375349Df.A00(A002);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
