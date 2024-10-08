package org.webrtc;

import X.002;
import X.C13988Tno;
import X.JTP;
import X.Pxe;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;

public class SurfaceViewRenderer extends SurfaceView implements SurfaceHolder.Callback, RendererCommon.RendererEvents, VideoSink {
    public static final String TAG = "SurfaceViewRenderer";
    public final SurfaceEglRenderer eglRenderer;
    public boolean enableFixedSize;
    public RendererCommon.RendererEvents rendererEvents;
    public final String resourceName;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;
    public int surfaceHeight;
    public int surfaceWidth;
    public final RendererCommon.VideoLayoutMeasure videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    private void logD(String str) {
        boolean z = Logging.loggingEnabled;
    }

    public void addFrameDrawnListener(EglRenderer.FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.eglRenderer.addFrameDrawnListener(frameDrawnListenerWithContext);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f, glDrawer);
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, RenderSynchronizer renderSynchronizer) {
        init(context, rendererEvents2, EglBase.CONFIG_PLAIN, new GlRectDrawer(), renderSynchronizer);
    }

    /* renamed from: lambda$onFrameResolutionChanged$0$org-webrtc-SurfaceViewRenderer  reason: not valid java name */
    public /* synthetic */ void m56lambda$onFrameResolutionChanged$0$orgwebrtcSurfaceViewRenderer(int i, int i2) {
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
        updateSurfaceSize();
        requestLayout();
    }

    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
        if (rendererEvents2 != null) {
            rendererEvents2.onFirstFrameRendered();
        }
    }

    public void onFrame(VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        postOrRun(new org.webrtc.SurfaceViewRenderer$$ExternalSyntheticLambda0(r2, r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r5 == 180) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r5 != 0) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r5 != 180) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrameResolutionChanged(int r3, int r4, int r5) {
        /*
            r2 = this;
            org.webrtc.RendererCommon$RendererEvents r0 = r2.rendererEvents
            if (r0 == 0) goto L_0x0007
            r0.onFrameResolutionChanged(r3, r4, r5)
        L_0x0007:
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto L_0x000e
            r1 = r4
            if (r5 != r0) goto L_0x0011
        L_0x000e:
            r1 = r3
            if (r5 == 0) goto L_0x0013
        L_0x0011:
            if (r5 != r0) goto L_0x0014
        L_0x0013:
            r3 = r4
        L_0x0014:
            org.webrtc.SurfaceViewRenderer$$ExternalSyntheticLambda0 r0 = new org.webrtc.SurfaceViewRenderer$$ExternalSyntheticLambda0
            r0.<init>(r2, r1, r3)
            r2.postOrRun(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.SurfaceViewRenderer.onFrameResolutionChanged(int, int, int):void");
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    public void removeFrameDrawnListener(EglRenderer.FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.eglRenderer.removeFrameDrawnListener(frameDrawnListenerWithContext);
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setFpsReduction(float f) {
        this.eglRenderer.setFpsReduction(f);
    }

    public void setMirror(boolean z) {
        this.eglRenderer.setMirror(z);
    }

    public void setRotation(int i) {
        this.eglRenderer.setRotation(i);
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
        String resourceName2 = getResourceName();
        this.resourceName = resourceName2;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName2);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float A00 = JTP.A00((float) getWidth(), this);
        int i = this.rotatedFrameWidth;
        float f = (float) i;
        int i2 = this.rotatedFrameHeight;
        float f2 = (float) i2;
        if (f / f2 > A00) {
            i = (int) (f2 * A00);
        } else {
            i2 = (int) (f / A00);
        }
        int min = Math.min(getWidth(), i);
        int min2 = Math.min(getHeight(), i2);
        StringBuilder sb = new StringBuilder();
        sb.append("updateSurfaceSize. Layout size: ");
        sb.append(getWidth());
        sb.append("x");
        sb.append(getHeight());
        sb.append(", frame size: ");
        sb.append(this.rotatedFrameWidth);
        sb.append("x");
        sb.append(this.rotatedFrameHeight);
        C13988Tno.A1Q(", requested surface size: ", "x", sb, min);
        sb.append(min2);
        sb.append(", old surface size: ");
        int i3 = this.surfaceWidth;
        sb.append(i3);
        sb.append("x");
        int i4 = this.surfaceHeight;
        logD(Pxe.A0z(sb, i4));
        if (min != i3 || min2 != i4) {
            this.surfaceWidth = min;
            this.surfaceHeight = min2;
            getHolder().setFixedSize(min, min2);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio(((float) (i3 - i)) / ((float) (i4 - i2)));
        updateSurfaceSize();
    }

    public void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        logD(002.A02(measure.x, measure.y, "onMeasure(). New size: ", "x"));
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        updateSurfaceSize();
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType);
        requestLayout();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String resourceName2 = getResourceName();
        this.resourceName = resourceName2;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName2);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f) {
        this.eglRenderer.addFrameListener(frameListener, f);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, (RendererCommon.RendererEvents) this, iArr, glDrawer);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer, RenderSynchronizer renderSynchronizer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer, renderSynchronizer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2) {
        init(context, rendererEvents2, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }
}
