package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Ii4  reason: case insensitive filesystem */
public final /* synthetic */ class C57887Ii4 implements Runnable {
    public final /* synthetic */ ReelViewerFragment A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C57887Ii4(ReelViewerFragment reelViewerFragment, boolean z) {
        this.A00 = reelViewerFragment;
        this.A01 = z;
    }

    public final void run() {
        ReelViewerFragment reelViewerFragment = this.A00;
        ((C313046fl) reelViewerFragment.mViewPager).A04.A0M(1, this.A01);
    }
}
