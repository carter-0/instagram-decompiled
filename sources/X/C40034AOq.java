package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AOq  reason: case insensitive filesystem */
public final class C40034AOq implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;

    public C40034AOq(GestureDetector gestureDetector) {
        this.A00 = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        this.A00.onTouchEvent(motionEvent);
        return false;
    }
}
