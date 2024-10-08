package X;

import android.view.OrientationEventListener;
import android.view.View;

/* renamed from: X.7lK  reason: invalid class name and case insensitive filesystem */
public final class C340477lK implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C340457lI A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public C340477lK(C340457lI r1) {
        this.A00 = r1;
    }

    public final void onViewDetachedFromWindow(View view) {
        OrientationEventListener orientationEventListener = this.A00.A01.A01;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }
}
