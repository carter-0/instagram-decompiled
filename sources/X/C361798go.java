package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* renamed from: X.8go  reason: invalid class name and case insensitive filesystem */
public final class C361798go implements View.OnTouchListener {
    public final /* synthetic */ C361778gm A00;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                C361778gm r1 = this.A00;
                int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                VelocityTracker velocityTracker = r1.A02;
                if (velocityTracker == null) {
                    velocityTracker = VelocityTracker.obtain();
                    r1.A02 = velocityTracker;
                }
                if (velocityTracker == null) {
                    return false;
                }
                velocityTracker.addMovement(motionEvent);
                return false;
            } else if (actionMasked != 3) {
                return false;
            }
        }
        C361778gm r12 = this.A00;
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        VelocityTracker velocityTracker2 = r12.A02;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
        }
        r12.A02 = null;
        return false;
    }

    public C361798go(C361778gm r1) {
        this.A00 = r1;
    }
}
