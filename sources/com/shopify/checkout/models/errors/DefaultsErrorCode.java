package com.shopify.checkout.models.errors;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20680WxC;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = DefaultsErrorCodeSerializer.class)
public enum DefaultsErrorCode {
    EmptyDefaults("empty_defaults"),
    NonUniqueAddressReferenceIds("non_unique_address_reference_ids");
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) DefaultsErrorCode.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, com.shopify.checkout.models.errors.DefaultsErrorCode$Companion] */
    /* access modifiers changed from: public */
    static {
        DefaultsErrorCode[] defaultsErrorCodeArr;
        A02 = 0oU.A00(defaultsErrorCodeArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20680WxC.A00);
    }

    /* access modifiers changed from: public */
    DefaultsErrorCode(String str) {
        this.A00 = str;
    }
}
