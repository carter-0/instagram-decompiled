package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public final class W4L implements ValueAnimator.AnimatorUpdateListener {
    public WeakReference A00;
    public boolean A01;
    public final Animator.AnimatorListener A02;
    public final ValueAnimator A03;

    public W4L() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1000);
        ofFloat.setStartDelay(500);
        ofFloat.addUpdateListener(this);
        U0N u0n = new U0N(this, 14);
        this.A02 = u0n;
        ofFloat.addListener(u0n);
        this.A03 = ofFloat;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14877UDf uDf;
        float A002 = AnonymousClass7TH.A00(valueAnimator);
        WeakReference weakReference = this.A00;
        if (weakReference != null && (uDf = (C14877UDf) weakReference.get()) != null) {
            ImageView imageView = uDf.A02;
            imageView.setTranslationX(((float) DbX.A0G(imageView).rightMargin) * A002);
            imageView.setAlpha(A002);
        }
    }
}
