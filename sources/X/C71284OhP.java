package X;

import android.view.View;

/* renamed from: X.OhP  reason: case insensitive filesystem */
public final class C71284OhP implements View.OnAttachStateChangeListener {
    public final /* synthetic */ OU0 A00;

    public C71284OhP(OU0 ou0) {
        this.A00 = ou0;
    }

    public final void onViewAttachedToWindow(View view) {
        C74422Puc puc = this.A00.A09;
        if (puc != null) {
            puc.Dka();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C74422Puc puc = this.A00.A09;
        if (puc != null) {
            puc.D9d();
        }
    }
}
