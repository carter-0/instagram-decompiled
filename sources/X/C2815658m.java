package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;
import java.io.IOException;

/* renamed from: X.58m  reason: invalid class name and case insensitive filesystem */
public abstract class C2815658m {
    public static C2815858p parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Long l = null;
            String str2 = null;
            LiveUserPaySupportTier liveUserPaySupportTier = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("digital_product_id".equals(A0q)) {
                    l = Long.valueOf(r10.A0y());
                } else if ("sku".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("support_tier".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    liveUserPaySupportTier = C2815758n.A00(str);
                }
                r10.A0z();
            }
            if (l == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("digital_product_id", "LiveUserPayTierInfo");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("sku", "LiveUserPayTierInfo");
            } else if (liveUserPaySupportTier != null || !(r10 instanceof 0c9)) {
                return new C2815858p(liveUserPaySupportTier, str2, l.longValue());
            } else {
                ((0c9) r10).A03.A00("support_tier", "LiveUserPayTierInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
