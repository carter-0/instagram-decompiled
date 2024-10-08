package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6gf  reason: invalid class name and case insensitive filesystem */
public final class C313576gf implements C313546gc {
    public final /* synthetic */ ReelViewerFragment A00;

    public C313576gf(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final long AXh() {
        C313426gQ r1 = this.A00.mVideoPlayer;
        if (r1 != null) {
            return (long) C313416gP.A01((C313416gP) r1, true);
        }
        return 0;
    }

    public final long Aug() {
        return (long) this.A00.mVideoPlayer.getCurrentPositionMs();
    }

    public final void EqI(C17291VPs vPs) {
        this.A00.A1O = vPs;
    }
}
