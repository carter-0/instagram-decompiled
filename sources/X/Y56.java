package X;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.view.Surface;
import org.webrtc.CapturerObserver;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

public final class Y56 implements VideoSink, VideoCapturer {
    public VirtualDisplay A00;
    public MediaProjection A01;
    public CapturerObserver A02;
    public SurfaceTextureHelper A03;
    public int A04;
    public int A05;
    public long A06;
    public MediaProjectionManager A07;
    public Handler A08;
    public boolean A09;
    public final MediaProjection.Callback A0A;
    public final Intent A0B;

    public final synchronized void changeCaptureFormat(int i, int i2, int i3) {
        A00();
        this.A05 = i;
        this.A04 = i2;
        if (this.A00 != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.A08, (Runnable) new Y20(this));
        }
    }

    public final synchronized void dispose() {
        this.A09 = true;
    }

    public final synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        RuntimeException runtimeException;
        A00();
        if (capturerObserver != null) {
            this.A02 = capturerObserver;
            if (surfaceTextureHelper != null) {
                this.A03 = surfaceTextureHelper;
                this.A08 = surfaceTextureHelper.handler;
                this.A07 = (MediaProjectionManager) context.getSystemService("media_projection");
            } else {
                runtimeException = new RuntimeException("surfaceTextureHelper not set.");
            }
        } else {
            runtimeException = new RuntimeException("capturerObserver not set.");
        }
        throw runtimeException;
    }

    public final boolean isScreencast() {
        return true;
    }

    public final synchronized void startCapture(int i, int i2, int i3) {
        A00();
        this.A05 = i;
        this.A04 = i2;
        MediaProjection mediaProjection = this.A07.getMediaProjection(-1, this.A0B);
        this.A01 = mediaProjection;
        mediaProjection.registerCallback(this.A0A, this.A08);
        A01(this);
        this.A02.onCapturerStarted(true);
        this.A03.startListening(this);
    }

    public final synchronized void stopCapture() {
        A00();
        ThreadUtils.invokeAtFrontUninterruptibly(this.A08, (Runnable) new C22393Y1z(this));
    }

    private void A00() {
        if (this.A09) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    public static void A01(Y56 y56) {
        y56.A03.setTextureSize(y56.A05, y56.A04);
        y56.A00 = y56.A01.createVirtualDisplay("WebRTC_ScreenCapture", y56.A05, y56.A04, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, 3, new Surface(y56.A03.surfaceTexture), (VirtualDisplay.Callback) null, (Handler) null);
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.A06++;
        this.A02.onFrameCaptured(videoFrame);
    }

    public Y56(Intent intent, MediaProjection.Callback callback) {
        this.A0B = intent;
        this.A0A = callback;
    }
}
