package com.facebookpay.offsite.models.message;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum AuthorizationState {
    SUCCESS,
    ERROR,
    PERMITTED;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        AuthorizationState[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
