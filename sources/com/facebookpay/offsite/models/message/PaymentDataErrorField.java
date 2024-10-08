package com.facebookpay.offsite.models.message;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum PaymentDataErrorField {
    city,
    country,
    dependentLocality,
    organization,
    postalCode,
    recipient,
    region,
    sortingCode,
    addressLine,
    payerPhone,
    payerEmail,
    offers,
    shippingOptionId,
    unknown;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        PaymentDataErrorField[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
