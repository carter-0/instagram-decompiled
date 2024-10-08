package com.facebook.smartcapture.logging;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum CancelReason {
    SYSTEM_BACK_BUTTON("system_back_button"),
    CAPTURE_STEP_BACK_BUTTON("capture_step_back_button"),
    ENCRYPTION_FAILURE("encryption_failure"),
    PHOTO_SAVE_FAILURE("photo_save_failure");
    
    public final String reason;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        CancelReason[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getReason() {
        return this.reason;
    }

    /* access modifiers changed from: public */
    CancelReason(String str) {
        this.reason = str;
    }
}
