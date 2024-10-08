package X;

import java.nio.ByteBuffer;

/* renamed from: X.6BD  reason: invalid class name */
public final class AnonymousClass6BD extends 2dt implements C303796Au {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        int i2;
        AnonymousClass6B2 r2;
        AnonymousClass6BE[] r11 = (AnonymousClass6BE[]) C303816Aw.A06(AnonymousClass6BE.class, byteBuffer, i, 0);
        if (r11 != null) {
            this.A00 = r10;
            byte[] bArr = new byte[r10];
            this.A02 = bArr;
            this.A01 = 0;
            int i3 = 0;
            for (AnonymousClass6BE r1 : r11) {
                byte b = r1.A00;
                if (b == 0 || b == 1) {
                    i3 += 2;
                } else if (b == 2) {
                    i3 += 4;
                } else if (b == 3) {
                    i3 += 6;
                }
                this.A01 = i3;
            }
            float[] fArr = new float[i3];
            this.A03 = fArr;
            int i4 = 0;
            for (int i5 = 0; i5 < r10; i5++) {
                byte b2 = r11[i5].A00;
                bArr[i5] = b2;
                if (b2 == 0 || b2 == 1) {
                    i2 = i4 + 1;
                    r2 = r11[i5].A03;
                } else if (b2 == 2) {
                    int i6 = i4 + 1;
                    AnonymousClass6BE r3 = r11[i5];
                    AnonymousClass6B2 r22 = r3.A03;
                    fArr[i4] = r22.A00;
                    i4 = i6 + 1;
                    fArr[i6] = r22.A01;
                    i2 = i4 + 1;
                    r2 = r3.A01;
                } else if (b2 == 3) {
                    int i7 = i4 + 1;
                    AnonymousClass6BE r32 = r11[i5];
                    AnonymousClass6B2 r23 = r32.A03;
                    fArr[i4] = r23.A00;
                    int i8 = i7 + 1;
                    fArr[i7] = r23.A01;
                    int i9 = i8 + 1;
                    AnonymousClass6B2 r24 = r32.A01;
                    fArr[i8] = r24.A00;
                    i4 = i9 + 1;
                    fArr[i9] = r24.A01;
                    i2 = i4 + 1;
                    r2 = r32.A02;
                }
                fArr[i4] = r2.A00;
                i4 = i2 + 1;
                fArr[i2] = r2.A01;
            }
        }
    }
}
