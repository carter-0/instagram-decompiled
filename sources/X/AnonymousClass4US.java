package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.Reference;

/* renamed from: X.4US  reason: invalid class name */
public final class AnonymousClass4US implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass4UR A00;

    public AnonymousClass4US(AnonymousClass4UR r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (Reference reference : this.A00.A07) {
            C242213Tb r1 = (C242213Tb) reference.get();
            if (r1 != null) {
                ((View) r1).setAlpha(((Number) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }
}
