package com.shopify.checkout.models;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20675Wx7;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = DeliveryMethodSerializer.class)
public enum DeliveryMethod {
    Shipping("SHIPPING"),
    Pickup("PICK_UP"),
    Local("LOCAL"),
    PickupPoint("PICKUP_POINT"),
    Retail("RETAIL");
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) DeliveryMethod.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.shopify.checkout.models.DeliveryMethod$Companion, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        DeliveryMethod[] deliveryMethodArr;
        A02 = 0oU.A00(deliveryMethodArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20675Wx7.A00);
    }

    /* access modifiers changed from: public */
    DeliveryMethod(String str) {
        this.A00 = str;
    }
}
