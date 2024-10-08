package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

public interface DV3 {
    public static final D71 A00 = D71.A00;

    BeneficiaryType Afh();

    boolean Al4();

    Long B1d();

    FundraiserCampaignTypeEnum B8e();

    boolean BAV();

    Integer Bbc();

    UserRoleOnFundraiser CCw();

    BGV F9L();

    TreeUpdaterJNI FHC();

    String getBeneficiaryName();

    String getBeneficiaryUsername();

    String getFormattedFundraiserProgressInfoText();

    String getFormattedGoalAmount();

    String getFundraiserId();

    String getFundraiserTitle();

    String getOwnerUsername();

    String getThumbnailDisplayUrl();
}
