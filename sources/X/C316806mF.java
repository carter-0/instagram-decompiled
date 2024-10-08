package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.6mF  reason: invalid class name and case insensitive filesystem */
public final class C316806mF implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C316766mB A00;

    public C316806mF(C316766mB r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            float floatValue = number.floatValue();
            C316766mB r2 = this.A00;
            IgSimpleImageView igSimpleImageView = r2.A06;
            if (igSimpleImageView != null) {
                igSimpleImageView.setScaleX(floatValue);
                IgSimpleImageView igSimpleImageView2 = r2.A06;
                if (igSimpleImageView2 != null) {
                    igSimpleImageView2.setScaleY(floatValue);
                    return;
                }
            }
            0qQ.A0F("heartView");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
