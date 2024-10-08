package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.OKw  reason: case insensitive filesystem */
public final class C70776OKw {
    public boolean A00;
    public boolean A01;
    public final View A02;

    public C70776OKw(View view) {
        0qQ.A0B(view, 1);
        this.A02 = view;
    }

    public final void A00(boolean z) {
        ViewPropertyAnimator duration;
        Animator.AnimatorListener gcU;
        View view = this.A02;
        if (z) {
            if (!this.A00) {
                if (this.A01) {
                    view.clearAnimation();
                    view.setVisibility(8);
                    this.A01 = false;
                }
                if (view.getVisibility() != 0) {
                    this.A00 = true;
                    view.setAlpha(0.0f);
                    view.setVisibility(0);
                    duration = C66581MXm.A0C(view, 1.0f).setDuration(300);
                    gcU = new C67626Mqz(this, 4);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (!this.A01) {
            if (this.A00) {
                view.clearAnimation();
                this.A00 = false;
            }
            if (view.getVisibility() != 8) {
                this.A01 = true;
                view.setAlpha(1.0f);
                duration = C66581MXm.A0C(view, 0.0f).setDuration(300);
                gcU = new C52777GcU(3, this, view);
            } else {
                return;
            }
        } else {
            return;
        }
        duration.setListener(gcU);
    }
}
