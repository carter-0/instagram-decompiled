package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.OkY  reason: case insensitive filesystem */
public final class C71433OkY implements View.OnTouchListener {
    public final GestureDetector A00;
    public final /* synthetic */ N1T A01;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        boolean onTouchEvent = this.A00.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !onTouchEvent) {
            this.A01.A01();
        }
        return onTouchEvent;
    }

    public C71433OkY(GestureDetector gestureDetector, N1T n1t) {
        this.A01 = n1t;
        this.A00 = gestureDetector;
    }
}
