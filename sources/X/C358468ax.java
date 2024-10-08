package X;

import android.view.View;

/* renamed from: X.8ax  reason: invalid class name and case insensitive filesystem */
public final class C358468ax implements View.OnLayoutChangeListener {
    public final /* synthetic */ C358368an A00;

    public C358468ax(C358368an r1) {
        this.A00 = r1;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C358368an r2 = this.A00;
        View view2 = r2.A14;
        if (view2 != null) {
            r2.A03 = view2.getMeasuredHeight();
            view2.removeOnLayoutChangeListener(this);
        }
    }
}
