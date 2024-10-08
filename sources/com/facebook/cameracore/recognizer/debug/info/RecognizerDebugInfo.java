package com.facebook.cameracore.recognizer.debug.info;

import X.C16485Uvf;

public class RecognizerDebugInfo {
    public final String mInfo;
    public final Integer mQplInstanceKey;
    public final C16485Uvf mType;

    public String getInfo() {
        return this.mInfo;
    }

    public Integer getQplInstanceKey() {
        return this.mQplInstanceKey;
    }

    public C16485Uvf getType() {
        return this.mType;
    }

    public RecognizerDebugInfo(String str, int i, int i2) {
        Integer valueOf;
        this.mInfo = str;
        if (i == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        this.mQplInstanceKey = valueOf;
        this.mType = C16485Uvf.values()[i2];
    }
}
