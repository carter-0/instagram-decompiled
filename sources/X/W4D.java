package X;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;

public final class W4D implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AppBarLayout A00;
    public final /* synthetic */ C297875sV A01;

    public W4D(AppBarLayout appBarLayout, C297875sV r2) {
        this.A00 = appBarLayout;
        this.A01 = r2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A0A(C13989Tnp.A02(valueAnimator));
    }
}
