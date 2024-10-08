package X;

import com.instagram.api.schemas.FundraiserCampaignStateEnum;

/* renamed from: X.Dt0  reason: case insensitive filesystem */
public final class C47213Dt0 extends AnonymousClass0T0 implements C51939G8i {
    public final FundraiserCampaignStateEnum A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47213Dt0) {
                C47213Dt0 dt0 = (C47213Dt0) obj;
                if (!0qQ.A0K(this.A01, dt0.A01) || this.A00 != dt0.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C47213Dt0(FundraiserCampaignStateEnum fundraiserCampaignStateEnum, String str) {
        this.A01 = str;
        this.A00 = fundraiserCampaignStateEnum;
    }
}
