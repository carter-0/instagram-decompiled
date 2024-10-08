package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.4wV  reason: invalid class name and case insensitive filesystem */
public final class C278224wV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PulsingMultiImageView A00;

    public C278224wV(PulsingMultiImageView pulsingMultiImageView) {
        this.A00 = pulsingMultiImageView;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidate();
    }
}
