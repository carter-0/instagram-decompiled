package com.google.android.material.floatingactionbutton;

import X.2dP;
import X.C297865sU;
import X.U4x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

public class FloatingActionButton$BaseBehavior extends CoordinatorLayout.Behavior {
    public final /* bridge */ /* synthetic */ boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        A0R(coordinatorLayout, (U4x) null, i);
        throw null;
    }

    public boolean A0R(CoordinatorLayout coordinatorLayout, U4x u4x, int i) {
        List A0B = coordinatorLayout.A0B((View) null);
        int size = A0B.size();
        int i2 = 0;
        while (i2 < size) {
            View view = (View) A0B.get(i2);
            if (view instanceof AppBarLayout) {
                throw new NullPointerException("getLayoutParams");
            }
            2dP layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof 2dP) || !(layoutParams.A0A instanceof BottomSheetBehavior)) {
                i2++;
            } else {
                throw new NullPointerException("getLayoutParams");
            }
        }
        coordinatorLayout.A0E((View) null, i);
        throw new NullPointerException("shadowPadding");
    }

    public final /* bridge */ /* synthetic */ boolean A0A(Rect rect, View view, CoordinatorLayout coordinatorLayout) {
        throw new NullPointerException("shadowPadding");
    }

    public final /* bridge */ /* synthetic */ boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
        if (view2 instanceof AppBarLayout) {
            throw new NullPointerException("getLayoutParams");
        }
        2dP layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof 2dP) || !(layoutParams.A0A instanceof BottomSheetBehavior)) {
            return false;
        }
        throw new NullPointerException("getLayoutParams");
    }

    public final void A0K(2dP r2) {
        if (r2.A01 == 0) {
            r2.A01 = 80;
        }
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A0E);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public FloatingActionButton$BaseBehavior() {
    }
}
