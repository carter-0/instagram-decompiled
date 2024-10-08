package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.GdW  reason: case insensitive filesystem */
public final class C52840GdW extends GestureDetector.SimpleOnGestureListener implements C234382xm {
    public final /* synthetic */ C55864Hol A00;

    public final boolean Dgn(C253913rc r2) {
        return true;
    }

    public final boolean Dgo(C253913rc r9) {
        0qQ.A0B(r9, 0);
        C55864Hol hol = this.A00;
        AnonymousClass3W1 r5 = hol.A05;
        r5.A0h(true);
        JQG jqg = hol.A02;
        1Xj r4 = hol.A04;
        int i = hol.A00;
        jqg.D4T(hol.A03, r4, r5, r9, i);
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C55864Hol hol = this.A00;
        JQG jqg = hol.A02;
        1Xj r4 = hol.A04;
        AnonymousClass3W1 r6 = hol.A05;
        AnonymousClass3V2 r3 = hol.A03;
        jqg.D9v(r3, r4, C54997HaU.A00(motionEvent, r3.A0F), r6, hol.A00);
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C55864Hol hol = this.A00;
        JQG jqg = hol.A02;
        1Xj r4 = hol.A04;
        AnonymousClass3W1 r6 = hol.A05;
        AnonymousClass3V2 r3 = hol.A03;
        jqg.Dkx(r3, r4, C54997HaU.A00(motionEvent, r3.A01), r6, hol.A00);
        return true;
    }

    public C52840GdW(C55864Hol hol) {
        this.A00 = hol;
    }

    public final void Dgt(C253913rc r3) {
        this.A00.A05.A0h(false);
    }
}
