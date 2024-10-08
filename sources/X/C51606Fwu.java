package X;

import com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Fwu  reason: case insensitive filesystem */
public final /* synthetic */ class C51606Fwu implements 0sP {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C51606Fwu(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final Object invoke(Object obj) {
        UserDetailFragment userDetailFragment = this.A00;
        int A0M = AnonymousClass7TE.A0M(obj);
        if (A0M > 0) {
            C322486vu r2 = userDetailFragment.A13.A00;
            FanClubGuidedActivationProfileBannerParams fanClubGuidedActivationProfileBannerParams = new FanClubGuidedActivationProfileBannerParams(A0M);
            if (r2.A06 != fanClubGuidedActivationProfileBannerParams) {
                r2.A06 = fanClubGuidedActivationProfileBannerParams;
                r2.A00();
            }
        }
        return C60340gF.A00;
    }
}
