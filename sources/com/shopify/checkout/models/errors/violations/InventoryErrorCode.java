package com.shopify.checkout.models.errors.violations;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20687WxJ;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = InventoryErrorCodeSerializer.class)
public enum InventoryErrorCode {
    InsufficientQuantity("insufficient_quantity"),
    OutOfStock("out_of_stock"),
    UnavailableProduct("unavailable_product");
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) InventoryErrorCode.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.shopify.checkout.models.errors.violations.InventoryErrorCode$Companion, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        InventoryErrorCode[] inventoryErrorCodeArr;
        A02 = 0oU.A00(inventoryErrorCodeArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20687WxJ.A00);
    }

    /* access modifiers changed from: public */
    InventoryErrorCode(String str) {
        this.A00 = str;
    }
}
