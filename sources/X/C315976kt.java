package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.6kt  reason: invalid class name and case insensitive filesystem */
public final class C315976kt extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C315966ks A00;

    public C315976kt(C315966ks r1) {
        this.A00 = r1;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C315966ks r1 = this.A00;
        r1.A00 = motionEvent.getX();
        r1.A01 = motionEvent.getY();
        r1.A05 = 1;
        return true;
    }
}
