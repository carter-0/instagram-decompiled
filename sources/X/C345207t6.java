package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import java.lang.ref.WeakReference;

/* renamed from: X.7t6  reason: invalid class name and case insensitive filesystem */
public final class C345207t6 {
    public final /* synthetic */ C345197t5 A00;

    public C345207t6(C345197t5 r1) {
        this.A00 = r1;
    }

    public final AudioPlatformComponentHost A00() {
        EffectServiceHost A0D;
        C371698yt r0;
        C371718yv r02;
        WeakReference weakReference;
        C361848gv r03 = this.A00.A03;
        if (r03 == null || (A0D = r03.A0D()) == null || (r0 = A0D.mServicesHostConfiguration) == null || (r02 = r0.A06) == null || (weakReference = r02.A04) == null) {
            return null;
        }
        return (AudioPlatformComponentHost) weakReference.get();
    }
}
