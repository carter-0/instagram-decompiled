package com.facebook.smartcapture.docauth;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum CaptureState {
    INITIAL("initial"),
    DOWNLOADING_DEPS("downloading_deps"),
    DOWNLOAD_FAILED("download_failed"),
    ID_TYPE_DETECTION("looking_for_id"),
    ID_FOUND("id_found"),
    BLUR_DETECTED("blur_detected"),
    GLARE_DETECTED("glare_detected"),
    MANUAL_CAPTURE("manual_capture"),
    HOLDING_STEADY("holding_steady"),
    SCANNING_CREDIT_CARD("scanning_credit_card"),
    CREDIT_CARD_SCANNED("credit_card_scanned"),
    CAPTURING_AUTOMATIC("capturing_automatic"),
    CAPTURING_MANUAL("capturing_manual");
    
    public final String text;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        CaptureState[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getText() {
        return this.text;
    }

    /* access modifiers changed from: public */
    CaptureState(String str) {
        this.text = str;
    }
}
