package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6gO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C313406gO implements AnonymousClass0eK {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ C313406gO(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final Object get() {
        int i;
        C313426gQ r0 = this.A00.mVideoPlayer;
        if (r0 != null) {
            AnonymousClass4MN r02 = ((C313416gP) r0).A0M;
            if (r02 != null) {
                C263634Mt r2 = ((AnonymousClass4MM) r02).A09.A0I;
                C263684My r1 = (C263684My) r2.A0N.get();
                if (r2.A0I()) {
                    i = r1.A00;
                }
            }
            i = 0;
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
