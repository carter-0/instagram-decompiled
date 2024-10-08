package X;

import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.DeliveryWindowInfoImpl;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata;
import java.io.IOException;

/* renamed from: X.CnF  reason: case insensitive filesystem */
public abstract class C44922CnF {
    public static ShippingAndReturnsMetadata parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            DeliveryWindowInfoImpl deliveryWindowInfoImpl = null;
            Boolean bool = null;
            CurrencyAmountInfoImpl currencyAmountInfoImpl = null;
            Integer num = null;
            CurrencyAmountInfoImpl currencyAmountInfoImpl2 = null;
            String str = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("estimated_delivery_window".equals(A17)) {
                    deliveryWindowInfoImpl = C44867CmJ.parseFromJson(r9);
                } else if ("is_final_sale".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("return_cost".equals(A17)) {
                    currencyAmountInfoImpl = C45675D1a.parseFromJson(r9);
                } else if ("return_policy_time".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if ("shipping_cost".equals(A17)) {
                    currencyAmountInfoImpl2 = C45675D1a.parseFromJson(r9);
                } else if ("shipping_cost_stripped".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new ShippingAndReturnsMetadata(currencyAmountInfoImpl, currencyAmountInfoImpl2, deliveryWindowInfoImpl, bool, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
