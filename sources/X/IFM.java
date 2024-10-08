package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import org.webrtc.CameraCapturer;

public final class IFM implements C305246Hc {
    public final int A00;
    public final Object A01;

    public final AnonymousClass6JS AIJ() {
        return new AnonymousClass6JS(-1, -1);
    }

    public IFM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final int Aqh() {
        int i;
        int i2;
        if (this.A00 != 0) {
            C284945Oz r1 = ((LazyStaggeredGridState) this.A01).A0G;
            i = C51975G9x.A0D(r1).A04;
            i2 = C51975G9x.A0D(r1).A03;
        } else {
            C284945Oz r12 = ((LazyGridState) this.A01).A0H;
            i = -((IGW) ((JL7) r12.getValue())).A08;
            i2 = ((IGW) ((JL7) r12.getValue())).A03;
        }
        return i + i2;
    }

    public final float BPK() {
        int BI6;
        int BI62;
        boolean A1W;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) obj;
            I48 i48 = lazyStaggeredGridState.A0D;
            BI6 = i48.A05.BI6();
            BI62 = i48.A06.BI6();
            A1W = C51971G9r.A1W(lazyStaggeredGridState.A0F);
        } else {
            LazyGridState lazyGridState = (LazyGridState) obj;
            I46 i46 = lazyGridState.A09;
            BI6 = i46.A03.BI6();
            BI62 = i46.A04.BI6();
            A1W = C51971G9r.A1W(lazyGridState.A0G);
        }
        float f = (float) (BI62 + (BI6 * CameraCapturer.OPEN_CAMERA_DELAY_MS));
        if (A1W) {
            return f + 100.0f;
        }
        return f;
    }

    public final float Bq6() {
        int BI6;
        C289495dh r0;
        if (this.A00 != 0) {
            I48 i48 = ((LazyStaggeredGridState) this.A01).A0D;
            BI6 = i48.A05.BI6();
            r0 = i48.A06;
        } else {
            I46 i46 = ((LazyGridState) this.A01).A09;
            BI6 = i46.A03.BI6();
            r0 = i46.A04;
        }
        return (float) (r0.BI6() + (BI6 * CameraCapturer.OPEN_CAMERA_DELAY_MS));
    }

    public final int CFO() {
        AnonymousClass6Gj r3;
        AnonymousClass6Gj r2;
        long A0m;
        if (this.A00 != 0) {
            C284945Oz r1 = ((LazyStaggeredGridState) this.A01).A0G;
            r3 = C51975G9x.A0D(r1).A0A;
            r2 = AnonymousClass6Gj.Vertical;
            A0m = C51975G9x.A0D(r1).A09;
        } else {
            C284945Oz r12 = ((LazyGridState) this.A01).A0H;
            r3 = ((IGW) ((JL7) r12.getValue())).A09;
            r2 = AnonymousClass6Gj.Vertical;
            A0m = G9t.A0m(((IGW) ((JL7) r12.getValue())).A0G);
        }
        if (r3 == r2) {
            return C289005cr.A00(A0m);
        }
        return C51965G9l.A04(A0m);
    }

    public final Object EKc(int i, AnonymousClass4D7 r9) {
        Object A002;
        1Hj r0;
        int i2 = i;
        if (this.A00 != 0) {
            LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) this.A01;
            C286015Tp r02 = LazyStaggeredGridState.A0M;
            A002 = lazyStaggeredGridState.EKT(C54609HKs.A01, r9, new C66164MGb(lazyStaggeredGridState, (AnonymousClass4D7) null, i2, 0, 2));
            r0 = 1Hj.A02;
            if (A002 != r0) {
                A002 = C60340gF.A00;
            }
        } else {
            C286015Tp r03 = LazyGridState.A0L;
            A002 = ((LazyGridState) this.A01).A00(r9, i, 0);
            r0 = 1Hj.A02;
        }
        if (A002 != r0) {
            return C60340gF.A00;
        }
        return A002;
    }
}
