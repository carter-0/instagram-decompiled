package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* renamed from: X.W2a  reason: case insensitive filesystem */
public abstract class C18793W2a {
    public static final int[] A00 = A03(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void A00(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            A01(iArr, 0, 4, 8, 12);
            A01(iArr, 1, 5, 9, 13);
            A01(iArr, 2, 6, 10, 14);
            A01(iArr, 3, 7, 11, 15);
            A01(iArr, 0, 5, 10, 15);
            A01(iArr, 1, 6, 11, 12);
            A01(iArr, 2, 7, 8, 13);
            A01(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] A03(byte[] bArr) {
        if (bArr.length % 4 == 0) {
            IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            int[] iArr = new int[asIntBuffer.remaining()];
            asIntBuffer.get(iArr);
            return iArr;
        }
        throw new IllegalArgumentException("invalid input length");
    }

    public static void A01(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> -16) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> -12) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> -8) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> -7) | (i15 << 7);
    }

    public static void A02(int[] iArr, int[] iArr2) {
        int[] iArr3 = A00;
        int length = iArr3.length;
        System.arraycopy(iArr3, 0, iArr, 0, length);
        System.arraycopy(iArr2, 0, iArr, length, 8);
    }

    public static int[] A04(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        A02(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        A00(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }
}
