package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.47B  reason: invalid class name */
public final class AnonymousClass47B implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass9J3 A00;
    public final /* synthetic */ AnonymousClass3W1 A01;

    public AnonymousClass47B(AnonymousClass9J3 r1, AnonymousClass3W1 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        return C256083vC.A00.A01(motionEvent, view, this.A00, this.A01);
    }
}
