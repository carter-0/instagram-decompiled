package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Ms7  reason: case insensitive filesystem */
public final class C67671Ms7 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ OG1 A00;

    public C67671Ms7(OG1 og1) {
        this.A00 = og1;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        OG1 og1 = this.A00;
        NJA nja = og1.A02;
        if (nja != null) {
            nja.A00();
        }
        View view = og1.A01;
        if (view == null) {
            return true;
        }
        0nA.A0N(view);
        return true;
    }
}
