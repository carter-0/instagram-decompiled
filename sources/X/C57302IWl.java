package X;

import com.instagram.model.reels.Reel;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.Map;

/* renamed from: X.IWl  reason: case insensitive filesystem */
public final class C57302IWl implements C279314yR {
    public final int A00;
    public final Object A01;

    public C57302IWl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dok(Map map) {
        Reel reel;
        if (this.A00 != 0) {
            ReelDashboardFragment.A0E((ReelDashboardFragment) this.A01);
            return;
        }
        C53040GhW ghW = (C53040GhW) this.A01;
        if (map != null) {
            reel = (Reel) map.get(ghW.A0B);
        } else {
            reel = null;
        }
        C53040GhW.A02(ghW, reel);
    }

    public final void onFailure() {
        if (this.A00 == 0) {
            C53040GhW ghW = (C53040GhW) this.A01;
            C53040GhW.A02(ghW, C53040GhW.A00(ghW));
        }
    }
}
