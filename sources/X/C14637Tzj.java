package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Tzj  reason: case insensitive filesystem */
public final class C14637Tzj implements C252293os, C256103vE {
    public final /* synthetic */ ReelDashboardFragment A00;

    public final /* synthetic */ void DW9(int i, int i2, boolean z) {
    }

    public final /* synthetic */ void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    public C14637Tzj(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final void DVx(int i, int i2) {
        Long A002;
        ReelDashboardFragment reelDashboardFragment = this.A00;
        ReelDashboardFragment.A0D(reelDashboardFragment, i);
        if (i != i2) {
            ReelDashboardFragment.A0C(reelDashboardFragment, i);
            if (reelDashboardFragment.A08 != null) {
                W0E A003 = C14639Tzl.A00(reelDashboardFragment.A06);
                if (i2 < reelDashboardFragment.A08.A02(reelDashboardFragment.A06)) {
                    A003.A04(reelDashboardFragment.A08.A0A(reelDashboardFragment.A06, i2).A0j, "navigation");
                }
                if (i < reelDashboardFragment.A08.A02(reelDashboardFragment.A06)) {
                    String str = reelDashboardFragment.A08.A0A(reelDashboardFragment.A06, i).A0j;
                    A003.A02(reelDashboardFragment.A08.A0A(reelDashboardFragment.A06, i), "dashboard_navigation");
                    if (reelDashboardFragment.A0Y.contains(str)) {
                        A003.A03(str);
                        if (W0E.A01(A003, str) && (A002 = W0E.A00(A003, str)) != null) {
                            A003.A02.flowEndSuccess(A002.longValue());
                        }
                    }
                }
            }
        }
    }

    public final void DVz(int i) {
        this.A00.mListAdapter.A08(i, true);
    }

    public final void DW0(int i) {
        this.A00.mListAdapter.A08(i, false);
    }

    public final void DhK(AnonymousClass3TF r4, float f, float f2) {
        ReelDashboardFragment reelDashboardFragment = this.A00;
        if (reelDashboardFragment.mListViewPager == reelDashboardFragment.mScrollOwner) {
            reelDashboardFragment.A03.A06((double) f);
        }
    }

    public final void DhS(AnonymousClass3TF r4, AnonymousClass3TF r5) {
        ReelDashboardFragment reelDashboardFragment;
        ReboundViewPager reboundViewPager;
        AnonymousClass3TF r1 = AnonymousClass3TF.IDLE;
        if ((r4 != r1 && this.A00.mScrollOwner == null) || r4 == AnonymousClass3TF.DRAGGING) {
            reelDashboardFragment = this.A00;
            reboundViewPager = reelDashboardFragment.mListViewPager;
        } else if (r4 == r1) {
            reelDashboardFragment = this.A00;
            if (reelDashboardFragment.mListViewPager == reelDashboardFragment.mScrollOwner) {
                reboundViewPager = null;
            } else {
                return;
            }
        } else {
            return;
        }
        reelDashboardFragment.mScrollOwner = reboundViewPager;
    }
}
