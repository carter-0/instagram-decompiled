package X;

import android.view.View;
import android.view.animation.Animation;

public final class LZ7 implements Animation.AnimationListener {
    public final /* synthetic */ View A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public LZ7(View view) {
        this.A00 = view;
    }

    public final void onAnimationEnd(Animation animation) {
        this.A00.setVisibility(8);
    }
}
