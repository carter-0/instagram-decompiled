package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.6kv  reason: invalid class name and case insensitive filesystem */
public final class C315996kv extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C315986ku A00;

    public C315996kv(C315986ku r1) {
        this.A00 = r1;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C315886kk r6 = this.A00.A03;
        motionEvent.getX();
        motionEvent.getY();
        AnonymousClass0JP r5 = r6.A06;
        if (r5.now() - r6.A02 < 200) {
            return true;
        }
        r6.A02 = r5.now();
        return true;
    }
}
