package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: X.Vu3  reason: case insensitive filesystem */
public abstract class C18551Vu3 {
    public int[] A00;
    public final int A01;

    public static void A00(C18551Vu3 vu3, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) {
        int i;
        int length = bArr.length;
        if (vu3 instanceof C15229UWo) {
            i = 24;
        } else {
            i = 12;
        }
        if (length == i) {
            int remaining = byteBuffer2.remaining();
            int i2 = (remaining / 64) + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                ByteBuffer A012 = vu3.A01(bArr, vu3.A01 + i3);
                int i4 = 64;
                if (i3 == i2 - 1) {
                    i4 = remaining % 64;
                }
                C375459Dq.A00(byteBuffer, byteBuffer2, A012, i4);
            }
            return;
        }
        throw new GeneralSecurityException(002.A0O("The nonce length (in bytes) must be ", i));
    }

    public C18551Vu3(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.A00 = C18793W2a.A03(bArr);
            this.A01 = i;
            return;
        }
        throw new InvalidKeyException(AnonymousClass000.A00(1037));
    }

    public final ByteBuffer A01(byte[] bArr, int i) {
        int i2;
        int[] iArr;
        int[] A03 = C18793W2a.A03(bArr);
        if (this instanceof C15229UWo) {
            int length = A03.length;
            if (length == 6) {
                i2 = 16;
                iArr = new int[16];
                C18793W2a.A02(iArr, C18793W2a.A04(this.A00, A03));
                iArr[12] = i;
                iArr[13] = 0;
                iArr[14] = A03[4];
                iArr[15] = A03[5];
            } else {
                throw Pxf.A0X("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", AnonymousClass7TF.A1b(length * 32));
            }
        } else {
            int length2 = A03.length;
            if (length2 == 3) {
                i2 = 16;
                iArr = new int[16];
                C18793W2a.A02(iArr, this.A00);
                iArr[12] = i;
                System.arraycopy(A03, 0, iArr, 13, length2);
            } else {
                throw Pxf.A0X("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", AnonymousClass7TF.A1b(length2 * 32));
            }
        }
        int[] iArr2 = (int[]) iArr.clone();
        C18793W2a.A00(iArr2);
        int i3 = 0;
        do {
            iArr[i3] = iArr[i3] + iArr2[i3];
            i3++;
        } while (i3 < i2);
        ByteBuffer A12 = Pxg.A12(64);
        A12.asIntBuffer().put(iArr, 0, i2);
        return A12;
    }
}
