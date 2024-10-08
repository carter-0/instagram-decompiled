package com.shopify.checkout.models;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20677Wx9;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = ProgressButtonStageSerializer.class)
public enum ProgressButtonStage {
    ConfirmShipping("confirmShipping"),
    Review("review");
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) ProgressButtonStage.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.shopify.checkout.models.ProgressButtonStage$Companion, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        ProgressButtonStage[] progressButtonStageArr;
        A02 = 0oU.A00(progressButtonStageArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20677Wx9.A00);
    }

    /* access modifiers changed from: public */
    ProgressButtonStage(String str) {
        this.A00 = str;
    }
}
