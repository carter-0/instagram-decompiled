package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.WBx  reason: case insensitive filesystem */
public final class C18904WBx implements View.OnTouchListener {
    public static final C18904WBx A00 = new C18904WBx();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f = 1.0f;
        if (motionEvent.getAction() == 0) {
            f = 0.25f;
        }
        view.setAlpha(f);
        return false;
    }
}
