package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.M5b  reason: case insensitive filesystem */
public final /* synthetic */ class C65938M5b implements Runnable {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ C65938M5b(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void run() {
        ReelViewerFragment reelViewerFragment = this.A00;
        String str = reelViewerFragment.A1w;
        if (str != null) {
            reelViewerFragment.mBalloonsAnimationController.A02(new C65777LzV(reelViewerFragment, 2), str);
        }
    }
}
