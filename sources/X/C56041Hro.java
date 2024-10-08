package X;

import java.util.List;

/* renamed from: X.Hro  reason: case insensitive filesystem */
public final class C56041Hro {
    public final int A00;
    public final int A01;
    public final IFJ A02;
    public final C55576Hjw A03;
    public final C56566I1v A04;
    public final boolean A05;
    public final /* synthetic */ C55576Hjw A06;
    public final /* synthetic */ boolean A07;

    public final long A00(int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = this.A03.A01[i];
        } else {
            int i4 = (i2 + i) - 1;
            C55576Hjw hjw = this.A03;
            int[] iArr = hjw.A00;
            i3 = (iArr[i4] + hjw.A01[i4]) - iArr[i];
        }
        int A072 = C51970G9q.A07(i3, i3);
        if (this.A05) {
            return C288985co.A01(A072);
        }
        return C288985co.A00(A072);
    }

    public C56041Hro(IFJ ifj, C55576Hjw hjw, C56566I1v i1v, int i, int i2, boolean z) {
        this.A07 = z;
        this.A06 = hjw;
        this.A05 = z;
        this.A03 = hjw;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = ifj;
        this.A04 = i1v;
    }

    public final C55990Hqw A01(int i) {
        int i2;
        int i3 = i;
        C55578Hjy A032 = this.A04.A03(i3);
        List list = A032.A01;
        int size = list.size();
        if (size == 0 || A032.A00 + size == this.A00) {
            i2 = 0;
        } else {
            i2 = this.A01;
        }
        IFG[] ifgArr = new IFG[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (int) ((C56048Hrx) list.get(i5)).A00;
            IFG A002 = this.A02.A00(A032.A00 + i5, i4, i6, i2, A00(i4, i6));
            i4 += i6;
            ifgArr[i5] = A002;
        }
        return new C55990Hqw(this.A06, list, ifgArr, i3, i2, this.A07);
    }
}
