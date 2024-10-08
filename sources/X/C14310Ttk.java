package X;

import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;
import java.io.IOException;

/* renamed from: X.Ttk  reason: case insensitive filesystem */
public abstract class C14310Ttk {
    public static C53401GnY parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            PromoteCouponType promoteCouponType = null;
            PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = null;
            PromoteAdsCouponUseCase promoteAdsCouponUseCase = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("coupon_offer_id".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("coupon_value_string".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("promotion_type".equals(A0q)) {
                    promoteCouponType = PromoteCouponType.valueOf(r8.A1Q());
                } else if ("sxgy_spend_requirement".equals(A0q)) {
                    promoteCouponCurrencyAmount = O16.parseFromJson(r8);
                } else if ("coupon_use_case".equals(A0q)) {
                    promoteAdsCouponUseCase = PromoteAdsCouponUseCase.valueOf(r8.A1Q());
                }
                r8.A0z();
            }
            return new C53401GnY(promoteAdsCouponUseCase, promoteCouponCurrencyAmount, promoteCouponType, str, str2, 8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
