package X;

import com.instagram.api.schemas.FundraiserCampaignStateEnum;
import java.io.IOException;

public final class F4V {
    public static C47319Dum parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("fundraiser_id".equals(A17)) {
                    r3.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("fundraiser_state".equals(A17)) {
                    FundraiserCampaignStateEnum fundraiserCampaignStateEnum = (FundraiserCampaignStateEnum) FundraiserCampaignStateEnum.A01.get(AnonymousClass7TG.A0l(r4));
                    if (fundraiserCampaignStateEnum == null) {
                        fundraiserCampaignStateEnum = FundraiserCampaignStateEnum.UNRECOGNIZED;
                    }
                    r3.A00 = fundraiserCampaignStateEnum;
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            r3.A01 = new C47213Dt0(r3.A00, r3.A02);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
