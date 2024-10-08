package com.shopify.checkout.models.errors.violations;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20686WxI;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = DeliveryErrorCodeSerializer.class)
public enum DeliveryErrorCode {
    ;
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) DeliveryErrorCode.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.shopify.checkout.models.errors.violations.DeliveryErrorCode$Companion, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        DeliveryErrorCode[] deliveryErrorCodeArr;
        A02 = 0oU.A00(deliveryErrorCodeArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20686WxI.A00);
    }

    /* access modifiers changed from: public */
    DeliveryErrorCode() {
        this.A00 = "unshippable_product";
    }
}
