package X;

import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: X.Pea  reason: case insensitive filesystem */
public final class C73543Pea implements VideoSink {
    public final /* synthetic */ IgLiteCameraProxy A00;

    public final void onFrame(VideoFrame videoFrame) {
        0qQ.A0B(videoFrame, 0);
        CameraApi cameraApi = this.A00.A05;
        if (cameraApi != null) {
            cameraApi.handleFrame(new RSVideoFrame(videoFrame));
        }
    }

    public C73543Pea(IgLiteCameraProxy igLiteCameraProxy) {
        this.A00 = igLiteCameraProxy;
    }
}
