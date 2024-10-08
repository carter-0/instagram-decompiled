package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.9Xj  reason: invalid class name and case insensitive filesystem */
public final class C380279Xj extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C353798Jc A00;

    public C380279Xj(C353798Jc r1) {
        this.A00 = r1;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C353798Jc r2 = this.A00;
        if (r2.A0J == AnonymousClass05K.A0N && C353798Jc.A0I(r2)) {
            C353798Jc.A03(r2);
            return false;
        } else if (r2.A0J != AnonymousClass05K.A0C) {
            return false;
        } else {
            r2.A0K();
            return false;
        }
    }
}
