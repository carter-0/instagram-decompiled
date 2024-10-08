package com.facebook.smartcapture.logging;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum IdCaptureButton {
    DOWNLOAD_RETRY("download_retry"),
    RETAKE_PHOTO("retake_photo"),
    EXPAND_FULL_PHOTO("expand_full_photo"),
    CAPTURE_STEP_BACK_BUTTON("capture_step_back_button"),
    SHOW_PHOTO_REQUIREMENTS(SelfieCaptureLoggingEvents.SHOW_PHOTO_REQUIREMENTS),
    ONBOARDING_SKIP(SelfieCaptureLoggingEvents.ONBOARDING_SKIP);
    
    public final String text;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        IdCaptureButton[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getText() {
        return this.text;
    }

    /* access modifiers changed from: public */
    IdCaptureButton(String str) {
        this.text = str;
    }
}
