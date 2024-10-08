package X;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AWc  reason: case insensitive filesystem */
public final class C40212AWc implements AnonymousClass98Q {
    public static final ThreadLocal A02 = new C41519AvN();
    public static final byte[] A03 = C374809Aw.A01("46bb91c3c5");
    public static final byte[] A04 = C374809Aw.A01("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] A05 = C374809Aw.A01("bae8e37fc83441b16034566b");
    public static final byte[] A06 = C374809Aw.A01("7a806c");
    public static final byte[] A07 = C374809Aw.A01("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public final SecretKey A00;
    public final byte[] A01;

    public final byte[] AOH(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.A01;
        int length = bArr3.length;
        if (length != 0) {
            if (C3740397x.A02(bArr3, bArr)) {
                bArr = Arrays.copyOfRange(bArr, length, bArr.length);
            } else {
                throw AnonymousClass7TG.A0q("Decryption failed (OutputPrefix mismatch).");
            }
        }
        Cipher cipher = (Cipher) A02.get();
        if (cipher != null) {
            int length2 = bArr.length;
            if (length2 >= 28) {
                AnonymousClass7TH.A0e(this.A00, new GCMParameterSpec(128, bArr, 0, 12), cipher, bArr2, 2);
                return cipher.doFinal(bArr, 12, length2 - 12);
            }
            throw AnonymousClass7TG.A0q("ciphertext too short");
        }
        throw AnonymousClass7TG.A0q("AES GCM SIV cipher is not available or is invalid.");
    }

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        Cipher cipher = (Cipher) A02.get();
        if (cipher != null) {
            byte[] bArr3 = bArr;
            int length = bArr.length;
            if (length <= 2147483619) {
                byte[] bArr4 = new byte[(length + 12 + 16)];
                byte[] A002 = AnonymousClass9B0.A00(12);
                System.arraycopy(A002, 0, bArr4, 0, 12);
                AnonymousClass7TH.A0e(this.A00, new GCMParameterSpec(128, A002, 0, A002.length), cipher, bArr2, 1);
                int doFinal = cipher.doFinal(bArr3, 0, length, bArr4, 12);
                if (doFinal == length + 16) {
                    byte[] bArr5 = this.A01;
                    if (bArr5.length != 0) {
                        return C375459Dq.A01(bArr4, bArr5);
                    }
                    return bArr4;
                }
                throw AnonymousClass7TG.A0q(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
            }
            throw AnonymousClass7TG.A0q("plaintext too long");
        }
        throw AnonymousClass7TG.A0q("AES GCM SIV cipher is not available or is invalid.");
    }

    public C40212AWc(byte[] bArr, byte[] bArr2) {
        this.A01 = bArr2;
        C374829Ay.A01(bArr.length);
        this.A00 = new SecretKeySpec(bArr, "AES");
    }
}
