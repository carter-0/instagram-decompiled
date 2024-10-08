package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

public final class W4I implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SegmentedProgressBar A01;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        SegmentedProgressBar segmentedProgressBar = this.A01;
        int i = SegmentedProgressBar.A0V;
        segmentedProgressBar.A0Q.put(this.A00, animatedValue);
        segmentedProgressBar.invalidate();
    }

    public W4I(SegmentedProgressBar segmentedProgressBar, int i) {
        this.A01 = segmentedProgressBar;
        this.A00 = i;
    }
}
