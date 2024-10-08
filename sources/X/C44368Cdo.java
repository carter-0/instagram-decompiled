package X;

import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cdo  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44368Cdo {
    public static Map A00(DV3 dv3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dv3.getBeneficiaryName() != null) {
            A1H.put("beneficiary_name", dv3.getBeneficiaryName());
        }
        String str2 = null;
        if (dv3.Afh() != null) {
            BeneficiaryType Afh = dv3.Afh();
            if (Afh != null) {
                str = Afh.A00;
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(261), str);
        }
        if (dv3.getBeneficiaryUsername() != null) {
            A1H.put("beneficiary_username", dv3.getBeneficiaryUsername());
        }
        dv3.Al4();
        A1H.put("can_viewer_share_to_feed", Boolean.valueOf(dv3.Al4()));
        if (dv3.B1d() != null) {
            A1H.put("end_time", dv3.B1d());
        }
        if (dv3.getFormattedFundraiserProgressInfoText() != null) {
            A1H.put("formatted_fundraiser_progress_info_text", dv3.getFormattedFundraiserProgressInfoText());
        }
        if (dv3.getFormattedGoalAmount() != null) {
            A1H.put("formatted_goal_amount", dv3.getFormattedGoalAmount());
        }
        if (dv3.getFundraiserId() != null) {
            A1H.put("fundraiser_id", dv3.getFundraiserId());
        }
        if (dv3.getFundraiserTitle() != null) {
            A1H.put("fundraiser_title", dv3.getFundraiserTitle());
        }
        if (dv3.B8e() != null) {
            FundraiserCampaignTypeEnum B8e = dv3.B8e();
            if (B8e != null) {
                str2 = B8e.A00;
            }
            A1H.put("fundraiser_type", str2);
        }
        dv3.BAV();
        A1H.put("has_active_fundraiser", Boolean.valueOf(dv3.BAV()));
        if (dv3.getOwnerUsername() != null) {
            A1H.put("owner_username", dv3.getOwnerUsername());
        }
        if (dv3.Bbc() != null) {
            A1H.put("percent_raised", dv3.Bbc());
        }
        if (dv3.getThumbnailDisplayUrl() != null) {
            A1H.put("thumbnail_display_url", dv3.getThumbnailDisplayUrl());
        }
        if (dv3.CCw() != null) {
            UserRoleOnFundraiser CCw = dv3.CCw();
            0qQ.A0B(CCw, 0);
            A1H.put("user_role", CCw.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
