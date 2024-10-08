package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.LYk  reason: case insensitive filesystem */
public final class C64284LYk implements View.OnTouchListener {
    public static final C64284LYk A00 = new C64284LYk();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view == null || motionEvent.getAction() != 2) {
            return false;
        }
        0nA.A0N(view);
        return false;
    }
}
