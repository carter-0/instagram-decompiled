package X;

import android.view.MotionEvent;
import android.view.View;

public final class APA implements View.OnTouchListener {
    public static final APA A00 = new APA();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.performClick();
        return true;
    }
}
