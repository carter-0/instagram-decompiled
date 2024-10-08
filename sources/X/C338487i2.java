package X;

import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: X.7i2  reason: invalid class name and case insensitive filesystem */
public final class C338487i2 extends ImageView {
    public int A00;
    public Animation.AnimationListener A01;

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.A01;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.A01;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.A00 = i;
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
