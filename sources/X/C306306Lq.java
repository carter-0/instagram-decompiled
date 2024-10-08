package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.6Lq  reason: invalid class name and case insensitive filesystem */
public final class C306306Lq extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C309716Zi A00;

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A00.DA9(motionEvent.getRawX());
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A00.DP2(motionEvent.getRawX(), motionEvent.getRawY());
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A00.Dqb(motionEvent.getRawX(), motionEvent.getRawY());
        return true;
    }

    public C306306Lq(C309716Zi r1) {
        this.A00 = r1;
    }
}
