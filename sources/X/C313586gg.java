package X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6gg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C313586gg implements 0sL {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ C313586gg(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        ReelViewerFragment reelViewerFragment = this.A00;
        String str = (String) obj;
        String str2 = (String) obj2;
        C310566bG r2 = (C310566bG) reelViewerFragment.A1E;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        C250973mM Bl0 = r2.Bl0(str);
        Reel A0M = ReelStore.A03(r2.A06).A0M(str2);
        if (!(Bl0 == null || A0M == null)) {
            r2.EzG(A0M, Bl0);
        }
        reelViewerFragment.FK0(-1);
        reelViewerFragment.A1E.notifyDataSetChanged();
        return C60340gF.A00;
    }
}
