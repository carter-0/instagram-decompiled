package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.5bi  reason: invalid class name and case insensitive filesystem */
public final class C288315bi extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C284945Oz A00;
    public final /* synthetic */ 0sP A01;
    public final /* synthetic */ 0sP A02;

    public C288315bi(C284945Oz r1, 0sP r2, 0sP r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        C268064ch r2 = (C268064ch) this.A00.getValue();
        if (r2 != null) {
            0sP r1 = this.A02;
            if (r2.COx() && r1 != null) {
                r1.invoke(C289425dZ.A01(r2));
            }
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C268064ch r2 = (C268064ch) this.A00.getValue();
        if (r2 == null) {
            return true;
        }
        0sP r1 = this.A01;
        if (!r2.COx()) {
            return true;
        }
        r1.invoke(C289425dZ.A00(r2));
        return true;
    }
}
