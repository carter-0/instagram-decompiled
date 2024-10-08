package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.4nt  reason: invalid class name and case insensitive filesystem */
public final class C274214nt extends GestureDetector.SimpleOnGestureListener implements C234382xm {
    public final /* synthetic */ C274204ns A00;

    public final boolean Dgn(C253913rc r2) {
        return true;
    }

    public final boolean Dgo(C253913rc r10) {
        0qQ.A0B(r10, 0);
        C274204ns r2 = this.A00;
        AnonymousClass3W1 r5 = r2.A05;
        r5.A0h(true);
        r2.A02.BQ4().Dgp(r2.A04, r5, r10, r2.A03.A0J, r2.A01);
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C274204ns r1 = this.A00;
        C274184nq r2 = r1.A02;
        1Xj r4 = r1.A04;
        AnonymousClass3W1 r6 = r1.A05;
        C262804Gb r3 = r1.A03;
        r2.D9z(r3, r4, C54997HaU.A00(motionEvent, r3.A0J), r6, r1.A01);
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C274204ns r1 = this.A00;
        C274184nq r2 = r1.A02;
        1Xj r4 = r1.A04;
        AnonymousClass3W1 r6 = r1.A05;
        C262804Gb r3 = r1.A03;
        r2.Dl4(r3, r4, C54997HaU.A00(motionEvent, r3.A0J), r6, r1.A01, r1.A00);
        return true;
    }

    public C274214nt(C274204ns r1) {
        this.A00 = r1;
    }

    public final void Dgt(C253913rc r3) {
        this.A00.A05.A0h(false);
    }
}
