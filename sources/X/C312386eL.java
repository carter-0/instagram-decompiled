package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6eL  reason: invalid class name and case insensitive filesystem */
public final class C312386eL implements C256093vD {
    public final ReelViewerFragment A00;

    public final void CsI(0sP r3, int i, int i2, int i3, int i4) {
        if (i < i2 || i3 > i4) {
            this.A00.A0T(false);
        }
        if (i2 < i || i3 < i4) {
            this.A00.A0T(true);
        }
    }

    public C312386eL(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }
}
