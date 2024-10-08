package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;

/* renamed from: X.Mcm  reason: case insensitive filesystem */
public final class C66800Mcm extends C66799Mcl implements Animatable {
    public AnimatorSet A00;
    public boolean A01;
    public final ValueAnimator[] A02 = new ValueAnimator[3];

    public final boolean isRunning() {
        return this.A01;
    }

    public C66800Mcm(int i, int i2, int i3) {
        super(i, i2, i3);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A01) {
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (visible) {
            if (z) {
                start();
            } else {
                stop();
                return visible;
            }
        }
        return visible;
    }
}
