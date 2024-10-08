package com.instagram.autoplay.models;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum AutoplayLoggingCustomizationSelectionType {
    INITIAL,
    DOWNGRADE,
    UPGRADE,
    COULD_NOT_UPGRADE,
    COULD_NOT_DOWNGRADE;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        AutoplayLoggingCustomizationSelectionType[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
