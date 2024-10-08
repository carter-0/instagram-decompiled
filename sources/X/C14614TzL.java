package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.TzL  reason: case insensitive filesystem */
public final class C14614TzL implements C51914G7i {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ C20106Wl4 A01;

    public final void DYb(int i, String str, boolean z) {
    }

    public C14614TzL(RectF rectF, C20106Wl4 wl4) {
        this.A01 = wl4;
        this.A00 = rectF;
    }

    public final void DJ6(boolean z, String str) {
        int count;
        View A0D;
        ReelDashboardFragment reelDashboardFragment = this.A01.A00;
        C14611TzI tzI = reelDashboardFragment.mPagerAdapter;
        if (tzI != null && (count = tzI.getCount() - 1) == 1 && reelDashboardFragment.mPagerAdapter.getItemViewType(count) == 1 && AnonymousClass7TE.A0q(reelDashboardFragment.A06).getInt("reel_dashboard_add_to_story_nux_seen_count", 0) < 3 && (A0D = reelDashboardFragment.mImageViewPager.A0D(count)) != null) {
            Context context = A0D.getContext();
            int A08 = C51972G9s.A08(context);
            AnonymousClass5Gt r2 = new AnonymousClass5Gt(reelDashboardFragment.requireActivity(), new C315476jx((CharSequence) context.getString(2131971468)));
            r2.A04(A0D, 0, (int) (C13988Tno.A01(A0D.getHeight()) + ((float) A08)), true);
            r2.A01();
            r2.A0F = true;
            r2.A0B = true;
            r2.A0A = false;
            r2.A04 = new KSP(reelDashboardFragment, 14);
            r2.A00().A07(reelDashboardFragment.A06);
        }
    }

    public final void DaE(float f) {
        ReelDashboardFragment.A04(this.A00, this.A01.A00, f);
    }
}
