package X;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Mui  reason: case insensitive filesystem */
public final class C67778Mui extends AnonymousClass52S {
    public final float A07(DisplayMetrics displayMetrics) {
        0qQ.A0B(displayMetrics, 0);
        return 60.0f / ((float) displayMetrics.densityDpi);
    }

    public final int A0D(View view, int i) {
        0qQ.A0B(view, 0);
        C252553pI r5 = this.A02;
        if (r5 == null || !r5.A1X()) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, C273654mx.A00(9));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int left = view.getLeft() - marginLayoutParams.leftMargin;
        int right = view.getRight() + marginLayoutParams.rightMargin;
        return C66584MXp.A01(r5.A03 - r5.BaB(), r5.Ba9(), right, left);
    }

    public final int A0E(View view, int i) {
        0qQ.A0B(view, 0);
        C252553pI r5 = this.A02;
        if (r5 == null || !r5.A1Y()) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, C273654mx.A00(9));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int top = view.getTop() - marginLayoutParams.topMargin;
        int bottom = view.getBottom() + marginLayoutParams.bottomMargin;
        return C66584MXp.A01(r5.A00 - r5.Ba8(), r5.BaC(), bottom, top);
    }

    public final int A0C(int i, int i2, int i3, int i4, int i5) {
        return C66584MXp.A01(i4, i3, i2, i);
    }
}
