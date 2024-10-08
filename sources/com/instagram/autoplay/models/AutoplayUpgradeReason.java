package com.instagram.autoplay.models;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum AutoplayUpgradeReason {
    MEMORY_FREED_UP,
    NETWORK_CAN_BUFFER_MORE,
    TO_BE_DETERMINED;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        AutoplayUpgradeReason[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
