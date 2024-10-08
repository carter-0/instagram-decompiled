package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;
import com.instagram.api.schemas.UserRoleOnFundraiser;

public final class BGW extends AnonymousClass0T0 implements C46322DUz {
    public final int A00;
    public final long A01;
    public final FundraiserVisibilityOnProfileStatus A02;
    public final UserRoleOnFundraiser A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public final BGW F9M() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGW) {
                BGW bgw = (BGW) obj;
                if (this.A0A != bgw.A0A || !0qQ.A0K(this.A04, bgw.A04) || this.A01 != bgw.A01 || !0qQ.A0K(this.A05, bgw.A05) || !0qQ.A0K(this.A06, bgw.A06) || !0qQ.A0K(this.A07, bgw.A07) || !0qQ.A0K(this.A08, bgw.A08) || this.A02 != bgw.A02 || !0qQ.A0K(this.A09, bgw.A09) || this.A00 != bgw.A00 || this.A03 != bgw.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Amv() {
        return this.A04;
    }

    public final FundraiserVisibilityOnProfileStatus B8g() {
        return this.A02;
    }

    public final int Bbb() {
        return this.A00;
    }

    public final UserRoleOnFundraiser CCw() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStandaloneFundraiserDictV2", C44370Cdq.A00(this));
    }

    public final boolean getCanViewerDonate() {
        return this.A0A;
    }

    public final long getEndTime() {
        return this.A01;
    }

    public final String getFormattedFundraiserProgressInfoText() {
        return this.A05;
    }

    public final String getFormattedGoalAmount() {
        return this.A06;
    }

    public final String getFundraiserId() {
        return this.A07;
    }

    public final String getFundraiserTitle() {
        return this.A08;
    }

    public final String getOwnerUsername() {
        return this.A09;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A01(this.A01, ((i * 31) + AnonymousClass7TG.A0E(this.A04)) * 31))))));
        return AnonymousClass7TE.A0N(this.A03, (AnonymousClass7TF.A08(this.A09, A072) + this.A00) * 31);
    }

    public BGW(FundraiserVisibilityOnProfileStatus fundraiserVisibilityOnProfileStatus, UserRoleOnFundraiser userRoleOnFundraiser, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, boolean z) {
        AnonymousClass7TG.A1R(str2, str3);
        0qQ.A0B(str4, 6);
        AnonymousClass7TF.A1F(str5, 7, fundraiserVisibilityOnProfileStatus);
        0qQ.A0B(str6, 9);
        0qQ.A0B(userRoleOnFundraiser, 11);
        this.A0A = z;
        this.A04 = str;
        this.A01 = j;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A02 = fundraiserVisibilityOnProfileStatus;
        this.A09 = str6;
        this.A00 = i;
        this.A03 = userRoleOnFundraiser;
    }
}
