package com.facebook.falco.fabric;

public enum FFSingletonJNILogger$CollectionControlDecisionStatus {
    SUCCESS(0),
    IDENTITY_UNAVAILABLE(1),
    EVENT_CONFIG_NOT_SET(2);
    
    public final int mVal;

    public static FFSingletonJNILogger$CollectionControlDecisionStatus fromVal(int i) {
        if (i == 1) {
            return IDENTITY_UNAVAILABLE;
        }
        if (i != 2) {
            return SUCCESS;
        }
        return EVENT_CONFIG_NOT_SET;
    }

    /* access modifiers changed from: public */
    FFSingletonJNILogger$CollectionControlDecisionStatus(int i) {
        this.mVal = i;
    }
}
