package com.google.android.material.snackbar;

import X.C18800W2n;
import X.V34;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final V34 A00;

    public final boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        V34 v34 = this.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C18800W2n.A00().A06(v34.A00);
            }
        } else if (coordinatorLayout.A0G(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C18800W2n.A00().A05(v34.A00);
        }
        return super.A0L(motionEvent, view, coordinatorLayout);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.V34] */
    public BaseTransientBottomBar$Behavior() {
        ? obj = new Object();
        this.A01 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.A00 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.A02 = 0;
        this.A00 = obj;
    }
}
