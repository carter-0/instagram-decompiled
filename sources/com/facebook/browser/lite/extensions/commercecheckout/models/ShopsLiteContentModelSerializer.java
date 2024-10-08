package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.17Z;
import X.C269504fE;
import X.C291405h7;
import X.C291415hE;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.ArrayList;

public class ShopsLiteContentModelSerializer extends JsonSerializer {
    static {
        Object obj = new Object();
        C291405h7.A08.putIfAbsent(ShopsLiteContentModel.class, obj);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        ShopsLiteContentModel shopsLiteContentModel = (ShopsLiteContentModel) obj;
        if (shopsLiteContentModel == null) {
            r3.A0a();
        }
        r3.A0c();
        C291415hE.A04(r3, "fallbackCheckoutUrl", shopsLiteContentModel.fallbackCheckoutUrl);
        C291415hE.A04(r3, "sourceUrl", shopsLiteContentModel.sourceUrl);
        C291415hE.A04(r3, "merchantDomain", shopsLiteContentModel.merchantDomain);
        ArrayList<ShopsLiteLineItem> arrayList = shopsLiteContentModel.lineItems;
        if (arrayList != null) {
            r3.A0q("lineItems");
            C291415hE.A01(r3, r4, arrayList);
        }
        C291415hE.A04(r3, "visitToken", shopsLiteContentModel.visitToken);
        r3.A0Z();
    }
}
