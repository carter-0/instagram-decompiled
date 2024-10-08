package com.facebook.smartcapture.logging;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum AuthenticityUploadMedium {
    SC_V2_AUTO("SC_V2_AUTO"),
    CAMERA_MANUAL("CAMERA_MANUAL"),
    IMAGE_PICKER("IMAGE_PICKER"),
    SELFIE_VIDEO_NATIVE("SELFIE_VIDEO_NATIVE"),
    SELFIE_PHOTO_NATIVE("SELFIE_PHOTO_NATIVE"),
    UNKNOWN("UNKNOWN");
    
    public final String value;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        AuthenticityUploadMedium[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getValue() {
        return this.value;
    }

    /* access modifiers changed from: public */
    AuthenticityUploadMedium(String str) {
        this.value = str;
    }
}
