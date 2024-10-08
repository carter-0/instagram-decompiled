package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.M5e  reason: case insensitive filesystem */
public final /* synthetic */ class C65941M5e implements Runnable {
    public final /* synthetic */ C309626Yz A00;

    public /* synthetic */ C65941M5e(C309626Yz r1) {
        this.A00 = r1;
    }

    public final void run() {
        ReelViewerFragment reelViewerFragment = this.A00.A00;
        C59689JTv.A0B(reelViewerFragment.requireActivity(), "superlative_story_failed");
        reelViewerFragment.onBackPressed();
    }
}
