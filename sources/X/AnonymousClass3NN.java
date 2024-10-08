package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3NN  reason: invalid class name */
public final class AnonymousClass3NN extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AnonymousClass3NM A00;
    public final /* synthetic */ AnonymousClass3NG A01;

    public AnonymousClass3NN(AnonymousClass3NM r1, AnonymousClass3NG r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        AnonymousClass3NM r2 = this.A00;
        r2.A02 = true;
        View view = this.A01.A0D;
        if (!view.isAttachedToWindow()) {
            0wb.A03("BouncyPressStateOnTouchListener", "Long press action detected but touch handling view is no longer attached to the window.");
            return;
        }
        AnonymousClass3NL r0 = r2.A08;
        if (r0 != null) {
            r0.DP5(view);
        }
    }
}
