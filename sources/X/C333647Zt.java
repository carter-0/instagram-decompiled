package X;

import android.view.View;

/* renamed from: X.7Zt  reason: invalid class name and case insensitive filesystem */
public final class C333647Zt implements View.OnLayoutChangeListener {
    public final /* synthetic */ C331857Sq A00;

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        0qQ.A0B(view, 0);
        C331857Sq r3 = this.A00;
        C69203Nh3 nh3 = r3.A01;
        if (nh3 != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            nh3.setBottomBounds(Integer.valueOf(iArr[1] + view.getHeight()));
        }
        if (r3.A06) {
            C331857Sq.A02(r3);
        }
    }

    public C333647Zt(C331857Sq r1) {
        this.A00 = r1;
    }
}
