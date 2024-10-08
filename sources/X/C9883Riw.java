package X;

/* renamed from: X.Riw  reason: case insensitive filesystem */
public abstract class C9883Riw {
    public static void A00(C12824T8t t8t, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = t8t.A05;
            int i2 = t8t.A01;
            int i3 = i2;
            int i4 = t8t.A00;
            while (i2 < i4) {
                int i5 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i5]);
                i2++;
                i = i5 + 1;
            }
            long j2 = t8t.A02;
            if (j2 == t8t.A03.A00) {
                throw Pxe.A0i();
            } else if (j2 == -1) {
                j = 0;
            } else {
                j = j2 + ((long) (i4 - i3));
            }
        } while (t8t.A00(j) != -1);
    }
}
