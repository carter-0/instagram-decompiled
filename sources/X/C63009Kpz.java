package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Kpz  reason: case insensitive filesystem */
public abstract class C63009Kpz {
    public static final 1OC A00(1NY r2, IGCreatorIncentiveProgramFetchEntryPoint iGCreatorIncentiveProgramFetchEntryPoint, Integer num, String str) {
        r2.A05();
        r2.A02();
        r2.A0A("api/v1/creators/incentive_platform/get_bonuses_deal_metadata_lists/");
        r2.A0Q(CEK.class, C45511Cxl.class);
        if (str != null) {
            r2.A9m("m_pk", str);
        }
        if (iGCreatorIncentiveProgramFetchEntryPoint != null) {
            r2.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, iGCreatorIncentiveProgramFetchEntryPoint.A00);
        }
        if (num != null) {
            r2.A0C("scheduled_time", num.intValue());
        }
        1OC A0M = r2.A0M();
        0qQ.A0C(A0M, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BonusesDealsMetadataResponseIntf>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BonusesDealsMetadataResponseIntf>>");
        return A0M;
    }
}
