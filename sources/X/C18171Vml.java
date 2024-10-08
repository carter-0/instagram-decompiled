package X;

import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponType;
import java.io.IOException;

/* renamed from: X.Vml  reason: case insensitive filesystem */
public final class C18171Vml {
    public static PromoteEnrollCouponInfo parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("coupon_offer_id".equals(A17)) {
                    r0.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("coupon_status".equals(A17)) {
                    PromoteEnrollCouponInfo.PromoteEnrollCouponStatus valueOf = PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.valueOf(r4.A1Q());
                    0qQ.A0B(valueOf, 0);
                    r0.A00 = valueOf;
                } else if ("formatted_value".equals(A17)) {
                    r0.A0A = AnonymousClass7TG.A0l(r4);
                } else if ("expiry_date".equals(A17)) {
                    r0.A09 = AnonymousClass7TG.A0l(r4);
                } else if ("product".equals(A17)) {
                    r0.A0B = AnonymousClass7TG.A0l(r4);
                } else if ("enroll_error_reason".equals(A17)) {
                    r0.A08 = AnonymousClass7TG.A0l(r4);
                } else if ("display_error_reason".equals(A17)) {
                    r0.A07 = AnonymousClass7TG.A0l(r4);
                } else if ("sxgy_spend_since_enroll".equals(A17)) {
                    r0.A04 = O16.parseFromJson(r4);
                } else if ("sxgy_spend_requirement".equals(A17)) {
                    r0.A03 = O16.parseFromJson(r4);
                } else if ("promotion_type".equals(A17)) {
                    r0.A05 = PromoteCouponType.valueOf(r4.A1Q());
                } else if ("coupon_balance".equals(A17)) {
                    r0.A02 = O16.parseFromJson(r4);
                } else if ("coupon_use_case".equals(A17)) {
                    r0.A01 = PromoteAdsCouponUseCase.valueOf(r4.A1Q());
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
