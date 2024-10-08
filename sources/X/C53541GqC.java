package X;

import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* renamed from: X.GqC  reason: case insensitive filesystem */
public final class C53541GqC extends AnonymousClass0T0 implements JM5 {
    public final FundraiserCampaignTypeEnum A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53541GqC) {
                C53541GqC gqC = (C53541GqC) obj;
                if (!0qQ.A0K(this.A02, gqC.A02) || !0qQ.A0K(this.A03, gqC.A03) || !0qQ.A0K(this.A04, gqC.A04) || !0qQ.A0K(this.A05, gqC.A05) || this.A00 != gqC.A00 || !0qQ.A0K(this.A07, gqC.A07) || !0qQ.A0K(this.A08, gqC.A08) || !0qQ.A0K(this.A06, gqC.A06) || !0qQ.A0K(this.A01, gqC.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E = AnonymousClass7TG.A0E(this.A02) * 31;
        return ((AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A07, (((((AnonymousClass7TF.A08(this.A03, A0E) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31)) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C53541GqC(FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = fundraiserCampaignTypeEnum;
        this.A07 = str5;
        this.A08 = str6;
        this.A06 = str7;
        this.A01 = bool;
    }
}
