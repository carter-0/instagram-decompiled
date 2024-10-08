package com.instagram.autoplay.models;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum AutoplayLayout {
    ALL,
    TEST_SURFACE_TEST_SCREEN_TEST_LAYOUT1,
    TEST_SURFACE_TEST_SCREEN_TEST_LAYOUT2,
    EXPLORE_DIAGONAL,
    EXPLORE_LOW_DIAGONAL,
    UNKNOWN;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        AutoplayLayout[] $values;
        $ENTRIES = 0oU.A00($values);
    }
}
