package X;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.TqT  reason: case insensitive filesystem */
public final class C14134TqT implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout A00;
    public final /* synthetic */ AppBarLayout.BaseBehavior A01;
    public final /* synthetic */ AppBarLayout A02;

    public C14134TqT(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.A01 = baseBehavior;
        this.A00 = coordinatorLayout;
        this.A02 = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A0V(this.A02, this.A00, AnonymousClass7TE.A0M(valueAnimator.getAnimatedValue()));
    }
}
