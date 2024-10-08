package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.4wW  reason: invalid class name and case insensitive filesystem */
public final class C278234wW extends AnimatorListenerAdapter {
    public final /* synthetic */ PulsingMultiImageView A00;

    public C278234wW(PulsingMultiImageView pulsingMultiImageView) {
        this.A00 = pulsingMultiImageView;
    }

    public final void onAnimationEnd(Animator animator) {
        PulsingMultiImageView pulsingMultiImageView = this.A00;
        if (!pulsingMultiImageView.A04) {
            return;
        }
        if (((Number) pulsingMultiImageView.A08.getAnimatedValue()).floatValue() == 1.0f) {
            PulsingMultiImageView.A01(pulsingMultiImageView);
            pulsingMultiImageView.A07.start();
            return;
        }
        pulsingMultiImageView.A02 = null;
        pulsingMultiImageView.A01 = null;
        pulsingMultiImageView.A09.sendEmptyMessage(1);
    }
}
