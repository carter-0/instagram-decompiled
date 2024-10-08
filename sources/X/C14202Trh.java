package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.instagram.android.R;

/* renamed from: X.Trh  reason: case insensitive filesystem */
public final class C14202Trh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;

    public C14202Trh(View view) {
        this.A00 = view;
    }

    public final boolean onPreDraw() {
        View view = this.A00;
        C13988Tno.A12(view, this);
        if (!(view.getParent() instanceof ViewGroup)) {
            return true;
        }
        ViewParent parent = view.getParent();
        C66580MXl.A1R(parent);
        View view2 = (View) parent;
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.abc_star_medium);
        int bottom = ((view2.getBottom() - view.getBottom()) - view2.getPaddingBottom()) / 2;
        int max = Math.max(dimensionPixelOffset, view.getPaddingBottom() + bottom);
        int max2 = Math.max(dimensionPixelOffset, view.getPaddingTop() + bottom);
        if (view.getPaddingBottom() == max && view.getPaddingTop() == max2) {
            return true;
        }
        0nA.A0c(view, max2);
        0nA.A0X(view, max);
        return false;
    }
}
