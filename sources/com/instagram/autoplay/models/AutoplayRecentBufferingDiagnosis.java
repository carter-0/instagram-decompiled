package com.instagram.autoplay.models;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum AutoplayRecentBufferingDiagnosis {
    TOO_MUCH_BUFFERING,
    CAN_BUFFER_MORE,
    NORMATIVE_BUFFERING;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        AutoplayRecentBufferingDiagnosis[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
