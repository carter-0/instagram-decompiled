package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.I7m  reason: case insensitive filesystem */
public final class C56681I7m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C314226hr A00;

    public C56681I7m(C314226hr r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        C314226hr r0 = this.A00;
        Object obj = r0.A0T.get(C314226hr.A00(r0) - 1);
        0qQ.A07(obj);
        C51974G9v.A0e(valueAnimator, (View) obj, valueAnimator.getAnimatedValue());
    }
}
