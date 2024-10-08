package X;

import android.animation.ValueAnimator;
import android.view.View;

public final class W4A implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C18510Vt7 A00;

    public W4A(C18510Vt7 vt7) {
        this.A00 = vt7;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C18510Vt7 vt7 = this.A00;
        View view = vt7.A04;
        view.setAlpha(1.0f - animatedFraction);
        view.setTranslationY(((float) vt7.A02) * animatedFraction);
    }
}
