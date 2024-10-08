package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.04H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass04H implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass04M A01;

    public /* synthetic */ AnonymousClass04H(View view, AnonymousClass04M r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.CvO(this.A00);
    }
}
