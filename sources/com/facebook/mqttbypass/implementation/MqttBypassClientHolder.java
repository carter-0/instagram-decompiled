package com.facebook.mqttbypass.implementation;

import X.0dV;
import X.C271324if;
import com.facebook.jni.HybridData;
import com.facebook.mqttbypass.IMqttBypassClientHolder;

public final class MqttBypassClientHolder extends IMqttBypassClientHolder {
    public static final C271324if Companion = new Object();

    public static final native HybridData initHybrid(MqttBypassConfig mqttBypassConfig);

    public native void blockConnectionCreationNative();

    public native void permitConnectionCreationNative();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4if, java.lang.Object] */
    static {
        0dV.A0C("mqttbypass-jni");
    }
}
