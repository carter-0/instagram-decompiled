package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* renamed from: X.4jM  reason: invalid class name and case insensitive filesystem */
public final class C271644jM {
    public final AnimatorSet A00;
    public final C271634jL A01;
    public final ValueAnimator A02;
    public final ValueAnimator A03;

    public C271644jM(C271634jL r8) {
        this.A01 = r8;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(new C271654jN());
        ofFloat.setDuration(400);
        ofFloat.addUpdateListener(new C2815158c(this));
        this.A02 = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(new C271654jN());
        ofFloat2.setDuration(400);
        ofFloat2.addUpdateListener(new C2815158c(this));
        this.A03 = ofFloat2;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).after(500);
        animatorSet.play(ofFloat2).after(4900);
        this.A00 = animatorSet;
    }
}
