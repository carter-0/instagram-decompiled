package X;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class PXY implements Runnable {
    public final /* synthetic */ PMQ A00;

    public PXY(PMQ pmq) {
        this.A00 = pmq;
    }

    public final void run() {
        TransitionSet interpolator = new AutoTransition().setInterpolator(new AccelerateDecelerateInterpolator());
        PMQ pmq = this.A00;
        AnonymousClass0eM r2 = pmq.A09;
        TransitionManager.beginDelayedTransition(C66583MXo.A0C(r2), interpolator);
        ((C270354gb) pmq.A0H.getValue()).A0G((ConstraintLayout) r2.getValue());
    }
}
