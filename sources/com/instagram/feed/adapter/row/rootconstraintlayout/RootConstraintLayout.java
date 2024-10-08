package com.instagram.feed.adapter.row.rootconstraintlayout;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.LithoView;

public final class RootConstraintLayout extends ConstraintLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RootConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    private final void A00(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                BaseMountingView childAt = viewGroup.getChildAt(i);
                if (childAt instanceof LithoView) {
                    childAt.CsJ();
                } else if (childAt instanceof ViewGroup) {
                    A00((ViewGroup) childAt);
                }
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        A00(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RootConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RootConstraintLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}
