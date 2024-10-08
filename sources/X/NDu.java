package X;

import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

public final class NDu extends VideoRenderProxy {
    public VideoRenderApi A00;

    public final void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i) {
        VideoFrame videoFrame;
        try {
            if (obj instanceof C74226PrF) {
                C67679MsF msF = (C67679MsF) ((C74226PrF) obj);
                0qQ.A0B(rSVideoFrame, 0);
                if (!msF.A05 && msF.A04) {
                    rSVideoFrame.registerFrameRenderedCallback();
                    msF.A05 = true;
                }
                rSVideoFrame.onFrameReadyToRender();
                if (msF.A04) {
                    VideoFrame videoFrame2 = rSVideoFrame.getVideoFrame();
                    0qQ.A07(videoFrame2);
                    videoFrame = new Pr5(rSVideoFrame, videoFrame2);
                } else {
                    videoFrame = rSVideoFrame.getVideoFrame();
                }
                0qQ.A0A(videoFrame);
                msF.A0C.onFrame(videoFrame);
            } else if (obj instanceof VideoSink) {
                ((VideoSink) obj).onFrame(rSVideoFrame.getVideoFrame());
            } else {
                String str = null;
                if (obj != null) {
                    str = obj.getClass().getTypeName();
                }
                throw AnonymousClass7TF.A0W("Invalid type for renderTarget: ", str);
            }
        } catch (Throwable th) {
            0KC.A0J("WebrtcVideoRenderProxy", "Error rendering frame", th);
            throw th;
        }
    }

    public final void setApi(VideoRenderApi videoRenderApi) {
        this.A00 = videoRenderApi;
    }
}
