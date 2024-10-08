package com.shopify.checkout.models.errors;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20679WxB;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = CheckoutErrorTypeSerializer.class)
public enum CheckoutErrorType {
    Inventory("inventory"),
    Payment("payment"),
    Other("other"),
    Discount("discount"),
    Order("order"),
    CustomerPersistence("customer_persistence");
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) CheckoutErrorType.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, com.shopify.checkout.models.errors.CheckoutErrorType$Companion] */
    /* access modifiers changed from: public */
    static {
        CheckoutErrorType[] checkoutErrorTypeArr;
        A02 = 0oU.A00(checkoutErrorTypeArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20679WxB.A00);
    }

    /* access modifiers changed from: public */
    CheckoutErrorType(String str) {
        this.A00 = str;
    }
}
