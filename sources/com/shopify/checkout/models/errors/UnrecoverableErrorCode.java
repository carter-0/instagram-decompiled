package com.shopify.checkout.models.errors;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20684WxG;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = UnrecoverableErrorCodeSerializer.class)
public enum UnrecoverableErrorCode {
    SdkNotEnabled("sdk_not_enabled");
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) UnrecoverableErrorCode.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.shopify.checkout.models.errors.UnrecoverableErrorCode$Companion] */
    /* access modifiers changed from: public */
    static {
        UnrecoverableErrorCode[] unrecoverableErrorCodeArr;
        A02 = 0oU.A00(unrecoverableErrorCodeArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20684WxG.A00);
    }

    /* access modifiers changed from: public */
    UnrecoverableErrorCode(String str) {
        this.A00 = str;
    }
}
