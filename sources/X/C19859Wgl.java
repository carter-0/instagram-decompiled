package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.Wgl  reason: case insensitive filesystem */
public final class C19859Wgl implements X5P {
    public final /* synthetic */ C14651Tzx A00;

    public C19859Wgl(C14651Tzx tzx) {
        this.A00 = tzx;
    }

    public final void DEw(Boolean bool, String str, List list, List list2, List list3, int i, int i2) {
        Long A002;
        if (i2 > 0 && list.isEmpty() && list3.isEmpty()) {
            C14651Tzx tzx = this.A00;
            W0E A003 = C14639Tzl.A00(((ReelDashboardFragment) tzx.A01).A06);
            String str2 = tzx.A03;
            if (W0E.A01(A003, str2) && (A002 = W0E.A00(A003, str2)) != null) {
                long longValue = A002.longValue();
                1QP r4 = A003.A02;
                r4.flowAnnotate(longValue, TraceFieldType.FailureReason, "fb_viewers_list_empty");
                r4.flowEndFail(longValue, "fb_viewers_list_empty", (String) null);
            }
        }
        C14651Tzx tzx2 = this.A00;
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) tzx2.A01;
        ReboundViewPager reboundViewPager = reelDashboardFragment.mImageViewPager;
        ReboundViewPager reboundViewPager2 = reelDashboardFragment.mListViewPager;
        C14625TzX tzX = reelDashboardFragment.mListAdapter;
        if (reboundViewPager != null && reboundViewPager2 != null && tzX != null && str != null) {
            String str3 = tzx2.A03;
            C14629Tzb A01 = C14625TzX.A01(tzX, str3);
            if (A01 != null) {
                C255773uh r0 = A01.A0G;
                r0.getClass();
                r0.A0F = bool;
                r0.A00 = i;
                C255773uh r1 = A01.A0G;
                r1.getClass();
                r1.A0N = true;
            }
            tzX.A0B(str3, str, list, list3);
            reboundViewPager.A0H(reelDashboardFragment.mImageViewPager.A01);
            reboundViewPager2.A0H(reelDashboardFragment.mListViewPager.A01);
        }
    }
}
