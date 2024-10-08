package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AWf  reason: case insensitive filesystem */
public final class C40215AWf implements AnonymousClass98Q {
    public static final C3739197l A02 = C3739197l.A00;
    public final byte[] A00;
    public final byte[] A01;

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        if (bArr != null) {
            byte[] A002 = AnonymousClass9B0.A00(24);
            SecretKeySpec A003 = A00(this, A002);
            byte[] bArr4 = new byte[12];
            System.arraycopy(A002, 16, bArr4, 4, 8);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
            Cipher cipher = (Cipher) C40211AWb.A02.get();
            AnonymousClass7TH.A0e(A003, ivParameterSpec, cipher, bArr2, 1);
            int length = bArr.length;
            int outputSize = cipher.getOutputSize(length);
            byte[] bArr5 = this.A01;
            int length2 = bArr5.length;
            if (outputSize <= (Integer.MAX_VALUE - length2) - 24) {
                int i = length2 + 24;
                byte[] copyOf = Arrays.copyOf(bArr5, i + outputSize);
                System.arraycopy(A002, 0, copyOf, length2, 24);
                if (cipher.doFinal(bArr3, 0, length, copyOf, i) == outputSize) {
                    return copyOf;
                }
                throw AnonymousClass7TG.A0q("not enough data written");
            }
            throw AnonymousClass7TG.A0q("plaintext too long");
        }
        throw AnonymousClass7TE.A11("plaintext is null");
    }

    public static SecretKeySpec A00(C40215AWf aWf, byte[] bArr) {
        int[] A04 = C18793W2a.A04(C18793W2a.A03(aWf.A00), C18793W2a.A03(bArr));
        ByteBuffer order = ByteBuffer.allocate(A04.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(A04);
        return new SecretKeySpec(order.array(), "ChaCha20");
    }

    public final byte[] AOH(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.A01;
            int length2 = bArr3.length;
            int i = length2 + 24;
            if (length < i + 16) {
                throw AnonymousClass7TG.A0q("ciphertext too short");
            } else if (C3740397x.A02(bArr3, bArr)) {
                byte[] bArr4 = new byte[24];
                System.arraycopy(bArr, length2, bArr4, 0, 24);
                SecretKeySpec A002 = A00(this, bArr4);
                byte[] bArr5 = new byte[12];
                System.arraycopy(bArr4, 16, bArr5, 4, 8);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
                Cipher cipher = (Cipher) C40211AWb.A02.get();
                AnonymousClass7TH.A0e(A002, ivParameterSpec, cipher, bArr2, 2);
                return cipher.doFinal(bArr, i, (length - length2) - 24);
            } else {
                throw AnonymousClass7TG.A0q("Decryption failed (OutputPrefix mismatch).");
            }
        } else {
            throw AnonymousClass7TE.A11("ciphertext is null");
        }
    }

    public C40215AWf(byte[] bArr, byte[] bArr2) {
        if (!A02.A00()) {
            throw AnonymousClass7TG.A0q("Can not use ChaCha20Poly1305 in FIPS-mode.");
        } else if (C40211AWb.A02.get() == null) {
            throw AnonymousClass7TG.A0q("JCE does not support algorithm: ChaCha20-Poly1305");
        } else if (bArr.length == 32) {
            this.A00 = bArr;
            this.A01 = bArr2;
        } else {
            throw new InvalidKeyException(AnonymousClass000.A00(1037));
        }
    }
}
