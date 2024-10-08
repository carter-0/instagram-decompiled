package com.facebook.cameracore.mediapipeline.services.camerashare;

import X.0qQ;
import com.facebook.jni.HybridData;
import java.util.Map;

public abstract class CameraShareService {
    public final HybridData mHybridData;

    public CameraShareService(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public abstract void setDeeplinkTextureMap(Map map);

    public abstract void setEffectArgumentsJSON(String str);
}
