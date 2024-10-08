package X;

import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.rtc.RSVideoFrame;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: X.Peb  reason: case insensitive filesystem */
public final class C73544Peb implements VideoSink {
    public final /* synthetic */ C389809qF A00;

    public final void onFrame(VideoFrame videoFrame) {
        0qQ.A0B(videoFrame, 0);
        CameraApi cameraApi = this.A00.A00;
        if (cameraApi != null) {
            cameraApi.handleFrame(new RSVideoFrame(videoFrame));
        }
    }

    public C73544Peb(C389809qF r1) {
        this.A00 = r1;
    }
}
