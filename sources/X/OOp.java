package X;

import android.view.View;
import android.view.ViewGroup;

public abstract class OOp {
    public static final int A00(04k r4) {
        0qQ.A0B(r4, 0);
        04h r2 = r4.A00;
        int i = r2.A05(8).A00 - r2.A05(2).A00;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public static final void A01(View view, int i) {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            i2 = 0;
        } else {
            i2 = marginLayoutParams.bottomMargin;
        }
        0nA.A0T(view, i2 + i);
    }
}
