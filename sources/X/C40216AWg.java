package X;

import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AWg  reason: case insensitive filesystem */
public final class C40216AWg implements AnonymousClass98Q {
    public static final C3739197l A05 = C3739197l.A00;
    public static final ThreadLocal A06 = new C41522AvQ();
    public static final ThreadLocal A07 = new C41521AvP();
    public final int A00;
    public final SecretKeySpec A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    private byte[] A00(Cipher cipher, byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4 = new byte[16];
        bArr4[15] = (byte) i;
        if (i3 == 0) {
            byte[] bArr5 = this.A02;
            bArr2 = new byte[16];
            int i4 = 0;
            do {
                bArr2[i4] = (byte) (bArr4[i4] ^ bArr5[i4]);
                i4++;
            } while (i4 < 16);
        } else {
            byte[] doFinal = cipher.doFinal(bArr4);
            int i5 = 0;
            while (i3 - i5 > 16) {
                int i6 = 0;
                do {
                    doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
                    i6++;
                } while (i6 < 16);
                doFinal = cipher.doFinal(doFinal);
                i5 += 16;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
            int length = copyOfRange.length;
            if (length == 16) {
                byte[] bArr6 = this.A02;
                bArr3 = new byte[length];
                int i7 = 0;
                do {
                    bArr3[i7] = (byte) (copyOfRange[i7] ^ bArr6[i7]);
                    i7++;
                } while (i7 < length);
            } else {
                bArr3 = Arrays.copyOf(this.A03, 16);
                for (int i8 = 0; i8 < length; i8++) {
                    bArr3[i8] = (byte) (bArr3[i8] ^ copyOfRange[i8]);
                }
                bArr3[length] = (byte) (bArr3[length] ^ 128);
            }
            int length2 = doFinal.length;
            bArr2 = new byte[length2];
            for (int i9 = 0; i9 < length2; i9++) {
                bArr2[i9] = (byte) (doFinal[i9] ^ bArr3[i9]);
            }
        }
        return cipher.doFinal(bArr2);
    }

    public static byte[] A01(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        do {
            i = i2 + 1;
            bArr2[i2] = (byte) (((bArr[i2] << 1) ^ ((bArr[i] & 255) >>> 7)) & 255);
            i2 = i;
        } while (i < 15);
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public final byte[] AOH(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = this.A04;
        int length = bArr5.length;
        if (length != 0) {
            if (C3740397x.A02(bArr5, bArr3)) {
                bArr3 = Arrays.copyOfRange(bArr3, length, bArr3.length);
            } else {
                throw AnonymousClass7TG.A0q("Decryption failed (OutputPrefix mismatch).");
            }
        }
        int length2 = bArr3.length;
        int i = this.A00;
        int i2 = (length2 - i) - 16;
        if (i2 >= 0) {
            Cipher cipher = (Cipher) A07.get();
            SecretKeySpec secretKeySpec = this.A01;
            cipher.init(1, secretKeySpec);
            byte[] A002 = A00(cipher, bArr3, 0, 0, i);
            int i3 = 0;
            if (bArr2 == null) {
                bArr4 = new byte[0];
            }
            byte[] A003 = A00(cipher, bArr4, 1, 0, bArr4.length);
            byte[] A004 = A00(cipher, bArr3, 2, i, i2);
            int i4 = length2 - 16;
            byte b = 0;
            do {
                b = (byte) (b | (((bArr3[i4 + i3] ^ A003[i3]) ^ A002[i3]) ^ A004[i3]));
                i3++;
            } while (i3 < 16);
            if (b == 0) {
                Cipher cipher2 = (Cipher) A06.get();
                cipher2.init(1, secretKeySpec, new IvParameterSpec(A002));
                return cipher2.doFinal(bArr3, i, i2);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw AnonymousClass7TG.A0q("ciphertext too short");
    }

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int length = bArr3.length;
        int i = this.A00;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            int i2 = length + i;
            byte[] bArr5 = new byte[(i2 + 16)];
            byte[] A002 = AnonymousClass9B0.A00(i);
            int i3 = 0;
            System.arraycopy(A002, 0, bArr5, 0, i);
            Cipher cipher = (Cipher) A07.get();
            SecretKeySpec secretKeySpec = this.A01;
            cipher.init(1, secretKeySpec);
            byte[] A003 = A00(cipher, A002, 0, 0, A002.length);
            if (bArr2 == null) {
                bArr4 = new byte[0];
            }
            byte[] A004 = A00(cipher, bArr4, 1, 0, bArr4.length);
            Cipher cipher2 = (Cipher) A06.get();
            cipher2.init(1, secretKeySpec, new IvParameterSpec(A003));
            cipher2.doFinal(bArr3, 0, length, bArr5, i);
            byte[] A005 = A00(cipher, bArr5, 2, i, length);
            do {
                bArr5[i2 + i3] = (byte) ((A004[i3] ^ A003[i3]) ^ A005[i3]);
                i3++;
            } while (i3 < 16);
            byte[] bArr6 = this.A04;
            if (bArr6.length != 0) {
                return C375459Dq.A01(bArr5, bArr6);
            }
            return bArr5;
        }
        throw AnonymousClass7TG.A0q("plaintext too long");
    }

    public C40216AWg(byte[] bArr, byte[] bArr2, int i) {
        if (!A05.A00()) {
            throw AnonymousClass7TG.A0q("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.A00 = i;
            C374829Ay.A01(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.A01 = secretKeySpec;
            Cipher cipher = (Cipher) A07.get();
            cipher.init(1, secretKeySpec);
            byte[] A012 = A01(cipher.doFinal(new byte[16]));
            this.A02 = A012;
            this.A03 = A01(A012);
            this.A04 = bArr2;
        } else {
            throw AnonymousClass7TE.A0w("IV size should be either 12 or 16 bytes");
        }
    }
}
