package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.5Gz  reason: invalid class name and case insensitive filesystem */
public final class C283295Gz extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AnonymousClass5Gv A00;

    public C283295Gz(AnonymousClass5Gv r1) {
        this.A00 = r1;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        Boolean bool;
        AnonymousClass5Gv r3 = this.A00;
        C234222xL r0 = r3.A0L;
        if (r0 != null) {
            bool = Boolean.valueOf(r0.Ds8(r3));
        } else {
            bool = null;
        }
        if (0qQ.A0K(bool, true)) {
            r3.A08(true);
        }
        return true;
    }
}
