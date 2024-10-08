package com.facebook.cameracore.mediapipeline.services.camerashare;

import X.0qQ;
import com.facebook.jni.HybridData;
import java.util.Map;

public final class CameraShareServiceImpl extends CameraShareService {
    public static final native HybridData initHybrid();

    private final native void nativeSetDeeplinkTextureMap(Map map);

    private final native void nativeSetEffectArgumentsJSON(String str);

    public final void setDeeplinkTextureMap(Map map) {
        0qQ.A0B(map, 0);
        nativeSetDeeplinkTextureMap(map);
    }

    public final void setEffectArgumentsJSON(String str) {
        0qQ.A0B(str, 0);
        nativeSetEffectArgumentsJSON(str);
    }

    public CameraShareServiceImpl() {
        super(initHybrid());
    }
}
