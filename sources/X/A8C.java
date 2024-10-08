package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost.IgSandboxEffectServiceHost;

public final class A8C {
    public final synchronized void A00(Context context) {
        if (!IgSandboxEffectServiceHost.isLibraryLoaded) {
            if (!0oI.A0C(context)) {
                try {
                    0dV.A0D("caffe2_ig_ops", 16);
                } catch (UnsatisfiedLinkError e) {
                    0KC.A0F("IgSandboxEffectServiceHost", "caffe2 ops lib soloader load error: ", e);
                }
            }
            0dV.A0C("graphicsengine-arengineservices-igsandboxeffectservicehost-native");
            IgSandboxEffectServiceHost.isLibraryLoaded = true;
        }
    }
}
