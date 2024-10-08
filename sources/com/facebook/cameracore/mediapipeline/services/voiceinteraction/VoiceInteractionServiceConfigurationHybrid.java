package com.facebook.cameracore.mediapipeline.services.voiceinteraction;

import X.C371948zP;
import X.C371958zQ;
import X.C392869vV;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class VoiceInteractionServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C392869vV Companion = new Object();
    public final VoiceInteractionServiceDelegateWrapper delegateWrapper;

    public static final native HybridData initHybrid(VoiceInteractionServiceDelegateWrapper voiceInteractionServiceDelegateWrapper);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.cameracore.mediapipeline.services.voiceinteraction.VoiceInteractionServiceDelegateWrapper] */
    public VoiceInteractionServiceConfigurationHybrid(C371948zP r3) {
        C371958zQ r1 = r3.A00;
        ? obj = new Object();
        obj.delegate = r1;
        this.delegateWrapper = obj;
        this.mHybridData = initHybrid(obj);
    }
}
