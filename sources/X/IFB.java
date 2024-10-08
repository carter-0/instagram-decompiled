package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import java.util.List;

public final class IFB implements C305196Gx {
    public final LazyStaggeredGridState A00;

    public final float AEw(int i) {
        Object obj;
        long j;
        int A04;
        C284945Oz r7 = this.A00.A0G;
        IGX A0D = C51975G9x.A0D(r7);
        List list = A0D.A0D;
        if (list.isEmpty()) {
            return 0.0f;
        }
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (((IFH) ((JLD) obj)).A07 == i) {
                break;
            }
            i2++;
        }
        JLD jld = (JLD) obj;
        if (jld == null) {
            int size2 = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                AnonymousClass6Gj r3 = A0D.A0A;
                AnonymousClass6Gj r2 = AnonymousClass6Gj.Vertical;
                long j2 = ((IFH) ((JLD) list.get(i4))).A0B;
                if (r3 == r2) {
                    A04 = C289005cr.A00(j2);
                } else {
                    A04 = C51965G9l.A04(j2);
                }
                i3 += A04;
            }
            int size3 = (i3 / list.size()) + A0D.A05;
            int length = ((IGX) r7.getValue()).A0B.A01.length;
            return (((float) size3) * ((float) ((i / length) - (B6I() / length)))) - ((float) B6J());
        }
        AnonymousClass6Gj r1 = A0D.A0A;
        AnonymousClass6Gj r0 = AnonymousClass6Gj.Vertical;
        long j3 = ((IFH) jld).A03;
        if (r1 == r0) {
            j = j3 & 4294967295L;
        } else {
            j = j3 >> 32;
        }
        return (float) ((int) j);
    }

    public final int B6I() {
        return this.A00.A0D.A05.BI6();
    }

    public final int B6J() {
        return this.A00.A0D.A06.BI6();
    }

    public final int BLP() {
        JLD jld = (JLD) 00k.A0L(C51975G9x.A0D(this.A00.A0G).A0D);
        if (jld != null) {
            return ((IFH) jld).A07;
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
        return C51975G9x.A0D(this.A00.A0G).A06;
    }

    public IFB(LazyStaggeredGridState lazyStaggeredGridState) {
        this.A00 = lazyStaggeredGridState;
    }
}
