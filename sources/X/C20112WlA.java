package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.WlA  reason: case insensitive filesystem */
public final class C20112WlA implements Runnable {
    public final /* synthetic */ C19467WaF A00;

    public C20112WlA(C19467WaF waF) {
        this.A00 = waF;
    }

    public final void run() {
        C310236ae r3 = this.A00.A01;
        C273384mU r2 = r3.A0F;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r2;
        C317766nn r1 = reelViewerFragment.A0t;
        if (r1 == null || !r1.A0O(reelViewerFragment.requireContext())) {
            r2.EHd();
        }
        r3.A04 = false;
    }
}
