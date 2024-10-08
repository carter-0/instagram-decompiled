package X;

import android.view.View;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Wl5  reason: case insensitive filesystem */
public final class C20107Wl5 implements Runnable {
    public final /* synthetic */ ReelDashboardFragment A00;

    public C20107Wl5(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    public final void run() {
        View view;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        if (!ReelDashboardFragment.A0E(reelDashboardFragment) && (view = reelDashboardFragment.mView) != null) {
            Runnable runnable = reelDashboardFragment.A0W;
            view.removeCallbacks(runnable);
            view.postDelayed(runnable, 0);
        }
    }
}
