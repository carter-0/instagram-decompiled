package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.6mG  reason: invalid class name and case insensitive filesystem */
public final class C316816mG implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C316766mB A00;

    public C316816mG(C316766mB r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            float floatValue = number.floatValue();
            C316766mB r4 = this.A00;
            IgSimpleImageView igSimpleImageView = r4.A06;
            if (igSimpleImageView != null) {
                igSimpleImageView.setRotation(360.0f * floatValue);
                IgSimpleImageView igSimpleImageView2 = r4.A06;
                if (igSimpleImageView2 != null) {
                    igSimpleImageView2.setTranslationY(((floatValue * floatValue) - floatValue) * 1600.0f);
                    IgSimpleImageView igSimpleImageView3 = r4.A06;
                    if (igSimpleImageView3 != null) {
                        igSimpleImageView3.setTranslationX(((float) (r4.A02 - (((Number) r4.A0Q.getValue()).intValue() / 2))) - (50.0f * floatValue));
                        IgSimpleImageView igSimpleImageView4 = r4.A06;
                        if (igSimpleImageView4 != null) {
                            float f = 1.0f;
                            if (floatValue >= 0.9f) {
                                f = (1.0f - floatValue) * 10.0f;
                            }
                            igSimpleImageView4.setAlpha(f);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F("heartView");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
