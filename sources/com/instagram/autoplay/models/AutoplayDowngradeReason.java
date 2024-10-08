package com.instagram.autoplay.models;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum AutoplayDowngradeReason {
    NETWORK_TOO_MUCH_BUFFERING,
    MEMORY_CONSTRAINED;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        AutoplayDowngradeReason[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
