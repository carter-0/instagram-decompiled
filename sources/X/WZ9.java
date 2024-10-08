package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class WZ9 implements C309616Yy {
    public final /* synthetic */ ReelDashboardFragment A00;

    public WZ9(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    public final void DaI(C270184gK r3) {
        if (r3.A00.A1f == AnonymousClass3QD.CONFIGURED) {
            r3.A01(this);
            this.A00.A0X.remove(r3);
        }
        ReboundViewPager reboundViewPager = this.A00.mListViewPager;
        if (reboundViewPager != null) {
            reboundViewPager.post(new C20108Wl6(this));
        }
    }
}
