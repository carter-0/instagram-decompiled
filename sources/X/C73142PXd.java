package X;

import android.os.Handler;
import org.webrtc.VideoFrame;

/* renamed from: X.PXd  reason: case insensitive filesystem */
public final class C73142PXd implements Runnable {
    public final /* synthetic */ C73541PeX A00;

    public C73142PXd(C73541PeX peX) {
        this.A00 = peX;
    }

    public final void run() {
        C73541PeX peX = this.A00;
        VideoFrame videoFrame = peX.A00;
        if (videoFrame != null) {
            peX.onFrameCaptured(new VideoFrame(videoFrame.buffer, videoFrame.rotation, 0));
        }
        Handler handler = peX.A01;
        if (handler != null) {
            handler.postDelayed(this, 66);
        }
    }
}
