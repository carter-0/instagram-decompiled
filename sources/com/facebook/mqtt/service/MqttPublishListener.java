package com.facebook.mqtt.service;

public interface MqttPublishListener {
    void onFailure(int i, int i2);

    void onSuccess(int i);

    void onTimeout(int i, boolean z);
}
