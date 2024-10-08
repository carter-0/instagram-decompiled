package X;

import android.view.View;

/* renamed from: X.3NP  reason: invalid class name */
public final class AnonymousClass3NP implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AnonymousClass3NM A00;

    public AnonymousClass3NP(AnonymousClass3NM r1) {
        this.A00 = r1;
    }

    public final void onViewAttachedToWindow(View view) {
        AnonymousClass3NM r1 = this.A00;
        r1.A07.A0A(r1);
    }

    public final void onViewDetachedFromWindow(View view) {
        AnonymousClass3NM r1 = this.A00;
        r1.A07.A0B(r1);
    }
}
