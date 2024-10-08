package X;

import com.instagram.model.payments.CurrencyAmountInfoImpl;
import java.io.IOException;

public abstract class VH7 {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.VPJ, java.lang.Object] */
    public static VPJ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            CurrencyAmountInfoImpl currencyAmountInfoImpl = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("free_shipping_order_value".equals(AnonymousClass7TE.A17(r3))) {
                    currencyAmountInfoImpl = C45675D1a.parseFromJson(r3);
                }
                r3.A0z();
            }
            ? obj = new Object();
            if (currencyAmountInfoImpl == null) {
                return obj;
            }
            obj.A00 = currencyAmountInfoImpl;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
