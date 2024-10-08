package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.SFm  reason: case insensitive filesystem */
public final class C11212SFm {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final String A08;
    public final List A09;

    public static C11212SFm A00(C11389SRd sRd) {
        List list;
        C11389SRd sRd2 = sRd;
        try {
            int A072 = Pxf.A07(sRd2, 21) & 3;
            int A052 = sRd2.A05();
            int i = sRd2.A01;
            int i2 = 0;
            for (int i3 = 0; i3 < A052; i3++) {
                sRd2.A0P(1);
                int A082 = sRd2.A08();
                for (int i4 = 0; i4 < A082; i4++) {
                    int A083 = sRd2.A08();
                    i2 += A083 + 4;
                    sRd2.A0P(A083);
                }
            }
            sRd2.A0O(i);
            byte[] bArr = new byte[i2];
            String str = null;
            int i5 = 0;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            float f = 1.0f;
            int i11 = -1;
            for (int i12 = 0; i12 < A052; i12++) {
                int A053 = sRd2.A05() & 63;
                int A084 = sRd2.A08();
                for (int i13 = 0; i13 < A084; i13++) {
                    int A085 = sRd2.A08();
                    System.arraycopy(SS3.A01, 0, bArr, i5, 4);
                    int i14 = i5 + 4;
                    System.arraycopy(sRd2.A02, sRd2.A01, bArr, i14, A085);
                    if (A053 == 33 && i13 == 0) {
                        C10852RzC A022 = SS3.A02(bArr, i14 + 2, i14 + A085);
                        i6 = A022.A02 + 8;
                        i7 = A022.A01 + 8;
                        i8 = A022.A05;
                        i9 = A022.A04;
                        i10 = A022.A06;
                        f = A022.A00;
                        i11 = A022.A0C;
                        int i15 = A022.A0A;
                        boolean z = A022.A0E;
                        A053 = 33;
                        int i16 = A022.A09;
                        int i17 = A022.A08;
                        str = SCR.A00(A022.A0F, i15, i16, i17, A022.A07, z);
                    }
                    i5 = i14 + A085;
                    sRd2.A0P(A085);
                }
            }
            if (i2 == 0) {
                list = Collections.emptyList();
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C11212SFm(str, list, f, A072 + 1, i6, i7, i8, i9, i10, i11);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw Pxf.A0L("Error parsing HEVC config", e);
        }
    }

    public C11212SFm(String str, List list, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A09 = list;
        this.A07 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
        this.A00 = f;
        this.A06 = i7;
        this.A08 = str;
    }
}
