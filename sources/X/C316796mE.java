package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.6mE  reason: invalid class name and case insensitive filesystem */
public final class C316796mE implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C316766mB A00;

    public C316796mE(C316766mB r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            float floatValue = number.floatValue();
            IgSimpleImageView igSimpleImageView = this.A00.A06;
            if (igSimpleImageView == null) {
                0qQ.A0F("heartView");
                throw AnonymousClass00P.createAndThrow();
            } else {
                igSimpleImageView.setAlpha(floatValue);
            }
        }
    }
}
