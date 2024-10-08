package com.shopify.checkout.models.errors.violations;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20688WxK;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = ViolationErrorTypeSerializer.class)
public enum ViolationErrorType {
    Delivery("delivery");
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) ViolationErrorType.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.shopify.checkout.models.errors.violations.ViolationErrorType$Companion] */
    /* access modifiers changed from: public */
    static {
        ViolationErrorType[] violationErrorTypeArr;
        A02 = 0oU.A00(violationErrorTypeArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20688WxK.A00);
    }

    /* access modifiers changed from: public */
    ViolationErrorType(String str) {
        this.A00 = str;
    }
}
