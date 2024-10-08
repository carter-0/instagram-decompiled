package X;

import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

/* renamed from: X.8zU  reason: invalid class name and case insensitive filesystem */
public final class C371998zU implements PlatformAlgorithmDataSource {
    public B2Q A00;

    public final synchronized void closeSession() {
        B2Q b2q = this.A00;
        if (b2q != null) {
            b2q.onCloseSession();
        }
    }

    public final synchronized void registerListener(B2Q b2q) {
        0qQ.A0B(b2q, 0);
        this.A00 = b2q;
    }

    public final synchronized void updateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource) {
        B2Q b2q = this.A00;
        if (b2q != null) {
            b2q.onFrameUpdate(j, j2, platformAlgorithmAlwaysOnDataSource);
        }
    }
}
