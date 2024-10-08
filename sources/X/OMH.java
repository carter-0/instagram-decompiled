package X;

import android.view.ViewStub;

public final class OMH {
    public final /* synthetic */ NJW A00;

    public OMH(NJW njw) {
        this.A00 = njw;
    }

    public final void A00() {
        NJW njw = this.A00;
        if (njw.isAdded()) {
            C238143As r0 = njw.A03;
            if (r0 != null) {
                r0.EaP(false);
            }
            AnonymousClass7TH.A0R(njw.A04);
            ViewStub viewStub = njw.A00;
            if (viewStub != null) {
                viewStub.setVisibility(0);
            }
        }
    }

    public final void A01() {
        NJW njw = this.A00;
        if (njw.isAdded()) {
            C66582MXn.A16(njw);
        }
    }
}
