package X;

import android.animation.Animator;
import android.content.res.Resources;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

public final class OMU {
    public final long A00;
    public final GradientSpinner A01;

    public OMU(Resources resources, GradientSpinner gradientSpinner) {
        0qQ.A0B(resources, 2);
        this.A01 = gradientSpinner;
        this.A00 = (long) resources.getInteger(17694720);
    }

    public final void A00() {
        GradientSpinner gradientSpinner = this.A01;
        gradientSpinner.A08();
        C51972G9s.A0I(gradientSpinner).setDuration(this.A00).setListener(new C67626Mqz(gradientSpinner, 2));
    }

    public final void A01() {
        GradientSpinner gradientSpinner = this.A01;
        gradientSpinner.setAlpha(0.0f);
        gradientSpinner.setVisibility(0);
        DbY.A0G(gradientSpinner).setDuration(this.A00).setListener((Animator.AnimatorListener) null);
        gradientSpinner.A06();
    }
}
