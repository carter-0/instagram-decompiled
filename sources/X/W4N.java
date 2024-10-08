package X;

import android.animation.ValueAnimator;
import android.view.View;

public final class W4N implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ View A04;

    public W4N(View view, float f, float f2, float f3, float f4) {
        this.A04 = view;
        this.A03 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A04.setAlpha(W3G.A00(this.A03, this.A01, this.A02, this.A00, C13989Tnp.A02(valueAnimator)));
    }
}
