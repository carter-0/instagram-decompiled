package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

public final class W4H implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ ConstrainedImageView A01;

    public W4H(ConstrainedImageView constrainedImageView, float f) {
        this.A01 = constrainedImageView;
        this.A00 = f;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        this.A01.setTranslationY(C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float") * ((float) Math.sin((double) this.A00)));
    }
}
