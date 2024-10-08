package com.instagram.autoplay.models;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum AutoplayCustomizationSelectionReason {
    TOO_MUCH_BUFFERING,
    CAN_BUFFER_MORE_AND_HAS_MEMORY_AVAILABLE,
    NOT_ENOUGH_MEMORY,
    FIRST_CHOICE_OR_CUSTOMIZATION_MISSING;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        AutoplayCustomizationSelectionReason[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
