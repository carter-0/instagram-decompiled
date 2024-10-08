package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Tog  reason: case insensitive filesystem */
public final /* synthetic */ class C14039Tog implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C328287Ef A01;

    public /* synthetic */ C14039Tog(View view, C328287Ef r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.CsL(this.A00.getY());
    }
}
