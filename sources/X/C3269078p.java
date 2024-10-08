package X;

import android.view.View;

/* renamed from: X.78p  reason: invalid class name and case insensitive filesystem */
public final class C3269078p implements C315616kD {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;

    public C3269078p(View view, View view2) {
        this.A00 = view;
        this.A01 = view2;
    }

    public final void DaF(C294975nL r4, float f) {
        if (f >= 0.15f) {
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.A01;
            if (view2 != null && !view2.equals(view)) {
                view2.setVisibility(8);
            }
        }
    }
}
