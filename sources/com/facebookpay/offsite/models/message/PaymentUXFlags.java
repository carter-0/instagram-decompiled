package com.facebookpay.offsite.models.message;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum PaymentUXFlags {
    DISABLE_PROACTIVE_CHECKOUT,
    PIXEL_COOKIE_DETECTED,
    META_CHECKOUT;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        PaymentUXFlags[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
