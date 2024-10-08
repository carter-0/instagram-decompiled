package X;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

public final class LTs implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RecyclerView A02;
    public final /* synthetic */ RecyclerView A03;
    public final /* synthetic */ CustomScrollingLinearLayoutManager A04;
    public final /* synthetic */ TouchInterceptorFrameLayout A05;

    public LTs(RecyclerView recyclerView, RecyclerView recyclerView2, CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager, TouchInterceptorFrameLayout touchInterceptorFrameLayout, int i, int i2) {
        this.A05 = touchInterceptorFrameLayout;
        this.A00 = i;
        this.A04 = customScrollingLinearLayoutManager;
        this.A01 = i2;
        this.A03 = recyclerView;
        this.A02 = recyclerView2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        0qQ.A0B(valueAnimator, 0);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A05;
        if (touchInterceptorFrameLayout != null) {
            int i = this.A00;
            CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager = this.A04;
            int i2 = this.A01;
            RecyclerView recyclerView = this.A03;
            RecyclerView recyclerView2 = this.A02;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
                int floatValue = (int) (number.floatValue() * ((float) i));
                0nA.A0f(touchInterceptorFrameLayout, floatValue);
                Context A0S = AnonymousClass7TE.A0S(recyclerView);
                customScrollingLinearLayoutManager.A1p(i2, (((AnonymousClass7TF.A0E(A0S).widthPixels - floatValue) / 2) - recyclerView2.getPaddingStart()) + DbY.A01(A0S));
            }
        }
    }
}
