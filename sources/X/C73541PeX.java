package X;

import android.os.Handler;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;

/* renamed from: X.PeX  reason: case insensitive filesystem */
public final class C73541PeX implements CapturerObserver {
    public VideoFrame A00;
    public final Handler A01;
    public final Runnable A02;
    public final /* synthetic */ OZU A03;

    public final void onCapturerStopped() {
        this.A00 = null;
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    public C73541PeX(OZU ozu) {
        Handler handler;
        this.A03 = ozu;
        SurfaceTextureHelper surfaceTextureHelper = ozu.A04;
        if (surfaceTextureHelper != null) {
            handler = surfaceTextureHelper.handler;
        } else {
            handler = null;
        }
        this.A01 = handler;
        this.A02 = new C73142PXd(this);
    }

    public final void onCapturerStarted(boolean z) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.postDelayed(this.A02, 66);
        }
    }

    public final void onFrameCaptured(VideoFrame videoFrame) {
        if (videoFrame != null) {
            this.A00 = videoFrame;
            ScreenShareApi screenShareApi = this.A03.A00;
            if (screenShareApi != null) {
                screenShareApi.handleFrame(new RSVideoFrame(videoFrame), false);
            }
            videoFrame.release();
        }
    }
}
