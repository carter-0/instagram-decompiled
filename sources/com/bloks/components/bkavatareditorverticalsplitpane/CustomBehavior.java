package com.bloks.components.bkavatareditorverticalsplitpane;

import X.AnonymousClass7TG;
import X.C298425tP;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class CustomBehavior extends BottomSheetBehavior {
    public final /* bridge */ /* synthetic */ boolean A0O(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        AnonymousClass7TG.A1O(view, view2);
        if (!(view2 instanceof C298425tP) || view2.canScrollVertically((int) f2)) {
            return false;
        }
        return super.A0O(view, view2, coordinatorLayout, f, f2);
    }

    public final /* bridge */ /* synthetic */ void A0P(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        AnonymousClass7TG.A1T(coordinatorLayout, view, view2);
        if ((view2 instanceof C298425tP) && !view2.canScrollVertically(i2)) {
            super.A0P(view, view2, coordinatorLayout, iArr, i, i2, i3);
        }
    }
}
