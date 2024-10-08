package X;

import com.instagram.api.schemas.BonusPromoDialogAudienceType;
import java.io.IOException;

public final class F48 {
    public static C47322Dup parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("active_deal_id".equals(A17)) {
                    r5.A03 = AnonymousClass7TG.A0l(r6);
                } else if ("creator_audience_type".equals(A17)) {
                    BonusPromoDialogAudienceType bonusPromoDialogAudienceType = (BonusPromoDialogAudienceType) BonusPromoDialogAudienceType.A01.get(AnonymousClass7TG.A0l(r6));
                    if (bonusPromoDialogAudienceType == null) {
                        bonusPromoDialogAudienceType = BonusPromoDialogAudienceType.UNRECOGNIZED;
                    }
                    r5.A00 = bonusPromoDialogAudienceType;
                } else if ("deal_template_id".equals(A17)) {
                    r5.A04 = AnonymousClass7TG.A0l(r6);
                } else if ("should_show_dialog".equals(A17)) {
                    r5.A02 = AnonymousClass7TF.A0S(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            r5.A01 = new C47152DrT(r5.A00, r5.A03, r5.A04, C41845B3m.A14(r5.A02));
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
