package com.google.android.material.transformation;

import X.2dP;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect A00 = new Rect();
    public final RectF A01 = new RectF();
    public final RectF A02 = new RectF();

    public final void A0K(2dP r2) {
        if (r2.A01 == 0) {
            r2.A01 = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
    }

    public final boolean A0C(View view, View view2, CoordinatorLayout coordinatorLayout) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior() {
    }
}
