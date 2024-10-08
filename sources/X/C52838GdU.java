package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.GdU  reason: case insensitive filesystem */
public final class C52838GdU extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C275794rx A00;

    public C52838GdU(C275794rx r1) {
        this.A00 = r1;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.A00.A0D.A06(0.9d);
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A00.A0D.A03();
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.A00.A0D.A03();
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A00.A0D.A03();
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C275794rx r1 = this.A00;
        r1.A0D.A03();
        C311686d5 r0 = r1.A03;
        if (r0 != null) {
            r0.onClick();
        }
        r1.A03(true);
        return true;
    }
}
