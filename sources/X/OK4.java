package X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

public final class OK4 {
    public final AccelerateDecelerateInterpolator A00 = new AccelerateDecelerateInterpolator();

    public final void A00(View view, boolean z) {
        0qQ.A0B(view, 0);
        if (view.getVisibility() != 0) {
            return;
        }
        if (z) {
            view.setTranslationY(0.0f);
            C66580MXl.A1A(view);
            C66580MXl.A1D(C66581MXm.A0D(C66581MXm.A0C(view, 0.0f).translationY((float) view.getMeasuredHeight()).setInterpolator(this.A00)), new PXB(view));
            return;
        }
        view.setVisibility(8);
    }
}
