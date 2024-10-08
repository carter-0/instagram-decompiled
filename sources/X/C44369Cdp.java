package X;

import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import java.io.IOException;

/* renamed from: X.Cdp  reason: case insensitive filesystem */
public abstract class C44369Cdp {
    public static BGV parseFromJson(16F r23) {
        String str;
        String str2;
        String str3;
        16F r1 = r23;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str4 = null;
            BeneficiaryType beneficiaryType = null;
            String str5 = null;
            Long l = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum = null;
            String str10 = null;
            Integer num = null;
            String str11 = null;
            UserRoleOnFundraiser userRoleOnFundraiser = null;
            while (r1.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r1);
                if ("beneficiary_name".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(261).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                    beneficiaryType = (BeneficiaryType) BeneficiaryType.A01.get(str3);
                    if (beneficiaryType == null) {
                        beneficiaryType = BeneficiaryType.UNRECOGNIZED;
                    }
                } else if ("beneficiary_username".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("can_viewer_share_to_feed".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r1);
                } else if ("end_time".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r1);
                } else if ("formatted_fundraiser_progress_info_text".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("formatted_goal_amount".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if ("fundraiser_id".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if ("fundraiser_title".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if ("fundraiser_type".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                    fundraiserCampaignTypeEnum = (FundraiserCampaignTypeEnum) FundraiserCampaignTypeEnum.A01.get(str2);
                    if (fundraiserCampaignTypeEnum == null) {
                        fundraiserCampaignTypeEnum = FundraiserCampaignTypeEnum.UNRECOGNIZED;
                    }
                } else if ("has_active_fundraiser".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r1);
                } else if ("owner_username".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                } else if ("percent_raised".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r1);
                } else if ("thumbnail_display_url".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r1.A1P();
                    }
                } else if ("user_role".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                    userRoleOnFundraiser = (UserRoleOnFundraiser) UserRoleOnFundraiser.A01.get(str);
                    if (userRoleOnFundraiser == null) {
                        userRoleOnFundraiser = UserRoleOnFundraiser.UNRECOGNIZED;
                    }
                }
                r1.A0z();
            }
            if (bool == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_viewer_share_to_feed", r1, "StandaloneFundraiserDictImpl");
            } else if (bool2 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_active_fundraiser", r1, "StandaloneFundraiserDictImpl");
            } else if (userRoleOnFundraiser != null || !(r1 instanceof 0c9)) {
                return new BGV(beneficiaryType, userRoleOnFundraiser, fundraiserCampaignTypeEnum, num, l, str4, str5, str6, str7, str8, str9, str10, str11, bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("user_role", r1, "StandaloneFundraiserDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
