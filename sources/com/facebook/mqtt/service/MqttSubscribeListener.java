package com.facebook.mqtt.service;

public interface MqttSubscribeListener {
    void onData(String str, byte[] bArr, long j);

    void onSubscriptionResponse(String str, boolean z, int i);
}
