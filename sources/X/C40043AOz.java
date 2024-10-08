package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AOz  reason: case insensitive filesystem */
public final /* synthetic */ class C40043AOz implements View.OnTouchListener {
    public final /* synthetic */ C353798Jc A00;

    public /* synthetic */ C40043AOz(C353798Jc r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.A00.A02;
        gestureDetector.getClass();
        return gestureDetector.onTouchEvent(motionEvent);
    }
}
