package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* renamed from: X.Wzc  reason: case insensitive filesystem */
public final class C20817Wzc extends EglRenderer implements TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public int A02;
    public RendererCommon.RendererEvents A03;
    public boolean A04;
    public boolean A05;
    public final Object A06 = new Object();

    public final void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        A00(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }

    public final void onFrame(VideoFrame videoFrame) {
        0qQ.A0B(videoFrame, 0);
        synchronized (this.A06) {
            if (!this.A05) {
                if (!this.A04) {
                    this.A04 = true;
                    RendererCommon.RendererEvents rendererEvents = this.A03;
                    if (rendererEvents != null) {
                        rendererEvents.onFirstFrameRendered();
                    }
                }
                if (!(this.A02 == videoFrame.getRotatedWidth() && this.A01 == videoFrame.getRotatedHeight() && this.A00 == videoFrame.rotation)) {
                    RendererCommon.RendererEvents rendererEvents2 = this.A03;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFrameResolutionChanged(videoFrame.buffer.getWidth(), videoFrame.buffer.getHeight(), videoFrame.rotation);
                    }
                    this.A02 = videoFrame.getRotatedWidth();
                    this.A01 = videoFrame.getRotatedHeight();
                    this.A00 = videoFrame.rotation;
                }
            }
        }
        super.onFrame(videoFrame);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        createEglSurface(surfaceTexture);
    }

    public C20817Wzc() {
        super(C66579MXk.A00(621));
    }

    public final void disableFpsReduction() {
        synchronized (this.A06) {
            this.A05 = false;
        }
        super.disableFpsReduction();
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void pauseVideo() {
        synchronized (this.A06) {
            this.A05 = true;
        }
        setFpsReduction(0.0f);
    }

    public final void setFpsReduction(float f) {
        synchronized (this.A06) {
            this.A05 = AnonymousClass7TF.A1Q((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
        super.setFpsReduction(f);
    }

    public final void A00(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.A03 = rendererEvents;
        synchronized (this.A06) {
            this.A04 = false;
            this.A02 = 0;
            this.A01 = 0;
            this.A00 = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new C20065WkP(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
