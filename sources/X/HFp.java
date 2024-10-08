package X;

import android.view.MotionEvent;

public final class HFp extends U2n implements C234382xm {
    public final int A00;
    public final AnonymousClass4GO A01;
    public final C254173s3 A02;
    public final 1Xj A03;
    public final AnonymousClass3W1 A04;

    public final boolean Dgn(C253913rc r2) {
        return true;
    }

    public final boolean Dgo(C253913rc r8) {
        0qQ.A0B(r8, 0);
        AnonymousClass3W1 r4 = this.A04;
        r4.A0h(true);
        AnonymousClass4GO r1 = this.A01;
        1Xj r3 = this.A03;
        int i = this.A00;
        r1.Dm2(this.A02, r3, r4, r8, i);
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        AnonymousClass4GO r1 = this.A01;
        1Xj r3 = this.A03;
        AnonymousClass3W1 r5 = this.A04;
        C254173s3 r2 = this.A02;
        r1.Dm1(r2, r3, C54997HaU.A00(motionEvent, r2.A09), r5, this.A00);
        return true;
    }

    public final void A00(MotionEvent motionEvent) {
        AnonymousClass4GO r1 = this.A01;
        1Xj r3 = this.A03;
        AnonymousClass3W1 r5 = this.A04;
        C254173s3 r2 = this.A02;
        r1.Dm3(r2, r3, C54997HaU.A00(motionEvent, r2.A09), r5, this.A00);
    }

    public final void Dgt(C253913rc r3) {
        this.A04.A0h(false);
    }

    public HFp(AnonymousClass4GO r1, C254173s3 r2, 1Xj r3, AnonymousClass3W1 r4, int i) {
        AnonymousClass7TG.A1O(r3, r4);
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = i;
        this.A02 = r2;
        this.A01 = r1;
    }
}
