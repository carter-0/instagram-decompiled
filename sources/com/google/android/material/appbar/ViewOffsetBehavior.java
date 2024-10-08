package com.google.android.material.appbar;

import X.04h;
import X.04k;
import X.2dP;
import X.C324096yd;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

public abstract class ViewOffsetBehavior extends CoordinatorLayout.Behavior {
    public int A00 = 0;
    public C324096yd A01;

    public boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        int i2;
        int i3 = i;
        if (this instanceof HeaderScrollingViewBehavior) {
            HeaderScrollingViewBehavior headerScrollingViewBehavior = (HeaderScrollingViewBehavior) this;
            List A0B = coordinatorLayout.A0B(view);
            int size = A0B.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                View view2 = (View) A0B.get(i4);
                if (!(view2 instanceof AppBarLayout)) {
                    i4++;
                } else if (view2 != null) {
                    2dP layoutParams = view.getLayoutParams();
                    Rect rect = headerScrollingViewBehavior.A02;
                    rect.set(coordinatorLayout.getPaddingLeft() + layoutParams.leftMargin, view2.getBottom() + layoutParams.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - layoutParams.rightMargin, ((coordinatorLayout.getHeight() + view2.getBottom()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
                    04k r2 = coordinatorLayout.A02;
                    if (r2 != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                        int i5 = rect.left;
                        04h r22 = r2.A00;
                        rect.left = i5 + r22.A03().A01;
                        rect.right -= r22.A03().A02;
                    }
                    Rect rect2 = headerScrollingViewBehavior.A03;
                    int i6 = layoutParams.A02;
                    if (i6 == 0) {
                        i6 = 8388659;
                    }
                    Gravity.apply(i6, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i3);
                    int A0S = headerScrollingViewBehavior.A0S(view2);
                    view.layout(rect2.left, rect2.top - A0S, rect2.right, rect2.bottom - A0S);
                    i2 = rect2.top - view2.getBottom();
                }
            }
            coordinatorLayout.A0E(view, i);
            i2 = 0;
            headerScrollingViewBehavior.A01 = i2;
        } else {
            coordinatorLayout.A0E(view, i);
        }
        C324096yd r23 = this.A01;
        if (r23 == null) {
            r23 = new C324096yd(view);
            this.A01 = r23;
        }
        View view3 = r23.A03;
        r23.A01 = view3.getTop();
        r23.A00 = view3.getLeft();
        this.A01.A00();
        int i7 = this.A00;
        if (i7 == 0) {
            return true;
        }
        C324096yd r1 = this.A01;
        if (r1.A02 != i7) {
            r1.A02 = i7;
            r1.A00();
        }
        this.A00 = 0;
        return true;
    }

    public boolean A0R(int i) {
        C324096yd r1 = this.A01;
        if (r1 == null) {
            this.A00 = i;
            return false;
        } else if (r1.A02 == i) {
            return false;
        } else {
            r1.A02 = i;
            r1.A00();
            return true;
        }
    }
}
