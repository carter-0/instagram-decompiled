package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6fv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C313126fv implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ C313126fv(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void onSystemUiVisibilityChange(int i) {
        ReelViewerFragment reelViewerFragment = this.A00;
        C313056fm r0 = reelViewerFragment.mViewPager;
        if (r0 != null && ((C313046fl) r0).A04.A0F != null && reelViewerFragment.isResumed() && C316216lI.A0A(reelViewerFragment.requireContext())) {
            ReboundViewPager reboundViewPager = ((C313046fl) reelViewerFragment.mViewPager).A04;
            reboundViewPager.A0H((float) reboundViewPager.A08);
        }
    }
}
