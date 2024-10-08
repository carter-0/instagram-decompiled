package com.facebookpay.offsite.models.message;

import X.0oU;
import X.0qQ;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum PaymentContainerType {
    BASIC_CARD_V1("basic-card-v1"),
    ECOM_TOKEN_V1("ecom-token-v1"),
    PAYPAL_OTC_V1("paypal-otc-v1"),
    FIRMLY_TOKEN_V1("firmly-token-v1");
    
    public static final Companion Companion = null;
    public final String type;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.facebookpay.offsite.models.message.PaymentContainerType$Companion, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        PaymentContainerType[] $values;
        $ENTRIES = 0oU.A00($values);
        Companion = new Object();
    }

    public final String getType() {
        return this.type;
    }

    /* access modifiers changed from: public */
    PaymentContainerType(String str) {
        this.type = str;
    }

    public final class Companion {
        public final PaymentContainerType fromString(String str) {
            0qQ.A0B(str, 0);
            for (PaymentContainerType paymentContainerType : PaymentContainerType.values()) {
                if (str.equals(paymentContainerType.getType())) {
                    return paymentContainerType;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
