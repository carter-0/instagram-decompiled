package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AOr  reason: case insensitive filesystem */
public final class C40035AOr implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;

    public C40035AOr(GestureDetector gestureDetector) {
        this.A00 = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        this.A00.onTouchEvent(motionEvent);
        return true;
    }
}
