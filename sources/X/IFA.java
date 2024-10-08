package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import java.util.List;

public final class IFA implements C305196Gx {
    public final LazyGridState A00;

    public final float AEw(int i) {
        int i2;
        Object obj;
        long j;
        int A04;
        C284945Oz r4 = this.A00.A0H;
        IGW igw = (IGW) ((JL7) r4.getValue());
        List list = igw.A0C;
        if (list.isEmpty()) {
            return 0.0f;
        }
        int size = list.size();
        boolean z = false;
        int i3 = 0;
        while (true) {
            i2 = 1;
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (((IFG) ((MW2) obj)).A08 == i) {
                break;
            }
            i3++;
        }
        MW2 mw2 = (MW2) obj;
        if (mw2 == null) {
            int i4 = ((IGW) r4.getValue()).A05;
            boolean A1W = AnonymousClass7TF.A1W(igw.A09, AnonymousClass6Gj.Vertical);
            C58736Iwj iwj = new C58736Iwj(1, list, A1W);
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < list.size()) {
                int A0M = AnonymousClass7TE.A0M(iwj.invoke(Integer.valueOf(i5)));
                if (A0M == -1) {
                    i5++;
                } else {
                    int i8 = 0;
                    while (i5 < list.size() && AnonymousClass7TE.A0M(iwj.invoke(Integer.valueOf(i5))) == A0M) {
                        long j2 = ((IFG) ((MW2) list.get(i5))).A0B;
                        if (A1W) {
                            A04 = C289005cr.A00(j2);
                        } else {
                            A04 = C51965G9l.A04(j2);
                        }
                        i8 = Math.max(i8, A04);
                        i5++;
                    }
                    i6 += i8;
                    i7++;
                }
            }
            int i9 = (i6 / i7) + igw.A04;
            if (i < B6I()) {
                z = true;
            }
            int B6I = i - B6I();
            int i10 = i4 - 1;
            if (z) {
                i2 = -1;
            }
            return ((float) (i9 * ((B6I + (i10 * i2)) / i4))) - ((float) B6J());
        }
        AnonymousClass6Gj r1 = igw.A09;
        AnonymousClass6Gj r0 = AnonymousClass6Gj.Vertical;
        long j3 = ((IFG) mw2).A05;
        if (r1 == r0) {
            j = j3 & 4294967295L;
        } else {
            j = j3 >> 32;
        }
        return (float) ((int) j);
    }

    public final int B6I() {
        return this.A00.A09.A03.BI6();
    }

    public final int B6J() {
        return this.A00.A09.A04.BI6();
    }

    public final int BLP() {
        MW2 mw2 = (MW2) 00k.A0L(C51975G9x.A0C(this.A00).A0C);
        if (mw2 != null) {
            return ((IFG) mw2).A08;
        }
        return 0;
    }

    public final Object EKU(AnonymousClass4D7 r3, 0sL r4) {
        Object EKT = this.A00.EKT(C54609HKs.A01, r3, r4);
        if (EKT != 1Hj.A02) {
            return C60340gF.A00;
        }
        return EKT;
    }

    public final void Evv(AnonymousClass6H1 r2, int i, int i2) {
        this.A00.A01(i, i2);
    }

    public final int getItemCount() {
        return C51975G9x.A0C(this.A00).A06;
    }

    public IFA(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }
}
