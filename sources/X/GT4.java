package X;

import android.view.View;
import instagram.features.stories.fragment.ReelViewerFragment;

public final /* synthetic */ class GT4 implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ReelViewerFragment A01;

    public /* synthetic */ GT4(ReelViewerFragment reelViewerFragment, int i) {
        this.A01 = reelViewerFragment;
        this.A00 = i;
    }

    public final Object invoke(Object obj) {
        C314696ih r0;
        ReelViewerFragment reelViewerFragment = this.A01;
        int i = this.A00;
        Object tag = ((View) obj).getTag();
        tag.getClass();
        C316026kz r3 = (C316026kz) tag;
        if (!reelViewerFragment.A2g || reelViewerFragment.A2U || ((r0 = reelViewerFragment.mSuggestedHighlightsController) != null && !(!r0.A01))) {
            r3.AGL();
        } else {
            View A0D = ((C313046fl) reelViewerFragment.mViewPager).A04.A0D(i);
            if (i > -1 && A0D != null) {
                C316026kz r2 = (C316026kz) A0D.getTag();
                C250973mM Bky = reelViewerFragment.A1E.Bky(i);
                if (!(Bky == null || Bky.A0E(reelViewerFragment.getSession()) || r2 == null)) {
                    r2.EI3();
                }
            }
            r3.Ex1();
        }
        return C60340gF.A00;
    }
}
