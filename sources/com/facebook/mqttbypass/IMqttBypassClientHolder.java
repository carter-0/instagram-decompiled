package com.facebook.mqttbypass;

import X.0dV;
import com.facebook.jni.HybridData;

public abstract class IMqttBypassClientHolder {
    public final HybridData mHybridData;

    static {
        0dV.A0C("mqttbypass-interface-jni");
    }

    public IMqttBypassClientHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
