package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.9yE  reason: invalid class name and case insensitive filesystem */
public abstract class C394509yE {
    public static final ViewGroup A00(View view) {
        ViewParent viewParent;
        View view2;
        if (view instanceof FrameLayout) {
            return (ViewGroup) view;
        }
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof View) || (view2 = (View) viewParent) == null) {
            return null;
        }
        return A00(view2);
    }
}
