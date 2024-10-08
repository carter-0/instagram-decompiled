package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.8y5  reason: invalid class name */
public final class AnonymousClass8y5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewTreeObserver A02;
    public final /* synthetic */ AnonymousClass5Gv A03;

    public final void onViewAttachedToWindow(View view) {
    }

    public AnonymousClass8y5(View view, View view2, ViewTreeObserver viewTreeObserver, AnonymousClass5Gv r4) {
        this.A01 = view;
        this.A02 = viewTreeObserver;
        this.A00 = view2;
        this.A03 = r4;
    }

    public final void onViewDetachedFromWindow(View view) {
        this.A01.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = this.A02;
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = this.A00.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this.A03);
    }
}
