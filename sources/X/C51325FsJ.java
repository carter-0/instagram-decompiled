package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.FsJ  reason: case insensitive filesystem */
public final /* synthetic */ class C51325FsJ implements Runnable {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ C51325FsJ(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void run() {
        ReelViewerFragment reelViewerFragment = this.A00;
        C255773uh Au5 = reelViewerFragment.Au5();
        if (reelViewerFragment.A0a != null && Au5 != null && Au5.A0b != null) {
            reelViewerFragment.EHY("tapped");
            reelViewerFragment.A3G.A0F(Au5, reelViewerFragment.A0a, EW0.STORY_REQUEST_MENTION, reelViewerFragment.A2F);
        }
    }
}
