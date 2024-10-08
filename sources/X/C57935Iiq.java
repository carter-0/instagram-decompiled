package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Iiq  reason: case insensitive filesystem */
public final class C57935Iiq implements Runnable {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ C250973mM A01;
    public final /* synthetic */ AnonymousClass6Z5 A02;

    public C57935Iiq(AnonymousClass4DH r1, C250973mM r2, AnonymousClass6Z5 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        if (this.A00.isVisible()) {
            C273384mU r5 = this.A02.A17;
            C250973mM r4 = this.A01;
            if (r4 != null) {
                ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r5;
                int CMI = reelViewerFragment.A1E.CMI(r4);
                C250973mM r0 = reelViewerFragment.A0a;
                if (r0 != null) {
                    if (r0.equals(r4)) {
                        if (reelViewerFragment.A2Q) {
                            reelViewerFragment.CpD();
                        } else {
                            ((C313046fl) reelViewerFragment.mViewPager).A04.A0L(CMI + 1, 0.0f);
                        }
                    }
                    C57933Iio iio = new C57933Iio(r4, reelViewerFragment, CMI);
                    C313056fm r1 = reelViewerFragment.mViewPager;
                    if (r1 == null || !r1.isIdle()) {
                        reelViewerFragment.A1o = iio;
                    } else {
                        ((C313046fl) r1).A02.post(iio);
                    }
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
