package X;

import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import java.util.Map;

public final class QEV extends C252303ot {
    public final Map A00;

    /* renamed from: A00 */
    public final boolean areContentsTheSame(SUj sUj, SUj sUj2) {
        BaseCheckoutItem baseCheckoutItem;
        AnonymousClass7TF.A1H(sUj, sUj2);
        if (!sUj.equals(sUj2)) {
            return false;
        }
        Map map = this.A00;
        Object obj = sUj.A01;
        RH6 rh6 = null;
        if ((obj instanceof BaseCheckoutItem) && (baseCheckoutItem = (BaseCheckoutItem) obj) != null) {
            rh6 = baseCheckoutItem.BJZ();
        }
        if (map.get(rh6) == null || sUj.A00 != sUj2.A00 || obj == null) {
            return false;
        }
        return Pxi.A1W(obj, sUj2.A01);
    }

    public QEV(Map map) {
        this.A00 = map;
    }

    /* renamed from: A01 */
    public final boolean areItemsTheSame(SUj sUj, SUj sUj2) {
        BaseCheckoutItem baseCheckoutItem;
        AnonymousClass7TG.A1N(sUj, sUj2);
        boolean z = false;
        if (sUj.equals(sUj2) && (!SUj.A0T(sUj) || sUj.A00 != sUj2.A00)) {
            Map map = this.A00;
            Object obj = sUj.A01;
            RH6 rh6 = null;
            if ((obj instanceof BaseCheckoutItem) && (baseCheckoutItem = (BaseCheckoutItem) obj) != null) {
                rh6 = baseCheckoutItem.BJZ();
            }
            if (map.get(rh6) != null) {
                if (sUj.A00 != sUj2.A00) {
                    return false;
                }
                z = true;
                if (!0qQ.A0K(obj, sUj2.A01)) {
                    return false;
                }
            }
        }
        return z;
    }
}
