package X;

import android.animation.ValueAnimator;

/* renamed from: X.3O1  reason: invalid class name */
public final class AnonymousClass3O1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass3O0 A00;

    public AnonymousClass3O1(AnonymousClass3O0 r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidateSelf();
    }
}
