package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.EpL  reason: case insensitive filesystem */
public abstract class C49096EpL {
    public static final ViewGroup A00(View view) {
        View view2;
        if (view instanceof FrameLayout) {
            return (ViewGroup) view;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof View) || (view2 = (View) parent) == null) {
            return null;
        }
        return A00(view2);
    }
}
