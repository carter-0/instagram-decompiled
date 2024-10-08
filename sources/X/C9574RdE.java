package X;

import android.graphics.ImageFormat;
import android.util.Pair;
import java.nio.ByteBuffer;

/* renamed from: X.RdE  reason: case insensitive filesystem */
public abstract class C9574RdE {
    public static final C10843Rz3 A00(C10843Rz3 rz3) {
        int i;
        C10843Rz3 rz32 = rz3;
        C13417TZx[] tZxArr = rz32.A0C;
        int i2 = rz32.A01;
        int i3 = i2;
        if (i2 != 35 || tZxArr == null) {
            byte[] bArr = rz32.A0A;
            if (bArr == null) {
                if (tZxArr == null || tZxArr.length != 3) {
                    bArr = null;
                } else {
                    int i4 = rz32.A03;
                    int i5 = rz32.A00;
                    C13417TZx tZx = tZxArr[0];
                    C13417TZx tZx2 = tZxArr[1];
                    C13417TZx tZx3 = tZxArr[2];
                    0qQ.A0A(tZx);
                    0qQ.A0A(tZx2);
                    0qQ.A0A(tZx3);
                    Slq slq = (Slq) tZx;
                    ByteBuffer byteBuffer = slq.A02;
                    Slq slq2 = (Slq) tZx2;
                    ByteBuffer byteBuffer2 = slq2.A02;
                    Slq slq3 = (Slq) tZx3;
                    ByteBuffer byteBuffer3 = slq3.A02;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(i3);
                    int i6 = bitsPerPixel / 8;
                    int i7 = i4 * i5;
                    bArr = new byte[((bitsPerPixel * i7) / 8)];
                    int i8 = slq2.A01;
                    int i9 = i8;
                    byte[] bArr2 = new byte[i8];
                    byte[] bArr3 = new byte[slq3.A01];
                    int i10 = i7 * i6;
                    int i11 = i10 / 4;
                    int i12 = 0;
                    for (int i13 = 0; i13 < i5; i13++) {
                        int i14 = i6 * i4;
                        byteBuffer.get(bArr, i12, i14);
                        if (i5 - i13 != 1) {
                            byteBuffer.position((byteBuffer.position() + slq.A01) - i14);
                        }
                        i12 += i14;
                        int i15 = i5 / 2;
                        if (i13 < i15) {
                            if (i15 - i13 == 1) {
                                i = ((i4 / 2) - slq2.A00) + 1;
                            } else {
                                i = i9;
                            }
                            byteBuffer2.get(bArr2, 0, i);
                            byteBuffer3.get(bArr3, 0, i);
                            int i16 = i4 / 2;
                            for (int i17 = 0; i17 < i16; i17++) {
                                int i18 = (i13 * i4) / 2;
                                bArr[i10 + i18 + i17] = bArr2[slq2.A00 * i17];
                                bArr[i10 + i11 + i18 + i17] = bArr3[slq3.A00 * i17];
                            }
                        }
                    }
                }
            }
            float[] fArr = rz32.A0B;
            Pair pair = rz32.A05;
            Long l = rz32.A08;
            Float f = rz32.A06;
            Long l2 = rz32.A07;
            long j = rz32.A04;
            boolean z = rz32.A09;
            return new C10843Rz3(pair, f, l, l2, bArr, fArr, tZxArr, i3, rz32.A03, rz32.A00, rz32.A02, j, z);
        }
        ByteBuffer byteBuffer4 = ((Slq) tZxArr[0]).A02;
        ByteBuffer byteBuffer5 = ((Slq) tZxArr[2]).A02;
        int remaining = byteBuffer4.remaining();
        int remaining2 = byteBuffer5.remaining();
        byte[] bArr4 = new byte[(remaining + remaining2)];
        byteBuffer4.get(bArr4, 0, remaining);
        byteBuffer5.get(bArr4, remaining, remaining2);
        float[] fArr2 = rz32.A0B;
        Pair pair2 = rz32.A05;
        Long l3 = rz32.A08;
        Float f2 = rz32.A06;
        Long l4 = rz32.A07;
        long j2 = rz32.A04;
        boolean z2 = rz32.A09;
        return new C10843Rz3(pair2, f2, l3, l4, bArr4, fArr2, tZxArr, 17, rz32.A03, rz32.A00, rz32.A02, j2, z2);
    }
}
