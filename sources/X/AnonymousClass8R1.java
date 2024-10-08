package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.8R1  reason: invalid class name */
public final class AnonymousClass8R1 implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass8QZ A00;

    public AnonymousClass8R1(AnonymousClass8QZ r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        this.A00.A0P.requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
