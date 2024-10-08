package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.instagram.business.promote.model.PromotionMetric;
import java.io.IOException;

public abstract class VAT {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, com.instagram.business.promote.model.PromotionMetric] */
    public static PromotionMetric parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("metric_display_name".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    obj.A01 = str;
                } else if (AnonymousClass000.A00(ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS).equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0X(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
