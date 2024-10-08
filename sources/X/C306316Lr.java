package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.6Lr  reason: invalid class name and case insensitive filesystem */
public final class C306316Lr implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ C309716Zi A01;

    public C306316Lr(GestureDetector gestureDetector, C309716Zi r2) {
        this.A00 = gestureDetector;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        boolean onTouchEvent = this.A00.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        this.A01.DvB(onTouchEvent);
        return onTouchEvent;
    }
}
