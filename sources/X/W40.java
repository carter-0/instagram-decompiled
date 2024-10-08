package X;

import android.animation.Animator;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

public final class W40 implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SegmentedProgressBar A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public W40(SegmentedProgressBar segmentedProgressBar, int i) {
        this.A01 = segmentedProgressBar;
        this.A00 = i;
    }

    public final void onAnimationEnd(Animator animator) {
        SegmentedProgressBar segmentedProgressBar = this.A01;
        int i = SegmentedProgressBar.A0V;
        segmentedProgressBar.A0S.remove(this.A00);
    }
}
