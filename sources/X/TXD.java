package X;

import com.facebookpay.common.models.Distance;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem;

public final class TXD extends 0Yg implements 0sP {
    public static final TXD A00 = new TXD();

    public TXD() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        double d;
        SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem;
        Distance distance;
        Object obj2 = Pxf.A0P(obj).A01;
        if (!(obj2 instanceof SelectionPickupFulfillmentOptionItem) || (selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) obj2) == null || (distance = selectionPickupFulfillmentOptionItem.A02) == null) {
            d = Double.MAX_VALUE;
        } else {
            d = distance.A00;
        }
        return Double.valueOf(d);
    }
}
