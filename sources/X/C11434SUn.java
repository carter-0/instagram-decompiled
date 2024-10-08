package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* renamed from: X.SUn  reason: case insensitive filesystem */
public final class C11434SUn implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final StateListDrawable A03;
    public final /* synthetic */ FBPayAnimationButton A04;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        int i = Build.VERSION.SDK_INT;
        String A002 = AnonymousClass000.A00(338);
        String A003 = C273654mx.A00(0);
        if (i >= 29) {
            StateListDrawable stateListDrawable = this.A03;
            int stateCount = stateListDrawable.getStateCount();
            for (int i2 = 0; i2 < stateCount; i2++) {
                Drawable stateDrawable = stateListDrawable.getStateDrawable(i2);
                0qQ.A0C(stateDrawable, A003);
                ((GradientDrawable) stateDrawable).setCornerRadius(C51970G9q.A04(valueAnimator.getAnimatedValue(), A002));
            }
        } else {
            Drawable current = this.A03.getCurrent();
            0qQ.A0C(current, A003);
            ((GradientDrawable) current).setCornerRadius(C51970G9q.A04(valueAnimator.getAnimatedValue(), A002));
        }
        FBPayAnimationButton fBPayAnimationButton = this.A04;
        fBPayAnimationButton.getButtonView().setTextColor(2eL.A06(this.A01, AnonymousClass1GB.A01(255.0f * animatedFraction)));
        int A012 = AnonymousClass1GB.A01(((float) this.A02) * animatedFraction);
        fBPayAnimationButton.getButtonView().getLayoutParams().width = A012 + this.A00;
        C9658Rec.A00(fBPayAnimationButton.getButtonView(), 2);
        fBPayAnimationButton.setForegroundGravity(17);
        fBPayAnimationButton.requestLayout();
    }

    public C11434SUn(FBPayAnimationButton fBPayAnimationButton) {
        this.A04 = fBPayAnimationButton;
        Drawable background = fBPayAnimationButton.getButtonView().getBackground();
        0qQ.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        this.A03 = (StateListDrawable) background;
        this.A01 = fBPayAnimationButton.getButtonView().getCurrentTextColor();
        this.A00 = fBPayAnimationButton.getButtonView().getHeight();
        this.A02 = fBPayAnimationButton.getButtonView().getWidth() - fBPayAnimationButton.getButtonView().getHeight();
    }
}
