package X;

import androidx.compose.foundation.lazy.LazyListState;
import org.webrtc.CameraCapturer;

public final class GW9 implements C305246Hc {
    public final /* synthetic */ LazyListState A00;
    public final /* synthetic */ boolean A01;

    public GW9(LazyListState lazyListState, boolean z) {
        this.A00 = lazyListState;
        this.A01 = z;
    }

    public final AnonymousClass6JS AIJ() {
        AnonymousClass6JS r0;
        if (this.A01) {
            return r0;
        }
        r0 = new AnonymousClass6JS(1, -1);
        return r0;
    }

    public final int Aqh() {
        LazyListState lazyListState = this.A00;
        return (-((C305076Gk) lazyListState.A02()).A08) + ((C305076Gk) lazyListState.A02()).A04;
    }

    public final float BPK() {
        LazyListState lazyListState = this.A00;
        int A002 = lazyListState.A00();
        int A012 = lazyListState.A01();
        boolean AkW = lazyListState.AkW();
        float f = (float) (A012 + (A002 * CameraCapturer.OPEN_CAMERA_DELAY_MS));
        if (AkW) {
            return f + 100.0f;
        }
        return f;
    }

    public final float Bq6() {
        LazyListState lazyListState = this.A00;
        return (float) (lazyListState.A01() + (lazyListState.A00() * CameraCapturer.OPEN_CAMERA_DELAY_MS));
    }

    public final int CFO() {
        LazyListState lazyListState = this.A00;
        AnonymousClass6Gj r3 = ((C305076Gk) lazyListState.A02()).A0A;
        AnonymousClass6Gj r2 = AnonymousClass6Gj.Vertical;
        long A0m = G9t.A0m(((C305076Gk) lazyListState.A02()).A0G);
        if (r3 == r2) {
            return C289005cr.A00(A0m);
        }
        return C51965G9l.A04(A0m);
    }

    public final Object EKc(int i, AnonymousClass4D7 r4) {
        LazyListState lazyListState = this.A00;
        C286015Tp r0 = LazyListState.A0O;
        Object A04 = lazyListState.A04(r4, i, 0);
        if (A04 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A04;
    }
}
