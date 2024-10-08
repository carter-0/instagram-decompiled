package X;

import android.view.MotionEvent;
import android.view.View;

public final class APB implements View.OnTouchListener {
    public static final APB A00 = new APB();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }
}
