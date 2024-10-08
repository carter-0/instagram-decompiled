package X;

import android.view.View;

/* renamed from: X.2eX  reason: invalid class name and case insensitive filesystem */
public final class C71632eX extends C71642eY implements View.OnAttachStateChangeListener {
    public final View A00;

    public C71632eX(View view) {
        this.A00 = view;
        view.addOnAttachStateChangeListener(this);
        if (this.A00.isAttachedToWindow()) {
            A01();
        }
    }

    public final void onViewAttachedToWindow(View view) {
        A01();
    }

    public final void onViewDetachedFromWindow(View view) {
        A02();
    }
}
