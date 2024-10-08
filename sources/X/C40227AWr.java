package X;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AWr  reason: case insensitive filesystem */
public final class C40227AWr implements YAV {
    public final int BK7() {
        return 32;
    }

    public final byte[] EKp(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            C3739197l r0 = A24.A00;
            ThreadLocal threadLocal = C40211AWb.A02;
            if (threadLocal.get() == null) {
                AH9 ah9 = new AH9(bArr);
                int length = bArr3.length;
                if (length <= 2147483631) {
                    ByteBuffer allocate = ByteBuffer.allocate(length + 16);
                    ah9.A02(allocate, bArr2, bArr3, bArr4);
                    return allocate.array();
                }
                throw AnonymousClass7TG.A0q("plaintext too long");
            } else if (!A24.A00.A00()) {
                throw AnonymousClass7TG.A0q("Can not use ChaCha20Poly1305 in FIPS-mode.");
            } else if (threadLocal.get() != null) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
                if (bArr2.length == 12) {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                    Cipher cipher = (Cipher) threadLocal.get();
                    cipher.init(1, secretKeySpec, ivParameterSpec);
                    return cipher.doFinal(bArr3);
                }
                throw AnonymousClass7TG.A0q("nonce length must be 12 bytes.");
            } else {
                throw AnonymousClass7TG.A0q("JCE does not support algorithm: ChaCha20-Poly1305");
            }
        } else {
            throw new InvalidAlgorithmParameterException(002.A0O("Unexpected key length: ", 32));
        }
    }

    public final byte[] AaA() {
        return C21996Xq3.A04;
    }
}
