package com.facebook.smartcapture.logging;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum IdCaptureStep {
    INITIAL("initial"),
    ONBOARDING("onboarding"),
    PERMISSIONS("permissions_granting"),
    CHOOSE_DOC_TYPE("id_type_selection"),
    FIRST_PHOTO_CAPTURE("first_photo_capture"),
    FIRST_PHOTO_CONFIRMATION("first_photo_confirmation"),
    SECOND_PHOTO_CAPTURE("second_photo_capture"),
    SECOND_PHOTO_CONFIRMATION("second_photo_confirmation");
    
    public final String text;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        IdCaptureStep[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getText() {
        return this.text;
    }

    /* access modifiers changed from: public */
    IdCaptureStep(String str) {
        this.text = str;
    }
}
