package X;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.PXZ  reason: case insensitive filesystem */
public final class C73138PXZ implements Runnable {
    public final /* synthetic */ PMQ A00;

    public C73138PXZ(PMQ pmq) {
        this.A00 = pmq;
    }

    public final void run() {
        AutoTransition autoTransition = new AutoTransition();
        PMQ pmq = this.A00;
        TransitionSet addListener = autoTransition.addListener(pmq.A04);
        AnonymousClass0eM r2 = pmq.A09;
        TransitionManager.beginDelayedTransition(C66583MXo.A0C(r2), addListener);
        ((C270354gb) pmq.A0L.getValue()).A0G((ConstraintLayout) r2.getValue());
    }
}
