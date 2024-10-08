package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Wl6  reason: case insensitive filesystem */
public final class C20108Wl6 implements Runnable {
    public final /* synthetic */ WZ9 A00;

    public C20108Wl6(WZ9 wz9) {
        this.A00 = wz9;
    }

    public final void run() {
        ReelDashboardFragment reelDashboardFragment = this.A00.A00;
        ReboundViewPager reboundViewPager = reelDashboardFragment.mListViewPager;
        if (reboundViewPager != null) {
            reboundViewPager.A0H(reboundViewPager.A01);
            ReboundViewPager reboundViewPager2 = reelDashboardFragment.mImageViewPager;
            reboundViewPager2.A0H(reboundViewPager2.A01);
        }
    }
}
