package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;

public enum GWH {
    ;

    public final String A00(Context context, JQI jqi) {
        int i;
        Resources resources;
        int i2;
        String str;
        int i3;
        if (this instanceof GWI) {
            return context.getString(2131969172);
        }
        C52414GRr gRr = (C52414GRr) jqi;
        C61073JwB jwB = gRr.A02;
        if (jwB != null) {
            return jwB.A01;
        }
        C53401GnY gnY = gRr.A01;
        if (!(gnY == null || gnY.A03 == null || (str = gnY.A04) == null)) {
            Object obj = gnY.A01;
            if (obj == PromoteCouponType.RECREATE_MIN_SPEND_X_TO_GET_Y) {
                PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = (PromoteCouponCurrencyAmount) gnY.A02;
                promoteCouponCurrencyAmount.getClass();
                return DbV.A0u(context, str, promoteCouponCurrencyAmount.A00(), 2131970107);
            }
            PromoteCouponType promoteCouponType = PromoteCouponType.HERES_X;
            if (obj == promoteCouponType && gnY.A00 == PromoteAdsCouponUseCase.ACQUISITION) {
                i3 = 2131970288;
            } else if (obj == promoteCouponType && gnY.A00 == PromoteAdsCouponUseCase.RESURRECTION) {
                i3 = 2131970285;
            }
            return DbW.A0h(context, str, i3);
        }
        Integer num = gRr.A03;
        if (num == null || (i = num.intValue()) <= 0) {
            i = gRr.A00;
            if (i == 0) {
                return context.getString(2131970832);
            }
            resources = context.getResources();
            i2 = R.plurals.pending_promoted_posts;
        } else {
            resources = context.getResources();
            i2 = R.plurals.new_leads_count;
        }
        return DbY.A0d(resources, i, i2);
    }

    public final String A01(Context context, JQI jqi) {
        Resources resources;
        int i;
        C61073JwB jwB;
        if (this instanceof GWI) {
            resources = context.getResources();
            i = 2131966695;
        } else {
            C52414GRr gRr = (C52414GRr) jqi;
            if (gRr != null && (jwB = gRr.A02) != null) {
                return jwB.A02;
            }
            resources = context.getResources();
            i = 2131952474;
        }
        return resources.getString(i);
    }
}
