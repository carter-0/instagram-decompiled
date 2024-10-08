package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.SFt  reason: case insensitive filesystem */
public final class C11219SFt {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final String A0A;
    public final List A0B;

    public static C11219SFt A00(C11389SRd sRd) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        C11389SRd sRd2 = sRd;
        try {
            int A072 = (Pxf.A07(sRd2, 4) & 3) + 1;
            if (A072 != 3) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                int A052 = sRd2.A05() & 31;
                for (int i8 = 0; i8 < A052; i8++) {
                    int A082 = sRd2.A08();
                    int i9 = sRd2.A01;
                    sRd2.A0P(A082);
                    byte[] bArr = sRd2.A02;
                    byte[] bArr2 = new byte[(A082 + 4)];
                    System.arraycopy(SCR.A00, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i9, bArr2, 4, A082);
                    A1C.add(bArr2);
                }
                int A053 = sRd2.A05();
                for (int i10 = 0; i10 < A053; i10++) {
                    int A083 = sRd2.A08();
                    int i11 = sRd2.A01;
                    sRd2.A0P(A083);
                    byte[] bArr3 = sRd2.A02;
                    byte[] bArr4 = new byte[(A083 + 4)];
                    System.arraycopy(SCR.A00, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i11, bArr4, 4, A083);
                    A1C.add(bArr4);
                }
                String str = null;
                int i12 = -1;
                if (A052 > 0) {
                    C10842Rz2 A032 = SS3.A03((byte[]) A1C.get(0), A072 + 1, ((byte[]) A1C.get(0)).length);
                    i3 = A032.A0C;
                    i12 = A032.A07;
                    i2 = A032.A02 + 8;
                    i = A032.A01 + 8;
                    i4 = A032.A04;
                    i5 = A032.A03;
                    i6 = A032.A05;
                    i7 = A032.A09;
                    f = A032.A00;
                    str = String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(A032.A0A), Integer.valueOf(A032.A06), Integer.valueOf(A032.A08)});
                } else {
                    i3 = -1;
                    i2 = -1;
                    i = -1;
                    i4 = -1;
                    i5 = -1;
                    i6 = -1;
                    i7 = 16;
                    f = 1.0f;
                }
                return new C11219SFt(str, A1C, f, A072, i3, i12, i2, i, i4, i5, i6, i7);
            }
            throw Pxe.A0i();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw Pxf.A0L(C273654mx.A00(1248), e);
        }
    }

    public C11219SFt(String str, List list, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.A0B = list;
        this.A08 = i;
        this.A09 = i2;
        this.A06 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A04 = i6;
        this.A03 = i7;
        this.A05 = i8;
        this.A07 = i9;
        this.A00 = f;
        this.A0A = str;
    }
}
