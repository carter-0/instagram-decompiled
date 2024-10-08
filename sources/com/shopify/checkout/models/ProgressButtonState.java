package com.shopify.checkout.models;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20678WxA;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = ProgressButtonStateSerializer.class)
public enum ProgressButtonState {
    Loading("loading"),
    Disabled("disabled");
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) ProgressButtonState.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.shopify.checkout.models.ProgressButtonState$Companion, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        ProgressButtonState[] progressButtonStateArr;
        A02 = 0oU.A00(progressButtonStateArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20678WxA.A00);
    }

    /* access modifiers changed from: public */
    ProgressButtonState(String str) {
        this.A00 = str;
    }
}
