package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: X.OQw  reason: case insensitive filesystem */
public abstract class C70904OQw {
    public static final void A00(View view, boolean z) {
        0qQ.A0B(view, 0);
        if ("animating_show".equals(view.getTag())) {
            return;
        }
        if (view.getVisibility() != 0 || view.getAlpha() != 1.0f) {
            C66580MXl.A1A(view);
            if (z) {
                view.setVisibility(0);
                view.setTag("animating_show");
                view.setAlpha(0.0f);
                C66581MXm.A0D(C66581MXm.A0C(view, 1.0f).setInterpolator(new AccelerateDecelerateInterpolator())).withEndAction(new PX1(view)).setListener(new C71161Oea(view, 12)).start();
                return;
            }
            view.setVisibility(0);
        }
    }

    public static final boolean A01(View view, boolean z) {
        0qQ.A0B(view, 0);
        if ("animating_hide".equals(view.getTag()) || (view.getVisibility() == 8 && view.getAlpha() == 0.0f)) {
            return false;
        }
        ViewPropertyAnimator animate = view.animate();
        if (z) {
            animate.cancel();
            view.setTag("animating_hide");
            C66580MXl.A1D(C66581MXm.A0D(C66581MXm.A0C(view, 0.0f).setInterpolator(new AccelerateDecelerateInterpolator())).setListener(new C71161Oea(view, 12)), new PX0(view));
            return true;
        }
        animate.cancel();
        view.setVisibility(8);
        return true;
    }
}
