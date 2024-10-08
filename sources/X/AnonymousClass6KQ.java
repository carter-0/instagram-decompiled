package X;

import android.animation.ValueAnimator;
import com.instagram.reels.viewer.attribution.CyclingFrameLayout;

/* renamed from: X.6KQ  reason: invalid class name */
public final class AnonymousClass6KQ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CyclingFrameLayout A00;

    public AnonymousClass6KQ(CyclingFrameLayout cyclingFrameLayout) {
        this.A00 = cyclingFrameLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidate();
    }
}
