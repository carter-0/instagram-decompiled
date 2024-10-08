package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: X.9Dq  reason: invalid class name and case insensitive filesystem */
public abstract class C375459Dq {
    public static final byte[] A02(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return A03(bArr, bArr2, 0, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] A03(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        if (bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    public static byte[] A04(byte[]... bArr) {
        int i = 0;
        int i2 = 0;
        while (i < r6) {
            byte[] bArr2 = bArr[i];
            if (i2 <= Integer.MAX_VALUE - bArr2.length) {
                i2 += bArr2.length;
                i++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
            i3 += bArr4.length;
        }
        return bArr3;
    }

    public static final void A00(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] A01(Object obj, byte[] bArr) {
        return A04(bArr, (byte[]) obj);
    }
}
