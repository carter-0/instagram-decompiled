package X;

import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

public interface B2Q {
    void onCloseSession();

    void onFrameUpdate(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource);

    void onFrameUpdate(PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource);
}
