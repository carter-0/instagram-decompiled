package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: X.TqP  reason: case insensitive filesystem */
public final class C14130TqP implements C324246ys {
    public final /* synthetic */ CollapsingToolbarLayout A00;

    public C14130TqP(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.A00 = collapsingToolbarLayout;
    }

    public final void DUz(AppBarLayout appBarLayout, int i) {
        int i2;
        int height;
        CollapsingToolbarLayout collapsingToolbarLayout = this.A00;
        collapsingToolbarLayout.A00 = i;
        04k r0 = collapsingToolbarLayout.A09;
        if (r0 != null) {
            i2 = r0.A00.A03().A03;
        } else {
            i2 = 0;
        }
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = collapsingToolbarLayout.getChildAt(i3);
            U4L u4l = (U4L) childAt.getLayoutParams();
            C324096yd A002 = CollapsingToolbarLayout.A00(childAt);
            int i4 = u4l.A01;
            if (i4 == 1) {
                int i5 = -i;
                height = ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.A00(childAt).A01) - childAt.getHeight()) - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (i5 < 0) {
                    height = 0;
                } else if (i5 <= height) {
                    height = i5;
                }
            } else if (i4 == 2) {
                height = Math.round(((float) (-i)) * u4l.A00);
            }
            if (A002.A02 != height) {
                A002.A02 = height;
                A002.A00();
            }
        }
        collapsingToolbarLayout.A05();
        if (collapsingToolbarLayout.A05 != null && i2 > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height2 = collapsingToolbarLayout.getHeight();
        int minimumHeight = (height2 - collapsingToolbarLayout.getMinimumHeight()) - i2;
        C14129TqO tqO = collapsingToolbarLayout.A0S;
        float f = (float) minimumHeight;
        float min = Math.min(1.0f, ((float) (height2 - collapsingToolbarLayout.getScrimVisibleHeightTrigger())) / f);
        tqO.A0L = min;
        tqO.A0M = min + ((1.0f - min) * 0.5f);
        tqO.A0Q = collapsingToolbarLayout.A00 + minimumHeight;
        tqO.A07(((float) Math.abs(i)) / f);
    }
}
