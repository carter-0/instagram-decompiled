package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public final class IDR implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ C309726Zj A01;

    public IDR(GestureDetector gestureDetector, C309726Zj r2) {
        this.A00 = gestureDetector;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        boolean onTouchEvent = this.A00.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 1 && actionMasked != 3) || onTouchEvent) {
            return onTouchEvent;
        }
        this.A01.D0s(false, true);
        return onTouchEvent;
    }
}
