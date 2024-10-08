package X;

import android.view.OrientationEventListener;
import android.view.View;

/* renamed from: X.7pR  reason: invalid class name and case insensitive filesystem */
public final class C342957pR implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C342947pQ A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public C342957pR(C342947pQ r1) {
        this.A00 = r1;
    }

    public final void onViewDetachedFromWindow(View view) {
        OrientationEventListener orientationEventListener = this.A00.A02.A01;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }
}
