package X;

import java.util.List;

/* renamed from: X.GaE  reason: case insensitive filesystem */
public final class C52640GaE implements JLG {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final Object A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final int[] A0A;
    public final C287265Zr A0B;
    public final C287245Zp A0C;
    public final AnonymousClass5Q8 A0D;

    public final void A00(int i) {
        this.A01 += i;
        int[] iArr = this.A0A;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.A08) {
                if (i2 % 2 != 1) {
                }
                iArr[i2] = iArr[i2] + i;
            } else {
                if (i2 % 2 != 0) {
                }
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void A01(int i, int i2, int i3) {
        int i4;
        this.A01 = i;
        boolean z = this.A08;
        int i5 = i2;
        if (z) {
            i5 = i3;
        }
        this.A00 = i5;
        List list = this.A07;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            C267974cY r8 = (C267974cY) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.A0A;
            if (z) {
                C287265Zr r2 = this.A0B;
                if (r2 != null) {
                    iArr[i7] = r2.AB2(this.A0D, r8.A01, i2);
                    iArr[i7 + 1] = i;
                    i4 = r8.A00;
                } else {
                    throw AnonymousClass7TE.A0w("null horizontalAlignment");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                C287245Zp r1 = this.A0C;
                if (r1 != null) {
                    iArr[i8] = r1.AAy(r8.A00, i3);
                    i4 = r8.A01;
                } else {
                    throw AnonymousClass7TE.A0w("null verticalAlignment");
                }
            }
            i += i4;
        }
    }

    public C52640GaE(AnonymousClass6Gj r6, C287265Zr r7, C287245Zp r8, AnonymousClass5Q8 r9, Object obj, List list, int i, int i2, long j, boolean z) {
        int i3;
        this.A03 = i;
        this.A04 = i2;
        this.A07 = list;
        this.A05 = j;
        this.A06 = obj;
        this.A0B = r7;
        this.A0C = r8;
        this.A0D = r9;
        this.A09 = z;
        this.A08 = AnonymousClass7TF.A1W(r6, AnonymousClass6Gj.Vertical);
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C267974cY r1 = (C267974cY) list.get(i5);
            if (!this.A08) {
                i3 = r1.A00;
            } else {
                i3 = r1.A01;
            }
            i4 = Math.max(i4, i3);
        }
        this.A02 = i4;
        this.A0A = new int[(this.A07.size() * 2)];
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    }
}
