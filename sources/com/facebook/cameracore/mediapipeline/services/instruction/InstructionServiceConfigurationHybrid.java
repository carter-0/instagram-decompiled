package com.facebook.cameracore.mediapipeline.services.instruction;

import X.C371728yy;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class InstructionServiceConfigurationHybrid extends ServiceConfiguration {
    public final C371728yy mConfiguration;

    public static native HybridData initHybrid(InstructionServiceListenerWrapper instructionServiceListenerWrapper);

    public InstructionServiceConfigurationHybrid(C371728yy r2) {
        super(initHybrid(r2.A00));
        this.mConfiguration = r2;
    }
}
