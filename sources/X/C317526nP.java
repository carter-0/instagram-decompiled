package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* renamed from: X.6nP  reason: invalid class name and case insensitive filesystem */
public final class C317526nP implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SegmentedProgressBar A00;

    public C317526nP(SegmentedProgressBar segmentedProgressBar) {
        this.A00 = segmentedProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidate();
    }
}
