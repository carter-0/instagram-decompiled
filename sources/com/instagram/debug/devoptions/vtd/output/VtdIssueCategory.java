package com.instagram.debug.devoptions.vtd.output;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum VtdIssueCategory {
    ATTACHED("ATTACHED"),
    VISIBILITY("VISIBILITY"),
    LINEAR_LAYOUT("LINEAR_LAYOUT"),
    MULTI_LAYOUT("MULTI_LAYOUT");
    
    public final String tag;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        VtdIssueCategory[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getTag() {
        return this.tag;
    }

    /* access modifiers changed from: public */
    VtdIssueCategory(String str) {
        this.tag = str;
    }
}
