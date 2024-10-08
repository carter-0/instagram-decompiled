package X;

import android.view.MotionEvent;

public final class HFo extends U2n implements C234382xm {
    public final /* synthetic */ C57231ITs A00;

    public final boolean Dgn(C253913rc r2) {
        return true;
    }

    public final boolean Dgo(C253913rc r10) {
        0qQ.A0B(r10, 0);
        C57231ITs iTs = this.A00;
        AnonymousClass3W1 r5 = iTs.A04;
        r5.A0h(true);
        iTs.A01.BQ4().Dgp(iTs.A03, r5, r10, iTs.A02.A09, iTs.A00);
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C57231ITs iTs = this.A00;
        JSu jSu = iTs.A01;
        1Xj r4 = iTs.A03;
        AnonymousClass3W1 r6 = iTs.A04;
        C254173s3 r3 = iTs.A02;
        jSu.DA1(r3, r4, C54997HaU.A00(motionEvent, r3.A09), r6, iTs.A00);
        return true;
    }

    public HFo(C57231ITs iTs) {
        this.A00 = iTs;
    }

    public final void A00(MotionEvent motionEvent) {
        C57231ITs iTs = this.A00;
        JSu jSu = iTs.A01;
        1Xj r4 = iTs.A03;
        AnonymousClass3W1 r6 = iTs.A04;
        C254173s3 r3 = iTs.A02;
        jSu.Dl7(r3, r4, C54997HaU.A00(motionEvent, r3.A09), r6, iTs.A00);
    }

    public final void Dgt(C253913rc r3) {
        this.A00.A04.A0h(false);
    }
}
