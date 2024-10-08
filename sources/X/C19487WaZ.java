package X;

import android.graphics.RectF;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.WaZ  reason: case insensitive filesystem */
public final class C19487WaZ implements AnonymousClass6WJ {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ ReelDashboardFragment A01;

    public C19487WaZ(RectF rectF, ReelDashboardFragment reelDashboardFragment) {
        this.A01 = reelDashboardFragment;
        this.A00 = rectF;
    }

    public final void DaE(float f) {
        ReelDashboardFragment.A04(this.A00, this.A01, f);
    }

    public final void Dfo(String str) {
        ReelDashboardFragment reelDashboardFragment = this.A01;
        if (!reelDashboardFragment.isResumed()) {
            onCancel();
            return;
        }
        reelDashboardFragment.A0F = true;
        ReelDashboardFragment.A0B(reelDashboardFragment);
    }

    public final void onCancel() {
        ReelDashboardFragment.A04(this.A00, this.A01, 0.0f);
    }
}
