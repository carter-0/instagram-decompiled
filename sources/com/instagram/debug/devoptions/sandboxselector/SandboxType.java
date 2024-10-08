package com.instagram.debug.devoptions.sandboxselector;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum SandboxType {
    PRODUCTION,
    DEDICATED,
    ON_DEMAND,
    OTHER;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        SandboxType[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
