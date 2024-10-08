package com.instagram.debug.trainyardtracker;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum TrainyardEventType {
    QUEUE,
    EXECUTE,
    FINISH,
    STUCK,
    FAIL;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        TrainyardEventType[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
