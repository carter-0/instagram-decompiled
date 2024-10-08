package com.facebook.cameracore.mediapipeline.services.locale;

public interface LocaleDataSource {
    String getDeviceLocaleIdentifier();

    void setDeviceLocaleIdentifier(String str);
}
