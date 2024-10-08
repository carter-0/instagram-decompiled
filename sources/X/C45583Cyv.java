package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.io.IOException;

/* renamed from: X.Cyv  reason: case insensitive filesystem */
public final class C45583Cyv {
    public static C43803CDv parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("intent_aware_ads_info".equals(A17)) {
                    r3.A00 = C56211Hue.parseFromJson(r4);
                } else if ("reels_iaa_render_data".equals(A17)) {
                    r3.A02 = C44310Ccs.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            IntentAwareAdsInfo intentAwareAdsInfo = r3.A00;
            0qQ.A0A(intentAwareAdsInfo);
            r3.A01 = new XM9(intentAwareAdsInfo, r3.A02);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
