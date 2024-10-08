package X;

import com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem;

public final class TXC extends 0Yg implements 0sP {
    public static final TXC A00 = new TXC();

    public TXC() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem;
        SUj sUj = (SUj) obj;
        0qQ.A0B(sUj, 0);
        Object obj2 = sUj.A01;
        if (obj2 instanceof SelectionPickupFulfillmentOptionItem) {
            selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) obj2;
        } else {
            selectionPickupFulfillmentOptionItem = null;
        }
        boolean z = false;
        if (selectionPickupFulfillmentOptionItem != null) {
            z = AnonymousClass7TF.A1Y(selectionPickupFulfillmentOptionItem.A05, false);
        }
        return Boolean.valueOf(z);
    }
}
