package com.google.android.material.behavior;

import X.AnonymousClass6Y2;
import X.AnonymousClass7TF;
import X.DbS;
import X.U0N;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

public class HideBottomViewOnScrollBehavior extends CoordinatorLayout.Behavior {
    public int A00 = 2;
    public int A01 = 0;
    public ViewPropertyAnimator A02;

    public final void A0J(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        TimeInterpolator timeInterpolator;
        long j;
        ViewPropertyAnimator animate;
        float f;
        if (i2 > 0) {
            if (this.A00 != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.A02;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.A00 = 1;
                int i6 = this.A01;
                timeInterpolator = AnonymousClass6Y2.A01;
                j = 175;
                animate = view.animate();
                f = (float) i6;
            } else {
                return;
            }
        } else if (i2 < 0 && this.A00 != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.A02;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.A00 = 2;
            timeInterpolator = AnonymousClass6Y2.A04;
            j = 225;
            animate = view.animate();
            f = 0.0f;
        } else {
            return;
        }
        this.A02 = animate.translationY(f).setInterpolator(timeInterpolator).setDuration(j).setListener(new U0N(this, 7));
    }

    public final boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        if (!(this instanceof BottomAppBar$Behavior)) {
            return AnonymousClass7TF.A1S(i, 2);
        }
        throw new NullPointerException("getHideOnScroll");
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }

    public boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A01 = view.getMeasuredHeight() + DbS.A0D(view).bottomMargin;
        return false;
    }

    public HideBottomViewOnScrollBehavior() {
    }
}
