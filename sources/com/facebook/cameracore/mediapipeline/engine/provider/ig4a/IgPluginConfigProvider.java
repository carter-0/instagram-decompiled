package com.facebook.cameracore.mediapipeline.engine.provider.ig4a;

import X.0dV;
import X.C392699vE;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.jni.HybridData;

public final class IgPluginConfigProvider extends PluginConfigProvider {
    public static final C392699vE Companion = new Object();

    public static final native HybridData initHybrid(Context context);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9vE] */
    static {
        0dV.A0C("graphicsengine-ig4a-native");
    }
}
