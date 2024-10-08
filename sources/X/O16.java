package X;

import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import java.io.IOException;

public abstract class O16 {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.model.coupon.PromoteCouponCurrencyAmount, java.lang.Object] */
    public static PromoteCouponCurrencyAmount parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("currency".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A02 = A0l;
                } else if (Pxd.A00(744).equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    obj.A03 = A0l2;
                } else if (AnonymousClass000.A00(4449).equals(A17)) {
                    obj.A00 = r4.A1D();
                } else if ("offset".equals(A17)) {
                    obj.A01 = r4.A1D();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
