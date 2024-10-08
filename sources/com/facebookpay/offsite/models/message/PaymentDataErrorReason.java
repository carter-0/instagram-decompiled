package com.facebookpay.offsite.models.message;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum PaymentDataErrorReason {
    INVALID_PAYMENT_DATA,
    INVALID_SHIPPING_ADDRESS,
    OUT_OF_SERVICE_AREA,
    GENERIC_FAILURE,
    TIMEOUT,
    OTHER_ERROR,
    INVALID_SHIPPING_OPTION,
    INVALID_FULFILLMENT_OPTION,
    INVALID_BILLING_ADDRESS,
    INVALID_OFFER_CODE,
    PAYPAL_AUTHORIZATION_ERROR;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        PaymentDataErrorReason[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
