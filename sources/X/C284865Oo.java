package X;

import android.view.View;

/* renamed from: X.5Oo  reason: invalid class name and case insensitive filesystem */
public final class C284865Oo implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AnonymousClass54O A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public C284865Oo(AnonymousClass54O r1) {
        this.A00 = r1;
    }

    public final void onViewDetachedFromWindow(View view) {
        AnonymousClass54O r1 = this.A00;
        if (!C275604qc.A02(r1)) {
            r1.A04();
        }
    }
}
