package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.7i0  reason: invalid class name and case insensitive filesystem */
public final class C338467i0 extends Animation {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public C338467i0(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.A00;
        boolean z = swipeRefreshLayout.A0H;
        int i = swipeRefreshLayout.A07;
        if (!z) {
            i -= Math.abs(swipeRefreshLayout.A06);
        }
        int i2 = swipeRefreshLayout.A04;
        swipeRefreshLayout.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout.A0B.getTop());
        C338507i4 r3 = swipeRefreshLayout.A0C;
        float f2 = 1.0f - f;
        C338517i5 r1 = r3.A05;
        if (f2 != r1.A00) {
            r1.A00 = f2;
        }
        r3.invalidateSelf();
    }
}
