package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Suz  reason: case insensitive filesystem */
public final class C12467Suz implements C13611Tdd {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;

    public C12467Suz(View view, View view2) {
        this.A00 = view;
        this.A01 = view2;
    }

    public final void DMr(int i, boolean z) {
        int i2;
        View view = this.A00;
        if (view != null) {
            i2 = view.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        View view2 = this.A01;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        0qQ.A0C(layoutParams, AnonymousClass000.A00(18));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = marginLayoutParams.leftMargin;
        int i4 = marginLayoutParams.topMargin;
        int i5 = marginLayoutParams.rightMargin;
        int i6 = i - i2;
        int i7 = 0;
        if (0 < i6) {
            i7 = i6;
        }
        marginLayoutParams.setMargins(i3, i4, i5, i7);
        view2.requestLayout();
    }
}
