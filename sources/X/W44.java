package X;

import android.animation.ValueAnimator;

public final class W44 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ UAl A00;

    public W44(UAl uAl) {
        this.A00 = uAl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int A02 = (int) (C13989Tnp.A02(valueAnimator) * 255.0f);
        UAl uAl = this.A00;
        uAl.A0O.setAlpha(A02);
        uAl.A0M.setAlpha(A02);
        uAl.A0A.invalidate();
    }
}
