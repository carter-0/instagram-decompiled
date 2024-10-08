package X;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class AGp {
    public static final C3739197l A03 = C3739197l.A01;
    public static final ThreadLocal A04 = new C41520AvO();
    public final int A00;
    public final int A01;
    public final SecretKeySpec A02;

    public static void A00(AGp aGp, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, boolean z) {
        Cipher cipher = (Cipher) A04.get();
        byte[] bArr4 = new byte[aGp.A01];
        System.arraycopy(bArr3, 0, bArr4, 0, aGp.A00);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        int i4 = 2;
        if (z) {
            i4 = 1;
        }
        cipher.init(i4, aGp.A02, ivParameterSpec);
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw AnonymousClass7TG.A0q("stored output's length does not match input's length");
        }
    }

    public AGp(byte[] bArr, int i) {
        if (A03.A00()) {
            C374829Ay.A01(bArr.length);
            this.A02 = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) A04.get()).getBlockSize();
            this.A01 = blockSize;
            if (i < 12 || i > blockSize) {
                throw AnonymousClass7TG.A0q("invalid IV size");
            }
            this.A00 = i;
            return;
        }
        throw AnonymousClass7TG.A0q("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }
}
