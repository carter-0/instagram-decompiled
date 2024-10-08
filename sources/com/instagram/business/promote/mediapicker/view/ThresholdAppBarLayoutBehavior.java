package com.instagram.business.promote.mediapicker.view;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public final class ThresholdAppBarLayoutBehavior extends AppBarLayout.Behavior {
    public float A00;

    public final /* bridge */ /* synthetic */ boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        0qQ.A0B(motionEvent, 2);
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        this.A00 = 0.0f;
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThresholdAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
    }

    public final void A0X(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int[] iArr, int i, int i2, int i3) {
        AnonymousClass7TG.A1T(coordinatorLayout, appBarLayout, view);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(coordinatorLayout.getContext());
        if (viewConfiguration != null) {
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            float abs = this.A00 + ((float) Math.abs(i2));
            this.A00 = abs;
            if (abs > ((float) (scaledTouchSlop * 25))) {
                super.A0P(view, coordinatorLayout, appBarLayout, iArr, i, i2, i3);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public ThresholdAppBarLayoutBehavior() {
    }
}
