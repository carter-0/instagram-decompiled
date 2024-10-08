package com.shopify.checkout.models.errors;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20681WxD;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = ErrorGroupSerializer.class)
public enum ErrorGroup {
    Violation("violation"),
    Checkout("checkout"),
    Internal("internal"),
    VaultedPayment("vaulted_payment"),
    Defaults("defaults");
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) ErrorGroup.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.shopify.checkout.models.errors.ErrorGroup$Companion, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        ErrorGroup[] errorGroupArr;
        A02 = 0oU.A00(errorGroupArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20681WxD.A00);
    }

    /* access modifiers changed from: public */
    ErrorGroup(String str) {
        this.A00 = str;
    }
}
