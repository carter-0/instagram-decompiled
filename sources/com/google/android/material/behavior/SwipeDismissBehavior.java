package com.google.android.material.behavior;

import X.03v;
import X.04x;
import X.C14752U7j;
import X.C16743V4a;
import X.C18940WDt;
import X.U4W;
import X.W3p;
import X.X32;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.common.dextricks.Constants;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

public class SwipeDismissBehavior extends CoordinatorLayout.Behavior {
    public float A00 = 0.5f;
    public float A01 = 0.0f;
    public int A02 = 2;
    public W3p A03;
    public X32 A04;
    public boolean A05;
    public final C16743V4a A06 = new C14752U7j(this);

    public final boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            03v.A09(view, Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
            if (!(this instanceof BaseTransientBottomBar$Behavior) || (view instanceof U4W)) {
                03v.A0E(view, 04x.A0D, new C18940WDt(this, 2));
            }
        }
        return false;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean z = this.A05;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.A0G(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A05 = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A05 = false;
        }
        if (!z) {
            return false;
        }
        W3p w3p = this.A03;
        if (w3p == null) {
            w3p = new W3p(coordinatorLayout.getContext(), coordinatorLayout, this.A06);
            this.A03 = w3p;
        }
        return w3p.A0K(motionEvent);
    }

    public final boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        W3p w3p = this.A03;
        if (w3p == null) {
            return false;
        }
        w3p.A0G(motionEvent);
        return true;
    }
}
