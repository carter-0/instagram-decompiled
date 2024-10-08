package X;

import android.animation.ValueAnimator;
import com.facebook.smartcapture.components.DottedAlignmentView;

/* renamed from: X.TCh  reason: case insensitive filesystem */
public final class C12893TCh implements Runnable {
    public final /* synthetic */ DottedAlignmentView A00;

    public C12893TCh(DottedAlignmentView dottedAlignmentView) {
        this.A00 = dottedAlignmentView;
    }

    public final void run() {
        ValueAnimator valueAnimator = this.A00.A05;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
