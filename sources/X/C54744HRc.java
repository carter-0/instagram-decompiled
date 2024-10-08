package X;

import android.view.MotionEvent;

/* renamed from: X.HRc  reason: case insensitive filesystem */
public abstract class C54744HRc {
    public static final boolean A00(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        float rawY = motionEvent.getRawY(i);
        if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
            return false;
        }
        return true;
    }
}
