package com.facebook.smartcapture.logging;

import X.0oU;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.enums.EnumEntries;

public enum SelfieCaptureStep {
    INITIAL("initial"),
    ONBOARDING("onboarding"),
    PERMISSIONS("permissions_granting"),
    CAPTURE("capture"),
    INSTRUCTIONS("instructions"),
    CONFIRMATION("confirmation"),
    TIMEOUT(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
    
    public final String text;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        SelfieCaptureStep[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getText() {
        return this.text;
    }

    /* access modifiers changed from: public */
    SelfieCaptureStep(String str) {
        this.text = str;
    }
}
