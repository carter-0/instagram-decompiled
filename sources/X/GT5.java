package X;

import instagram.features.stories.fragment.ReelViewerFragment;

public final /* synthetic */ class GT5 implements C62320sa {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ GT5(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final Object invoke() {
        ReelViewerFragment reelViewerFragment = this.A00;
        reelViewerFragment.A1E.notifyDataSetChanged();
        ReelViewerFragment.A0I(reelViewerFragment, false);
        return C60340gF.A00;
    }
}
