package X;

import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;

/* renamed from: X.Fv0  reason: case insensitive filesystem */
public final /* synthetic */ class C51492Fv0 implements Runnable {
    public final /* synthetic */ ReelViewerFragment A00;
    public final /* synthetic */ ArrayList A01;
    public final /* synthetic */ ArrayList A02;

    public /* synthetic */ C51492Fv0(ReelViewerFragment reelViewerFragment, ArrayList arrayList, ArrayList arrayList2) {
        this.A00 = reelViewerFragment;
        this.A01 = arrayList;
        this.A02 = arrayList2;
    }

    public final void run() {
        ReelViewerFragment reelViewerFragment = this.A00;
        LSf.A02(reelViewerFragment.requireActivity(), reelViewerFragment, reelViewerFragment.getSession(), "superlative_share", "superlative_share", this.A01, this.A02);
        reelViewerFragment.A1p = null;
    }
}
