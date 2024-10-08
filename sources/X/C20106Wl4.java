package X;

import android.graphics.RectF;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Wl4  reason: case insensitive filesystem */
public final class C20106Wl4 implements Runnable {
    public final /* synthetic */ ReelDashboardFragment A00;

    public C20106Wl4(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    public final void run() {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        if (reelDashboardFragment.isVisible()) {
            RectF A002 = ReelDashboardFragment.A00(reelDashboardFragment);
            1OP.A07(reelDashboardFragment.requireActivity(), reelDashboardFragment.A06).A0W((RectF) null, A002, reelDashboardFragment, new C14614TzL(A002, this));
        }
    }
}
