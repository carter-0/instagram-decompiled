package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.8bT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C358788bT implements View.OnTouchListener {
    public final /* synthetic */ C358368an A00;

    public /* synthetic */ C358788bT(C358368an r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C358368an r2 = this.A00;
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        C314676if r1 = r2.A1d;
        if (r1 == null || !C358368an.A0Q(r2)) {
            C314676if r0 = r2.A1a;
            if (r0 != null) {
                ((C338677iL) r0.get()).A05();
            }
        } else {
            ((C348987zP) r1.get()).A03();
        }
        return view.onTouchEvent(motionEvent);
    }
}
