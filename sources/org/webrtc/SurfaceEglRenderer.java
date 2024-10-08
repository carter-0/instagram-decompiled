package org.webrtc;

import X.002;
import X.AnonymousClass000;
import X.AnonymousClass7TF;
import X.Pxf;
import android.view.SurfaceHolder;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    public static final String TAG = "SurfaceEglRenderer";
    public int frameRotation;
    public boolean isFirstFrameRendered;
    public boolean isRenderingPaused;
    public final Object layoutLock = new Object();
    public RendererCommon.RendererEvents rendererEvents;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }

    private void logD(String str) {
        boolean z = Logging.loggingEnabled;
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            if (!this.isRenderingPaused) {
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                    logD("Reporting first rendered frame.");
                    RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFirstFrameRendered();
                    }
                }
                if (!(this.rotatedFrameWidth == videoFrame.getRotatedWidth() && this.rotatedFrameHeight == videoFrame.getRotatedHeight() && this.frameRotation == videoFrame.rotation)) {
                    logD(002.A0p("Reporting frame resolution changed to ", "x", " with rotation ", videoFrame.buffer.getWidth(), videoFrame.buffer.getHeight(), videoFrame.rotation));
                    RendererCommon.RendererEvents rendererEvents3 = this.rendererEvents;
                    if (rendererEvents3 != null) {
                        rendererEvents3.onFrameResolutionChanged(videoFrame.buffer.getWidth(), videoFrame.buffer.getHeight(), videoFrame.rotation);
                    }
                    this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                    this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                    this.frameRotation = videoFrame.rotation;
                }
            }
        }
    }

    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        setFpsReduction(0.0f);
    }

    public void setFpsReduction(float f) {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = AnonymousClass7TF.A1Q((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
        super.setFpsReduction(f);
    }

    public SurfaceEglRenderer(String str) {
        super(str);
    }

    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        logD(002.A0p("surfaceChanged: format: ", AnonymousClass000.A00(1989), "x", i, i2, i3));
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch A0y = Pxf.A0y();
        releaseEglSurface(new SurfaceEglRenderer$$ExternalSyntheticLambda0(A0y));
        ThreadUtils.awaitUninterruptibly(A0y);
    }

    public SurfaceEglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        super(str, videoFrameDrawer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer, RenderSynchronizer renderSynchronizer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer, renderSynchronizer);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, RenderSynchronizer renderSynchronizer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer, renderSynchronizer);
    }
}
