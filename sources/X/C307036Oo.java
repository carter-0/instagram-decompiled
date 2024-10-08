package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.6Oo  reason: invalid class name and case insensitive filesystem */
public final class C307036Oo implements View.OnKeyListener {
    public final C306986Oj A00;

    public C307036Oo(C306986Oj r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        0qQ.A0B(view, 0);
        0qQ.A0B(keyEvent, 2);
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 62 && keyCode != 66 && keyCode != 108 && keyCode != 109) {
            return false;
        }
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            i2 = 1;
        } else if (this.A00.CdR()) {
            return false;
        } else {
            i2 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(keyEvent.getDownTime(), keyEvent.getEventTime(), i2, view.getX() / 2.0f, view.getY() / 2.0f, 0);
        if (obtain != null) {
            return view.dispatchTouchEvent(obtain);
        }
        return false;
    }
}
