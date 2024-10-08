package X;

import android.view.MotionEvent;
import android.view.View;

public final class AP4 implements View.OnTouchListener {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public final Runnable A02;

    public AP4(Runnable runnable) {
        this.A02 = runnable;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getScrollY() <= 10) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.A00 = motionEvent.getX();
                this.A01 = motionEvent.getY();
                return false;
            } else if (action == 2 && motionEvent.getY() - this.A01 >= 10.0f) {
                if (AnonymousClass7TE.A00(motionEvent.getX(), this.A00) * 2.0f < AnonymousClass7TE.A00(motionEvent.getY(), this.A01)) {
                    this.A02.run();
                }
            }
        }
        return false;
    }
}
