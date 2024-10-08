package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4B {
    public static Map A00(C65231bS r4) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r4.getBeneficiaryName() != null) {
            linkedHashMap.put("beneficiary_name", r4.getBeneficiaryName());
        }
        if (r4.getBeneficiaryUsername() != null) {
            linkedHashMap.put("beneficiary_username", r4.getBeneficiaryUsername());
        }
        if (r4.Akv() != null) {
            linkedHashMap.put("can_viewer_donate", r4.Akv());
        }
        if (r4.Akz() != null) {
            linkedHashMap.put("can_viewer_remove_fundraiser_tag", r4.Akz());
        }
        if (r4.getContextualTitleStr() != null) {
            linkedHashMap.put("contextual_title_str", r4.getContextualTitleStr());
        }
        if (r4.getFormattedAmountRaised() != null) {
            linkedHashMap.put("formatted_amount_raised", r4.getFormattedAmountRaised());
        }
        if (r4.getFormattedFundraiserProgressInfoText() != null) {
            linkedHashMap.put("formatted_fundraiser_progress_info_text", r4.getFormattedFundraiserProgressInfoText());
        }
        if (r4.getFormattedGoalAmount() != null) {
            linkedHashMap.put("formatted_goal_amount", r4.getFormattedGoalAmount());
        }
        if (r4.getFundraiserId() != null) {
            linkedHashMap.put("fundraiser_id", r4.getFundraiserId());
        }
        if (r4.getFundraiserOwnerUsername() != null) {
            linkedHashMap.put("fundraiser_owner_username", r4.getFundraiserOwnerUsername());
        }
        if (r4.getFundraiserTitle() != null) {
            linkedHashMap.put("fundraiser_title", r4.getFundraiserTitle());
        }
        String str2 = null;
        if (r4.B8e() != null) {
            FundraiserCampaignTypeEnum B8e = r4.B8e();
            if (B8e != null) {
                str = B8e.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("fundraiser_type", str);
        }
        if (r4.BC9() != null) {
            linkedHashMap.put("has_standalone_fundraiser", r4.BC9());
        }
        if (r4.CX6() != null) {
            linkedHashMap.put("is_media_owner_fundraiser_owner", r4.CX6());
        }
        if (r4.getProgressStr() != null) {
            linkedHashMap.put("progress_str", r4.getProgressStr());
        }
        if (r4.BvT() != null) {
            linkedHashMap.put("show_fundraiser_owner_attribution", r4.BvT());
        }
        if (r4.C6s() != null) {
            ImageUrl C6s = r4.C6s();
            if (C6s != null) {
                str2 = C6s.getUrl();
            }
            linkedHashMap.put("thumbnail_display_url", str2);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
