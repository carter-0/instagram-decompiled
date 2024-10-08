package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.I7s  reason: case insensitive filesystem */
public final class C56687I7s implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C323646xs A02;

    public C56687I7s(View view, View view2, C323646xs r3) {
        this.A02 = r3;
        this.A00 = view;
        this.A01 = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C323646xs.A00(this.A00, this.A01, this.A02, valueAnimator.getAnimatedFraction());
    }
}
