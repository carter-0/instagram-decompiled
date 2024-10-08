package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import com.google.android.material.snackbar.SnackbarContentLayout;

public final class U0E extends AnimatorListenerAdapter {
    public final int A00;
    public final int A01;
    public final Object A02;

    public U0E(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onAnimationEnd(Animator animator) {
        if (2 - this.A00 != 0) {
            ((W1m) this.A02).A05();
        } else {
            ((View) this.A02).setVisibility(this.A01);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        Handler handler = W1m.A0D;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) ((W1m) this.A02).A0A;
        snackbarContentLayout.A01.setAlpha(1.0f);
        snackbarContentLayout.A01.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (snackbarContentLayout.A00.getVisibility() == 0) {
            snackbarContentLayout.A00.setAlpha(1.0f);
            snackbarContentLayout.A00.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }
}
