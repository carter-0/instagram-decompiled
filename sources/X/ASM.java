package X;

import com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.jni.HybridData;
import java.lang.ref.WeakReference;

public final class ASM implements C344997sl {
    public final /* synthetic */ AudioServiceConfigurationHybrid A00;

    public ASM(AudioServiceConfigurationHybrid audioServiceConfigurationHybrid) {
        this.A00 = audioServiceConfigurationHybrid;
    }

    public final /* bridge */ /* synthetic */ void Dd1(ASJ asj, Object obj) {
        Object obj2;
        AudioPlatformComponentHost audioPlatformComponentHost = (AudioPlatformComponentHost) obj;
        C371718yv r1 = this.A00.mConfiguration;
        WeakReference weakReference = r1.A04;
        if (weakReference != null) {
            obj2 = weakReference.get();
        } else {
            obj2 = null;
        }
        if (obj2 == audioPlatformComponentHost) {
            r1.A04 = null;
        }
        HybridData hybridData = audioPlatformComponentHost.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
    }
}
