package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.OkV  reason: case insensitive filesystem */
public final class C71430OkV implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;

    public C71430OkV(GestureDetector gestureDetector) {
        this.A00 = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        return this.A00.onTouchEvent(motionEvent);
    }
}
