package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

/* renamed from: X.Mqz  reason: case insensitive filesystem */
public final class C67626Mqz extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public C67626Mqz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 2:
                C51969G9p.A1M(this.A01);
                return;
            case 3:
                View view = (View) this.A01;
                view.clearAnimation();
                C66581MXm.A0E(view.animate().setDuration(200).translationY(0.0f), 1.0f).setInterpolator(new AccelerateInterpolator()).setListener((Animator.AnimatorListener) null).start();
                return;
            case 4:
                ((C70776OKw) this.A01).A00 = false;
                return;
            default:
                DbS.A1U(this.A01);
                return;
        }
    }
}
