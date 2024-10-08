package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.6Lo  reason: invalid class name and case insensitive filesystem */
public final class C306286Lo extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C250973mM A00;
    public final /* synthetic */ C309426Yf A01;
    public final /* synthetic */ C309716Zi A02;
    public final /* synthetic */ String A03;

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C309716Zi r1 = this.A02;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        r1.EGf(this.A00, this.A01, this.A03, rawX, rawY);
        return false;
    }

    public C306286Lo(C250973mM r1, C309426Yf r2, C309716Zi r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r2;
    }
}
