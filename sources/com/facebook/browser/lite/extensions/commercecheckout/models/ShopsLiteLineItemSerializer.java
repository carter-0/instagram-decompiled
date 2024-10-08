package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.17Z;
import X.C269504fE;
import X.C291405h7;
import X.C291415hE;
import com.fasterxml.jackson.databind.JsonSerializer;

public class ShopsLiteLineItemSerializer extends JsonSerializer {
    static {
        Object obj = new Object();
        C291405h7.A08.putIfAbsent(ShopsLiteLineItem.class, obj);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        ShopsLiteLineItem shopsLiteLineItem = (ShopsLiteLineItem) obj;
        if (shopsLiteLineItem == null) {
            r3.A0a();
        }
        r3.A0c();
        C291415hE.A04(r3, "variantId", shopsLiteLineItem.variantId);
        int i = shopsLiteLineItem.quantity;
        r3.A0q("quantity");
        r3.A0g(i);
        boolean z = shopsLiteLineItem.requiresShipping;
        r3.A0q("requiresShipping");
        r3.A0x(z);
        r3.A0Z();
    }
}
