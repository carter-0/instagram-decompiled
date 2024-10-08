package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.3rb  reason: invalid class name and case insensitive filesystem */
public final class C253903rb extends GestureDetector.SimpleOnGestureListener implements C234382xm {
    public final /* synthetic */ C253893ra A00;

    public final boolean Dgn(C253913rc r2) {
        return true;
    }

    public final boolean Dgo(C253913rc r10) {
        0qQ.A0B(r10, 0);
        C253893ra r2 = this.A00;
        AnonymousClass3W1 r5 = r2.A03;
        r5.A0h(true);
        r2.A02.BQ4().Dgp(r2.A01, r5, r10, r2.A04, r2.A00);
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C253893ra r5 = this.A00;
        r5.A02.DA5(r5.A01, C54997HaU.A00(motionEvent, r5.A04), r5.A03, r5.A00);
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C253893ra r5 = this.A00;
        r5.A02.DlB(r5.A01, C54997HaU.A00(motionEvent, r5.A04), r5.A03, r5.A00);
        return true;
    }

    public C253903rb(C253893ra r1) {
        this.A00 = r1;
    }

    public final void Dgt(C253913rc r3) {
        this.A00.A03.A0h(false);
    }
}
