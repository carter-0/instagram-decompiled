package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6j7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C314956j7 implements Runnable {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ C314956j7(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void run() {
        int i;
        ReelViewerFragment reelViewerFragment = this.A00;
        C313056fm r0 = reelViewerFragment.mViewPager;
        if (r0 != null && (i = ((C313046fl) r0).A04.A08) != -1) {
            C311576cu r3 = reelViewerFragment.A1a;
            boolean z = reelViewerFragment.A0c.A0E;
            C311266cP r1 = reelViewerFragment.A1V;
            0qQ.A0B(r1, 2);
            r3.A00(r1, (String) null, i, z);
        }
    }
}
