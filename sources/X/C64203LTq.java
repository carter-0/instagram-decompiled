package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;

/* renamed from: X.LTq  reason: case insensitive filesystem */
public final class C64203LTq implements ValueAnimator.AnimatorUpdateListener {
    public Animator.AnimatorListener A00;
    public float A01;
    public final ValueAnimator A02;
    public final CircularProgressImageView A03;

    public C64203LTq(CircularProgressImageView circularProgressImageView) {
        0qQ.A0B(circularProgressImageView, 1);
        this.A03 = circularProgressImageView;
        float f = circularProgressImageView.A00;
        float[] A1b = C51965G9l.A1b();
        A1b[0] = f;
        A1b[1] = 360.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        this.A02 = ofFloat;
        this.A01 = f;
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(this);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView, android.view.View] */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        Number number;
        Object A0o = C51971G9r.A0o(valueAnimator);
        if (!(A0o instanceof Float) || (number = (Number) A0o) == null) {
            f = this.A01;
        } else {
            f = number.floatValue();
        }
        ? r0 = this.A03;
        r0.setAngle(f);
        this.A01 = f;
        r0.requestLayout();
    }
}
