package X;

import android.animation.AnimatorSet;
import com.instagram.creation.video.widget.scrubber.IgScrubberProgressIndicator;

/* renamed from: X.PUt  reason: case insensitive filesystem */
public final class C73062PUt implements Runnable {
    public final /* synthetic */ IgScrubberProgressIndicator A00;

    public C73062PUt(IgScrubberProgressIndicator igScrubberProgressIndicator) {
        this.A00 = igScrubberProgressIndicator;
    }

    public final void run() {
        IgScrubberProgressIndicator igScrubberProgressIndicator = this.A00;
        if (igScrubberProgressIndicator.A01) {
            AnimatorSet animatorSet = igScrubberProgressIndicator.A00;
            0qQ.A0A(animatorSet);
            if (!animatorSet.isStarted()) {
                0qQ.A0A(animatorSet);
                animatorSet.start();
            }
        }
    }
}
