package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.VEe  reason: case insensitive filesystem */
public abstract class C17004VEe {
    public static final void A00(View view, Integer num, Integer num2) {
        int i;
        int i2;
        ViewGroup.MarginLayoutParams A0G = DbX.A0G(view);
        if (num != null) {
            i = num.intValue();
        } else {
            i = A0G.leftMargin;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = A0G.topMargin;
        }
        A0G.setMargins(i, i2, A0G.rightMargin, A0G.bottomMargin);
        view.setLayoutParams(A0G);
    }
}
