package X;

import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.Wgo  reason: case insensitive filesystem */
public final class C19862Wgo implements X5Q {
    public final /* synthetic */ ReelDashboardFragment A00;
    public final /* synthetic */ String A01;

    public C19862Wgo(ReelDashboardFragment reelDashboardFragment, String str) {
        this.A00 = reelDashboardFragment;
        this.A01 = str;
    }

    public final void DzV(C17700VcV vcV, Boolean bool, String str, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, int i2, int i3, boolean z, boolean z2) {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        List A012 = ReelDashboardFragment.A01(list6);
        C14625TzX tzX = reelDashboardFragment.mListAdapter;
        String str2 = this.A01;
        if (!list2.isEmpty() || list6 == null) {
            list6 = list2;
        }
        if (!list5.isEmpty()) {
            A012 = list5;
        }
        tzX.A0B(str2, str, list6, A012);
        reelDashboardFragment.mListAdapter.A09(str2, list3);
    }
}
