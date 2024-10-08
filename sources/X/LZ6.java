package X;

import android.view.View;
import android.view.animation.Animation;

public final class LZ6 implements Animation.AnimationListener {
    public final /* synthetic */ View A00;

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public LZ6(View view) {
        this.A00 = view;
    }

    public final void onAnimationStart(Animation animation) {
        this.A00.setVisibility(0);
    }
}
