package X;

import android.view.MotionEvent;
import android.view.View;

public final class WC1 implements View.OnTouchListener {
    public static final WC1 A00 = new WC1();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        boolean A1U = AnonymousClass7TF.A1U(0, view, motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            f = 0.75f;
        } else if (action != A1U && action != 3) {
            return false;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
        return false;
    }
}
