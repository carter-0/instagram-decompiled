package X;

import com.instagram.api.schemas.ContentAppreciationFanOfferType;
import java.io.IOException;

public abstract class CWF {
    public static C59721JVf parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ContentAppreciationFanOfferType contentAppreciationFanOfferType = null;
            BEP bep = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("gift_progression_info".equals(A17)) {
                    bep = CWI.parseFromJson(r7);
                } else if ("offer_type".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    contentAppreciationFanOfferType = (ContentAppreciationFanOfferType) ContentAppreciationFanOfferType.A01.get(str);
                    if (contentAppreciationFanOfferType == null) {
                        contentAppreciationFanOfferType = ContentAppreciationFanOfferType.UNRECOGNIZED;
                    }
                }
                r7.A0z();
            }
            if (contentAppreciationFanOfferType != null || !(r7 instanceof 0c9)) {
                return new C59721JVf(contentAppreciationFanOfferType, (MW9) bep);
            }
            AnonymousClass7TF.A1L("offer_type", r7, "ContentAppreciationFanOfferInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
