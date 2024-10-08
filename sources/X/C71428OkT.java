package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.OkT  reason: case insensitive filesystem */
public final class C71428OkT implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;

    public C71428OkT(GestureDetector gestureDetector) {
        this.A00 = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00.onTouchEvent(motionEvent);
    }
}
