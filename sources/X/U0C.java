package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class U0C extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final /* synthetic */ UAl A01;

    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public U0C(UAl uAl) {
        this.A01 = uAl;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A00) {
            this.A00 = false;
            return;
        }
        UAl uAl = this.A01;
        if (C13989Tnp.A02(uAl.A0K) == 0.0f) {
            uAl.A02 = 0;
            uAl.A01(0);
            return;
        }
        uAl.A02 = 2;
        uAl.A0A.invalidate();
    }
}
