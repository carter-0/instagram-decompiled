package X;

import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.Wgm  reason: case insensitive filesystem */
public final class C19860Wgm implements X5P {
    public final /* synthetic */ ReelDashboardFragment A00;
    public final /* synthetic */ String A01;

    public C19860Wgm(ReelDashboardFragment reelDashboardFragment, String str) {
        this.A00 = reelDashboardFragment;
        this.A01 = str;
    }

    public final void DEw(Boolean bool, String str, List list, List list2, List list3, int i, int i2) {
        C14625TzX tzX = this.A00.mListAdapter;
        if (tzX != null && str != null) {
            String str2 = this.A01;
            tzX.A0B(str2, str, list, list3);
            tzX.A09(str2, list2);
        }
    }
}
