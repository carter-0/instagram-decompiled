package X;

import android.app.Activity;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.tagging.activity.TaggingActivity;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class KIC extends AnonymousClass4HF {
    public final int A00;
    public final Object A01;

    public KIC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DVx(int i, int i2) {
        Activity requireActivity;
        if (1 - this.A00 != 0) {
            super.DVx(i, i2);
            return;
        }
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
        ReelDashboardFragment.A0D(reelDashboardFragment, i);
        if (reelDashboardFragment.getRootActivity() != null) {
            requireActivity = reelDashboardFragment.getRootActivity();
        } else {
            requireActivity = reelDashboardFragment.requireActivity();
        }
        0nA.A0J(requireActivity);
        if (reelDashboardFragment.mImageViewPager == reelDashboardFragment.mScrollOwner) {
            reelDashboardFragment.mListViewPager.A0K(i);
            JTP.A1K(reelDashboardFragment.A03, reelDashboardFragment.mListViewPager.A01);
        }
    }

    public final void DW9(int i, int i2, boolean z) {
        if (this.A00 != 0) {
            super.DW9(i, i2, z);
        } else {
            TaggingActivity.A0F((TaggingActivity) this.A01);
        }
    }

    public final void DhS(AnonymousClass3TF r4, AnonymousClass3TF r5) {
        ReboundViewPager reboundViewPager;
        if (1 - this.A00 != 0) {
            super.DhS(r4, r5);
            return;
        }
        AnonymousClass3TF r0 = AnonymousClass3TF.IDLE;
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
        if (r4 != r0) {
            if (reelDashboardFragment.mScrollOwner == null) {
                reboundViewPager = reelDashboardFragment.mImageViewPager;
            } else {
                return;
            }
        } else if (reelDashboardFragment.mImageViewPager == reelDashboardFragment.mScrollOwner) {
            reboundViewPager = null;
        } else {
            return;
        }
        reelDashboardFragment.mScrollOwner = reboundViewPager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 < r0.size()) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dpz(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0008
            super.Dpz(r5, r6)
            return
        L_0x0008:
            java.lang.Object r2 = r4.A01
            com.instagram.tagging.activity.TaggingActivity r2 = (com.instagram.tagging.activity.TaggingActivity) r2
            java.lang.String r1 = "mediaTaggingInfos"
            r3 = 0
            if (r6 < 0) goto L_0x0054
            java.util.ArrayList r0 = r2.A0M
            if (r0 == 0) goto L_0x005b
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x0054
        L_0x001b:
            r2.A00 = r6
            com.instagram.tagging.activity.TaggingActivity.A0E(r2)
            java.util.ArrayList r0 = r2.A0M
            if (r0 == 0) goto L_0x005b
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.JTO.A0p(r0, r5)
            X.1iA r1 = r0.A03
            X.1iA r0 = X.1iA.A0Q
            if (r1 != r0) goto L_0x0050
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r2.A05
            if (r0 == 0) goto L_0x0056
            android.view.View r0 = r0.A0D(r5)
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.tagging.activity.TaggingPhotoViewBinder.Holder"
            X.0qQ.A0C(r1, r0)
            X.Ka8 r1 = (X.C62103Ka8) r1
            com.instagram.tagging.widget.TagsInteractiveLayout r0 = r1.A01
            r0.AVW()
        L_0x0048:
            com.instagram.tagging.activity.TaggingActivity.A0C(r2)
            r0 = 0
            com.instagram.tagging.activity.TaggingActivity.A0Q(r2, r0)
            return
        L_0x0050:
            r2.DqQ(r3)
            goto L_0x0048
        L_0x0054:
            r6 = r5
            goto L_0x001b
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x005b:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIC.Dpz(int, int):void");
    }
}
