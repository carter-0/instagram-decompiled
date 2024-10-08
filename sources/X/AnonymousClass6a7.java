package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6a7  reason: invalid class name */
public final class AnonymousClass6a7 {
    public final /* synthetic */ ReelViewerFragment A00;

    public AnonymousClass6a7(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void A00() {
        ReelViewerFragment reelViewerFragment = this.A00;
        ReelViewerFragment.A0I(reelViewerFragment, false);
        C250973mM r2 = reelViewerFragment.A0a;
        if (r2 != null) {
            C309426Yf Bz3 = reelViewerFragment.A1E.Bz3(r2.A08(reelViewerFragment.getSession()));
            double currentTimeMillis = (double) System.currentTimeMillis();
            double d = Bz3.A02;
            if (d != -1.0d) {
                Bz3.A04 += currentTimeMillis - d;
            }
            Bz3.A02 = -1.0d;
        }
    }

    public final void A01() {
        ReelViewerFragment reelViewerFragment = this.A00;
        ReelViewerFragment.A0G(reelViewerFragment, "context_sheet");
        C250973mM r2 = reelViewerFragment.A0a;
        if (r2 != null) {
            C309426Yf Bz3 = reelViewerFragment.A1E.Bz3(r2.A08(reelViewerFragment.getSession()));
            double currentTimeMillis = (double) System.currentTimeMillis();
            if (Bz3.A02 == -1.0d) {
                Bz3.A02 = currentTimeMillis;
            }
        }
        C312276e7 r3 = reelViewerFragment.A18;
        Dc2 dc2 = r3.A00;
        if (dc2 != null) {
            1xC.A01.A00(new AnonymousClass3GR(dc2));
        }
        r3.A00 = null;
    }
}
