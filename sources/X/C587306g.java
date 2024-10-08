package X;

import android.view.View;

/* renamed from: X.06g  reason: invalid class name and case insensitive filesystem */
public final class C587306g implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ 06i A01;

    public final void onViewDetachedFromWindow(View view) {
    }

    public C587306g(View view, 06i r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void onViewAttachedToWindow(View view) {
        View view2 = this.A00;
        view2.removeOnAttachStateChangeListener(this);
        view2.requestApplyInsets();
    }
}
