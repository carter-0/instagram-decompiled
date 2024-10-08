package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.BeneficiaryType;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

public final class BGV extends AnonymousClass0T0 implements DV3 {
    public final BeneficiaryType A00;
    public final UserRoleOnFundraiser A01;
    public final FundraiserCampaignTypeEnum A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final BGV F9L() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGV) {
                BGV bgv = (BGV) obj;
                if (!0qQ.A0K(this.A05, bgv.A05) || this.A00 != bgv.A00 || !0qQ.A0K(this.A06, bgv.A06) || this.A0D != bgv.A0D || !0qQ.A0K(this.A04, bgv.A04) || !0qQ.A0K(this.A07, bgv.A07) || !0qQ.A0K(this.A08, bgv.A08) || !0qQ.A0K(this.A09, bgv.A09) || !0qQ.A0K(this.A0A, bgv.A0A) || this.A02 != bgv.A02 || this.A0E != bgv.A0E || !0qQ.A0K(this.A0B, bgv.A0B) || !0qQ.A0K(this.A03, bgv.A03) || !0qQ.A0K(this.A0C, bgv.A0C) || this.A01 != bgv.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public BGV(BeneficiaryType beneficiaryType, UserRoleOnFundraiser userRoleOnFundraiser, FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        0qQ.A0B(userRoleOnFundraiser, 15);
        this.A05 = str;
        this.A00 = beneficiaryType;
        this.A06 = str2;
        this.A0D = z;
        this.A04 = l;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A02 = fundraiserCampaignTypeEnum;
        this.A0E = z2;
        this.A0B = str7;
        this.A03 = num;
        this.A0C = str8;
        this.A01 = userRoleOnFundraiser;
    }

    public final BeneficiaryType Afh() {
        return this.A00;
    }

    public final boolean Al4() {
        return this.A0D;
    }

    public final Long B1d() {
        return this.A04;
    }

    public final FundraiserCampaignTypeEnum B8e() {
        return this.A02;
    }

    public final boolean BAV() {
        return this.A0E;
    }

    public final Integer Bbc() {
        return this.A03;
    }

    public final UserRoleOnFundraiser CCw() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStandaloneFundraiserDict", C44368Cdo.A00(this));
    }

    public final String getBeneficiaryName() {
        return this.A05;
    }

    public final String getBeneficiaryUsername() {
        return this.A06;
    }

    public final String getFormattedFundraiserProgressInfoText() {
        return this.A07;
    }

    public final String getFormattedGoalAmount() {
        return this.A08;
    }

    public final String getFundraiserId() {
        return this.A09;
    }

    public final String getFundraiserTitle() {
        return this.A0A;
    }

    public final String getOwnerUsername() {
        return this.A0B;
    }

    public final String getThumbnailDisplayUrl() {
        return this.A0C;
    }

    public final int hashCode() {
        boolean z = this.A0D;
        boolean z2 = this.A0E;
        return AnonymousClass7TE.A0N(this.A01, (((((AnonymousClass7TF.A09(z2, (((((((((((AnonymousClass7TF.A09(z, ((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + C41845B3m.A00(this.A0C)) * 31);
    }
}
