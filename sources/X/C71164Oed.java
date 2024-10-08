package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* renamed from: X.Oed  reason: case insensitive filesystem */
public final class C71164Oed implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SegmentedProgressBar A00;

    public C71164Oed(SegmentedProgressBar segmentedProgressBar) {
        this.A00 = segmentedProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidate();
    }
}
