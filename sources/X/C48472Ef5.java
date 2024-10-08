package X;

import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.Ef5  reason: case insensitive filesystem */
public abstract class C48472Ef5 {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        IgFragmentActivity A04 = C308206Td.A04(r7);
        0qQ.A0C(A04, Pxd.A00(9));
        IgFragmentActivity igFragmentActivity = A04;
        Object A0f = DbW.A0f(r8);
        C49877FBb fBb = new C49877FBb((Fragment) null, igFragmentActivity, DbW.A0R(r7), (F3F) null, "guidance_recommendation", 56);
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType = (FanClubNextStepsRecommendationsType) FanClubNextStepsRecommendationsType.A01.get(A0f);
        if (fanClubNextStepsRecommendationsType == null) {
            fanClubNextStepsRecommendationsType = FanClubNextStepsRecommendationsType.UNRECOGNIZED;
        }
        fBb.A02(fanClubNextStepsRecommendationsType, AnonymousClass05K.A04);
        igFragmentActivity.registerOnActivityResultListener(new C50298FXd(1, fBb, igFragmentActivity));
        return null;
    }
}
