package X;

import android.view.MotionEvent;
import android.view.View;

public final class AP5 implements View.OnTouchListener {
    public int A00;
    public float A01;
    public int A02;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A01 = motionEvent.getY();
        } else if (action == 1 && this.A02 == 2 && AnonymousClass7TE.A00(motionEvent.getY(), this.A01) > 10.0f) {
            this.A00++;
        }
        this.A02 = motionEvent.getAction();
        return false;
    }
}
