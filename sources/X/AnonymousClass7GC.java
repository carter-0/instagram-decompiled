package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;

/* renamed from: X.7GC  reason: invalid class name */
public abstract class AnonymousClass7GC {
    public static final void A00(View view, int i) {
        0qQ.A0B(view, 1);
        if (view instanceof Space) {
            if (view.getLayoutParams().height > i) {
                0nA.A0V(view, i);
            }
        } else if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            if (i2 < 0 && Math.abs(i2) > i) {
                0nA.A0e(view, -i);
            }
        }
    }
}
