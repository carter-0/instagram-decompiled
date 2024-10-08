package com.facebook.rtc.views.omnigrid;

import X.0oU;
import X.C69735NrK;
import kotlin.enums.EnumEntries;

public enum GridItemType {
    SELF_VIEW(0),
    PEER_VIEW(1),
    OTHER(2);
    
    public static final C69735NrK Companion = null;
    public static final GridItemType[] VALUES = null;
    public final int value;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.NrK] */
    /* access modifiers changed from: public */
    static {
        GridItemType[] $values;
        $ENTRIES = 0oU.A00($values);
        Companion = new Object();
        VALUES = values();
    }

    public final int getValue() {
        return this.value;
    }

    /* access modifiers changed from: public */
    GridItemType(int i) {
        this.value = i;
    }
}
