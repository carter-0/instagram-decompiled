package X;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;

public final class WCV implements Animation.AnimationListener {
    public boolean A00 = false;
    public final View A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.A00) {
            this.A01.setLayerType(0, (Paint) null);
        }
    }

    public final void onAnimationStart(Animation animation) {
        View view = this.A01;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.A00 = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public WCV(View view) {
        this.A01 = view;
    }
}
