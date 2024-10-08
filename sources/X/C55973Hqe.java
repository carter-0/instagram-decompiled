package X;

import android.view.View;

/* renamed from: X.Hqe  reason: case insensitive filesystem */
public final class C55973Hqe {
    public boolean A00;
    public final View A01;
    public final C62320sa A02;
    public final boolean A03;

    public C55973Hqe(View view, C62320sa r3, boolean z) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A02 = r3;
        this.A03 = z;
    }

    public final void A00() {
        if (!this.A00) {
            this.A00 = true;
            View view = this.A01;
            XF9 xf9 = new XF9(view, this.A02);
            view.getViewTreeObserver().addOnDrawListener(xf9);
            if (this.A03) {
                view.addOnAttachStateChangeListener(new GW4(4, xf9, this));
            }
        }
    }
}
