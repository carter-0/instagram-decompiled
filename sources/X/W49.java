package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

public final class W49 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CirclePageIndicator A00;

    public W49(CirclePageIndicator circlePageIndicator) {
        this.A00 = circlePageIndicator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        this.A00.setBackgroundScale(C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"));
    }
}
