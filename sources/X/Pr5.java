package X;

import com.facebook.rsys.rtc.RSVideoFrame;
import org.webrtc.VideoFrame;

public final class Pr5 extends VideoFrame {
    public final RSVideoFrame A00;

    public Pr5(RSVideoFrame rSVideoFrame, VideoFrame videoFrame) {
        super(videoFrame.buffer, videoFrame.rotation, videoFrame.timestampNs);
        this.A00 = rSVideoFrame;
    }

    public final void release() {
        this.A00.release();
    }

    public final void retain() {
        this.A00.retain();
    }
}
