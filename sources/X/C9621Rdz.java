package X;

import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;

/* renamed from: X.Rdz  reason: case insensitive filesystem */
public abstract class C9621Rdz {
    public static final void A00(BaseSelectionCheckoutItem baseSelectionCheckoutItem, String str, boolean z) {
        Integer num;
        0qQ.A0B(baseSelectionCheckoutItem, 0);
        if (!0qQ.A0K(baseSelectionCheckoutItem.getId(), str) || z) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A0C;
        }
        baseSelectionCheckoutItem.Ejn(num);
    }
}
