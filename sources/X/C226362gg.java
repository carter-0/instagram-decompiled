package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.2gg  reason: invalid class name and case insensitive filesystem */
public final class C226362gg extends GestureDetector.SimpleOnGestureListener {
    public final C62320sa A00;
    public final boolean A01 = true;

    public C226362gg(C62320sa r2) {
        this.A00 = r2;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.A01) {
            return false;
        }
        this.A00.invoke();
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        this.A00.invoke();
        return false;
    }
}
