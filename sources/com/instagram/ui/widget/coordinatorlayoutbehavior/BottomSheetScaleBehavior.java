package com.instagram.ui.widget.coordinatorlayoutbehavior;

import X.0qQ;
import X.2dP;
import X.AnonymousClass7TG;
import X.C273654mx;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class BottomSheetScaleBehavior extends CoordinatorLayout.Behavior {
    public int A00;
    public boolean A01 = true;

    public BottomSheetScaleBehavior(Context context, AttributeSet attributeSet) {
    }

    public final boolean A0C(View view, View view2, CoordinatorLayout coordinatorLayout) {
        2dP layoutParams = view2.getLayoutParams();
        0qQ.A0C(layoutParams, C273654mx.A00(48));
        return layoutParams.A0A instanceof BottomSheetBehavior;
    }

    public final boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
        AnonymousClass7TG.A1O(view, view2);
        if (this.A01) {
            if (view.getVisibility() == 8 || view.getBottom() - this.A00 == 0) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return false;
            }
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) this.A00);
            float min = Math.min(1.0f, (((float) (view2.getTop() + view2.getPaddingTop())) - ((float) this.A00)) / ((float) (view.getBottom() - this.A00)));
            view.setScaleY(min);
            view.setScaleX(min);
        }
        return false;
    }

    public BottomSheetScaleBehavior() {
    }
}
