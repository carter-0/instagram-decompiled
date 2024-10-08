package X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: X.PXJ  reason: case insensitive filesystem */
public final class C73125PXJ implements Runnable {
    public final /* synthetic */ C68079Mzk A00;

    public C73125PXJ(C68079Mzk mzk) {
        this.A00 = mzk;
    }

    public final void run() {
        C68079Mzk mzk = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View view = mzk.A05;
        if (view.getVisibility() == 0) {
            C66580MXl.A1D(C51972G9s.A0I(view).setStartDelay(2000).setInterpolator(new AccelerateDecelerateInterpolator()), new C73124PXI(mzk));
        }
    }
}
