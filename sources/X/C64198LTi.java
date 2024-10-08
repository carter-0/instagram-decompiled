package X;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.LTi  reason: case insensitive filesystem */
public final class C64198LTi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TabLayout A00;

    public C64198LTi(TabLayout tabLayout) {
        this.A00 = tabLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.scrollTo(AnonymousClass7TE.A0M(valueAnimator.getAnimatedValue()), 0);
    }
}
