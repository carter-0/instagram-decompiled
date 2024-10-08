package X;

import java.util.List;

/* renamed from: X.Hqw  reason: case insensitive filesystem */
public final class C55990Hqw {
    public final int A00;
    public final int A01;
    public final int A02;
    public final IFG[] A03;
    public final C55576Hjw A04;
    public final List A05;
    public final boolean A06;

    public final IFG[] A00(int i, int i2, int i3) {
        int i4;
        int i5;
        IFG[] ifgArr = this.A03;
        int length = ifgArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            IFG ifg = ifgArr[i6];
            int i9 = i7 + 1;
            int i10 = (int) ((C56048Hrx) this.A05.get(i7)).A00;
            int i11 = this.A04.A00[i8];
            if (this.A06) {
                i4 = this.A00;
                i5 = i8;
            } else {
                i4 = i8;
                i5 = this.A00;
            }
            ifg.A00(i, i11, i2, i3, i4, i5);
            i8 += i10;
            i6++;
            i7 = i9;
        }
        return ifgArr;
    }

    public C55990Hqw(C55576Hjw hjw, List list, IFG[] ifgArr, int i, int i2, boolean z) {
        this.A00 = i;
        this.A03 = ifgArr;
        this.A04 = hjw;
        this.A05 = list;
        this.A06 = z;
        int i3 = 0;
        for (IFG ifg : ifgArr) {
            i3 = Math.max(i3, ifg.A09);
        }
        this.A01 = i3;
        int i4 = i3 + i2;
        this.A02 = C51970G9q.A07(i4, i4);
    }
}
