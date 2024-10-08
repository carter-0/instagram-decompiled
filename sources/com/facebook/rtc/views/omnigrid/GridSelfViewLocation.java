package com.facebook.rtc.views.omnigrid;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum GridSelfViewLocation {
    NONE(0),
    TOP_LEFT(1),
    TOP_RIGHT(2),
    BOTTOM_RIGHT(3);
    
    public final int value;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        GridSelfViewLocation[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final int getValue() {
        return this.value;
    }

    /* access modifiers changed from: public */
    GridSelfViewLocation(int i) {
        this.value = i;
    }
}
