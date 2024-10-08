package X;

import android.view.View;

/* renamed from: X.6yd  reason: invalid class name and case insensitive filesystem */
public final class C324096yd {
    public int A00;
    public int A01;
    public int A02;
    public final View A03;

    public final void A00() {
        View view = this.A03;
        view.offsetTopAndBottom(this.A02 - (view.getTop() - this.A01));
        view.offsetLeftAndRight(-(view.getLeft() - this.A00));
    }

    public C324096yd(View view) {
        this.A03 = view;
    }
}
