package X;

import android.view.MotionEvent;

public final class HFn extends U2n implements C234382xm {
    public final /* synthetic */ C55845HoS A00;

    public final boolean Dgn(C253913rc r2) {
        return true;
    }

    public HFn(C55845HoS hoS) {
        this.A00 = hoS;
    }

    public final void A00(MotionEvent motionEvent) {
        C55845HoS hoS = this.A00;
        AnonymousClass4GJ r2 = hoS.A02;
        1Xj r4 = hoS.A04;
        AnonymousClass3W1 r6 = hoS.A05;
        C55778HnD hnD = hoS.A03;
        r2.Dl6(hnD, r4, C54997HaU.A00(motionEvent, hnD.A03), r6, hoS.A00);
    }

    public final boolean Dgo(C253913rc r10) {
        C55845HoS hoS = this.A00;
        AnonymousClass3W1 r5 = hoS.A05;
        r5.A0h(true);
        C253913rc r6 = r10;
        hoS.A02.BQ4().Dgp(hoS.A04, r5, r6, hoS.A03.A03, hoS.A00);
        return true;
    }

    public final void Dgt(C253913rc r3) {
        this.A00.A05.A0h(false);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C55845HoS hoS = this.A00;
        AnonymousClass4GJ r2 = hoS.A02;
        1Xj r4 = hoS.A04;
        AnonymousClass3W1 r6 = hoS.A05;
        C55778HnD hnD = hoS.A03;
        r2.DA0(hnD, r4, C54997HaU.A00(motionEvent, hnD.A03), r6, hoS.A00);
        return true;
    }
}
