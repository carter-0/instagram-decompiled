package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Iio  reason: case insensitive filesystem */
public final /* synthetic */ class C57933Iio implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C250973mM A01;
    public final /* synthetic */ ReelViewerFragment A02;

    public /* synthetic */ C57933Iio(C250973mM r1, ReelViewerFragment reelViewerFragment, int i) {
        this.A02 = reelViewerFragment;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        ReelViewerFragment reelViewerFragment = this.A02;
        C250973mM r1 = this.A01;
        int i = this.A00;
        ((C310566bG) reelViewerFragment.A1E).A0B.A02(r1);
        reelViewerFragment.A1E.notifyDataSetChanged();
        C313056fm r0 = reelViewerFragment.mViewPager;
        if (r0 != null) {
            ReboundViewPager reboundViewPager = ((C313046fl) r0).A04;
            reboundViewPager.A0H((float) Math.min(reboundViewPager.A08, i));
        }
    }
}
