package X;

import java.util.Arrays;

/* renamed from: X.5Wu  reason: invalid class name and case insensitive filesystem */
public final class C286535Wu extends C286525Wt {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int[] A05 = new int[16];
    public C286545Wv[] A06 = new C286545Wv[16];
    public Object[] A07 = new Object[16];

    public final void A00() {
        this.A02 = 0;
        this.A00 = 0;
        0Yw.A0U(this.A07, 0, this.A01);
        this.A01 = 0;
    }

    public final void A02(C286545Wv r8) {
        this.A03 = 0;
        this.A04 = 0;
        int i = this.A02;
        C286545Wv[] r2 = this.A06;
        if (i == r2.length) {
            int i2 = i;
            if (i > 1024) {
                i2 = 1024;
            }
            Object[] copyOf = Arrays.copyOf(r2, i + i2);
            0qQ.A07(copyOf);
            this.A06 = (C286545Wv[]) copyOf;
        }
        int i3 = this.A00;
        int i4 = r8.A00;
        int i5 = i3 + i4;
        int[] iArr = this.A05;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = length;
            if (length > 1024) {
                i6 = 1024;
            }
            int i7 = length + i6;
            if (i7 < i5) {
                i7 = i5;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i7);
            0qQ.A07(copyOf2);
            this.A05 = copyOf2;
        }
        int i8 = this.A01;
        int i9 = r8.A01;
        int i10 = i8 + i9;
        Object[] objArr = this.A07;
        int length2 = objArr.length;
        if (i10 > length2) {
            int i11 = length2;
            if (length2 > 1024) {
                i11 = 1024;
            }
            int i12 = length2 + i11;
            if (i12 < i10) {
                i12 = i10;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i12);
            0qQ.A07(copyOf3);
            this.A07 = copyOf3;
        }
        C286545Wv[] r22 = this.A06;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        r22[i13] = r8;
        this.A00 += i4;
        this.A01 += i9;
    }

    public final void A01(C286475Wm r6, C288455bw r7, AnonymousClass5X4 r8) {
        C286535Wu r4;
        int i;
        if (this.A02 != 0) {
            C288465bx r3 = new C288465bx(this);
            do {
                r4 = r3.A03;
                C286545Wv r0 = r4.A06[r3.A02];
                0qQ.A0A(r0);
                r0.A02(r6, r7, r8, r3);
                int i2 = r3.A02;
                if (i2 >= r4.A02) {
                    break;
                }
                C286545Wv r2 = r4.A06[i2];
                0qQ.A0A(r2);
                r3.A00 += r2.A00;
                r3.A01 += r2.A01;
                i = r3.A02 + 1;
                r3.A02 = i;
            } while (i < r4.A02);
        }
        A00();
    }
}
