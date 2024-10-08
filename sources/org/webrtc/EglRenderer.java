package org.webrtc;

import X.002;
import X.AnonymousClass000;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C66582MXn;
import X.DbW;
import X.Pxf;
import X.Pxg;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import com.facebook.common.dextricks.Constants;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EglThread;
import org.webrtc.RendererCommon;

public class EglRenderer implements VideoSink {
    public static final long LOG_INTERVAL_SEC = 10;
    public static final String TAG = "EglRenderer";
    public final GlTextureFrameBuffer bitmapTextureFramebuffer;
    public final Matrix drawMatrix;
    public RendererCommon.GlDrawer drawer;
    public EglBase eglBase;
    public final Runnable eglExceptionCallback;
    public final EglSurfaceCreation eglSurfaceCreationRunnable;
    public EglThread eglThread;
    public volatile ErrorCallback errorCallback;
    public final Object fpsReductionLock;
    public final VideoFrameDrawer frameDrawer;
    public final ListenerManager frameDrawnListenersWithContext;
    public final ArrayList frameListeners;
    public final Object frameLock;
    public int framesDropped;
    public int framesReceived;
    public int framesRendered;
    public float layoutAspectRatio;
    public final Object layoutLock;
    public final Runnable logStatisticsRunnable;
    public long minRenderPeriodNs;
    public boolean mirrorHorizontally;
    public boolean mirrorVertically;
    public final String name;
    public long nextFrameTimeNs;
    public VideoFrame pendingFrame;
    public final ArrayList renderListeners;
    public long renderSwapBufferTimeNs;
    public long renderTimeNs;
    public int rotationDegrees;
    public final Object statisticsLock;
    public long statisticsStartTimeNs;
    public final Object threadLock;
    public boolean usePresentationTimeStamp;

    public class EglSurfaceCreation implements Runnable {
        public Object surface;

        public synchronized void run() {
            EglBase eglBase;
            if (!(this.surface == null || (eglBase = EglRenderer.this.eglBase) == null || eglBase.hasSurface())) {
                Object obj = this.surface;
                if (obj instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) obj);
                } else if (obj instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) obj);
                } else {
                    throw C66582MXn.A0k(obj, AnonymousClass000.A00(2334), new StringBuilder());
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        public EglSurfaceCreation() {
        }
    }

    public interface ErrorCallback {
        void onGlOutOfMemory();

        void onNoSurface();

        void onRenderThreadNotInitialized();
    }

    public interface FrameDrawnListenerWithContext {
        void onFrameDrawn(VideoFrame videoFrame);
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public class ListenerManager {
        public final ArrayList listenerList;

        public ListenerManager() {
            this.listenerList = new ArrayList();
        }

        public void addListener(Object obj) {
            EglRenderer.this.postToRenderThread(new EglRenderer$ListenerManager$$ExternalSyntheticLambda1(this, obj));
        }

        public void clear() {
            this.listenerList.clear();
        }

        /* renamed from: lambda$addListener$0$org-webrtc-EglRenderer$ListenerManager  reason: not valid java name */
        public /* synthetic */ void m42lambda$addListener$0$orgwebrtcEglRenderer$ListenerManager(Object obj) {
            this.listenerList.add(obj);
        }

        /* renamed from: lambda$removeListener$1$org-webrtc-EglRenderer$ListenerManager  reason: not valid java name */
        public /* synthetic */ void m43lambda$removeListener$1$orgwebrtcEglRenderer$ListenerManager(CountDownLatch countDownLatch, Object obj) {
            countDownLatch.countDown();
            Iterator it = this.listenerList.iterator();
            while (it.hasNext()) {
                if (it.next() == obj) {
                    it.remove();
                }
            }
        }

        public void removeListener(Object obj) {
            CountDownLatch A0y = Pxf.A0y();
            synchronized (EglRenderer.this.threadLock) {
                EglThread eglThread = EglRenderer.this.eglThread;
                if (eglThread != null) {
                    if (Thread.currentThread() != C13988Tno.A0h(eglThread.handler)) {
                        EglRenderer.this.postToRenderThread(new EglRenderer$ListenerManager$$ExternalSyntheticLambda0(this, A0y, obj));
                        ThreadUtils.awaitUninterruptibly(A0y);
                        return;
                    }
                    throw new RuntimeException("removeListener must not be called on the render thread.");
                }
            }
        }
    }

    public interface RenderListener {
        void onRender(long j);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    /* renamed from: lambda$release$0$org-webrtc-EglRenderer  reason: not valid java name */
    public /* synthetic */ void m37lambda$release$0$orgwebrtcEglRenderer(CountDownLatch countDownLatch) {
        GLES20.glUseProgram(0);
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.renderListeners.clear();
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        return 002.A0A(TimeUnit.NANOSECONDS.toMicros(j / ((long) i)), " us");
    }

    /* access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread */
    public void m36lambda$clearImage$5$orgwebrtcEglRenderer(float f, float f2, float f3, float f4) {
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null && eglBase2.hasSurface()) {
            this.eglBase.makeCurrent();
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            this.eglBase.swapBuffers();
        }
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    private void logE(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" ");
        Pxg.A1P(this.name, " ", str, sb);
        Logging.e(TAG, sb.toString(), th);
    }

    /* access modifiers changed from: private */
    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j = nanoTime - this.statisticsStartTimeNs;
            if (j > 0 && !(this.minRenderPeriodNs == Long.MAX_VALUE && this.framesReceived == 0)) {
                float nanos = ((float) (((long) this.framesRendered) * TimeUnit.SECONDS.toNanos(1))) / ((float) j);
                StringBuilder sb = new StringBuilder();
                sb.append("Duration: ");
                sb.append(TimeUnit.NANOSECONDS.toMillis(j));
                sb.append(" ms. Frames received: ");
                sb.append(this.framesReceived);
                sb.append(". Dropped: ");
                sb.append(this.framesDropped);
                sb.append(". Rendered: ");
                sb.append(this.framesRendered);
                sb.append(". Render fps: ");
                sb.append(decimalFormat.format((double) nanos));
                sb.append(". Average render time: ");
                sb.append(averageTimeAsString(this.renderTimeNs, this.framesRendered));
                sb.append(". Average swapBuffer time: ");
                sb.append(averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered));
                logD(AnonymousClass7TF.A0l(".", sb));
                resetStatistics(nanoTime);
            }
        }
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        FrameListener frameListener;
        Bitmap bitmap;
        if (!this.frameListeners.isEmpty()) {
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            Matrix matrix = this.drawMatrix;
            float f = 1.0f;
            if (this.mirrorHorizontally) {
                f = -1.0f;
            }
            float f2 = 1.0f;
            if (this.mirrorVertically) {
                f2 = -1.0f;
            }
            matrix.preScale(f, f2);
            this.drawMatrix.preScale(1.0f, -1.0f);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator it = this.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams frameListenerAndParams = (FrameListenerAndParams) it.next();
                if (z || !frameListenerAndParams.applyFpsReduction) {
                    it.remove();
                    VideoFrame videoFrame2 = videoFrame;
                    int rotatedWidth = (int) (frameListenerAndParams.scale * ((float) videoFrame2.getRotatedWidth()));
                    int rotatedHeight = (int) (frameListenerAndParams.scale * ((float) videoFrame2.getRotatedHeight()));
                    if (rotatedWidth == 0 || rotatedHeight == 0) {
                        frameListener = frameListenerAndParams.listener;
                        bitmap = null;
                    } else {
                        this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                        GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.frameBufferId);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.textureId, 0);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                        this.frameDrawer.drawFrame(videoFrame2, frameListenerAndParams.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                        bitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                        bitmap.copyPixelsFromBuffer(allocateDirect);
                        frameListener = frameListenerAndParams.listener;
                    }
                    frameListener.onFrame(bitmap);
                }
            }
        }
    }

    private void notifyFrameDrawnListeners(VideoFrame videoFrame) {
        Iterator it = this.frameDrawnListenersWithContext.listenerList.iterator();
        while (it.hasNext()) {
            ((FrameDrawnListenerWithContext) it.next()).onFrameDrawn(videoFrame);
        }
    }

    /* access modifiers changed from: private */
    public void postToRenderThread(Runnable runnable) {
        synchronized (this.threadLock) {
            EglThread eglThread2 = this.eglThread;
            if (eglThread2 != null) {
                eglThread2.handler.post(runnable);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r0 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r0.hasSurface() == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.eglBase.makeCurrent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        r9 = r2.fpsReductionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r7 = r2.minRenderPeriodNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r7 == Long.MAX_VALUE) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        if (r7 <= 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r5 = java.lang.System.nanoTime();
        r3 = r2.nextFrameTimeNs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r5 >= r3) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        logD("Skipping frame rendering - fps reduction is active.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r3 = r3 + r7;
        r2.nextFrameTimeNs = r3;
        r2.nextFrameTimeNs = java.lang.Math.max(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        r10 = java.lang.System.nanoTime();
        r9 = ((float) r13.getRotatedWidth()) / ((float) r13.getRotatedHeight());
        r1 = r2.layoutLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r8 = r2.layoutAspectRatio;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
        if (r8 != 0.0f) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0069, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        r7 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        if (r9 <= r8) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        r8 = r8 / r9;
        r9 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        r2.drawMatrix.reset();
        r2.drawMatrix.preTranslate(0.5f, 0.5f);
        r3 = r2.drawMatrix;
        r1 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        if (r2.mirrorHorizontally == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0087, code lost:
        r1 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        if (r2.mirrorVertically == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008d, code lost:
        r7 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008f, code lost:
        r3.preScale(r1, r7);
        r2.drawMatrix.preScale(r8, r9);
        r2.drawMatrix.preTranslate(-0.5f, -0.5f);
        r2.drawMatrix.preRotate((float) r2.rotationDegrees, 0.5f, 0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a6, code lost:
        if (r6 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
        r9 = r9 / r8;
        r8 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        r2.frameDrawer.drawFrame(r13, r2.drawer, r2.drawMatrix, 0, 0, r2.eglBase.surfaceWidth(), r2.eglBase.surfaceHeight());
        r3 = java.lang.System.nanoTime();
        swapBuffersOnRenderThread(r13, r3);
        r5 = r2.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2.framesRendered++;
        r2.renderTimeNs += r3 - r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e9, code lost:
        notifyCallbacks(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ed, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        logE("Error while drawing frame", r1);
        r0 = r2.errorCallback;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f5, code lost:
        if (r0 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f7, code lost:
        r0.onGlOutOfMemory();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fa, code lost:
        r2.drawer.release();
        r2.frameDrawer.release();
        r2.bitmapTextureFramebuffer.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010b, code lost:
        r13.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0115, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0116, code lost:
        logE("Error while eglMakeCurrent", r1);
        r13.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x011f, code lost:
        logD("Dropping frame - No surface");
        r0 = r2.errorCallback;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0126, code lost:
        if (r0 == null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0128, code lost:
        r0.onNoSurface();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012b, code lost:
        r13.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r0 = r2.eglBase;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void renderFrameOnRenderThread() {
        /*
            r20 = this;
            r2 = r20
            java.lang.Object r1 = r2.frameLock
            monitor-enter(r1)
            org.webrtc.VideoFrame r13 = r2.pendingFrame     // Catch:{ all -> 0x012f }
            if (r13 != 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x012f }
            return
        L_0x000b:
            r0 = 0
            r2.pendingFrame = r0     // Catch:{ all -> 0x012f }
            monitor-exit(r1)     // Catch:{ all -> 0x012f }
            org.webrtc.EglBase r0 = r2.eglBase
            if (r0 == 0) goto L_0x011f
            boolean r0 = r0.hasSurface()
            if (r0 == 0) goto L_0x011f
            org.webrtc.EglBase r0 = r2.eglBase     // Catch:{ GLException -> 0x0115 }
            r0.makeCurrent()     // Catch:{ GLException -> 0x0115 }
            java.lang.Object r9 = r2.fpsReductionLock
            monitor-enter(r9)
            long r7 = r2.minRenderPeriodNs     // Catch:{ all -> 0x0112 }
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004b
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0112 }
            long r3 = r2.nextFrameTimeNs     // Catch:{ all -> 0x0112 }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            java.lang.String r0 = "Skipping frame rendering - fps reduction is active."
            r2.logD(r0)     // Catch:{ all -> 0x0112 }
            goto L_0x004d
        L_0x0042:
            long r3 = r3 + r7
            r2.nextFrameTimeNs = r3     // Catch:{ all -> 0x0112 }
            long r0 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x0112 }
            r2.nextFrameTimeNs = r0     // Catch:{ all -> 0x0112 }
        L_0x004b:
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            monitor-exit(r9)     // Catch:{ all -> 0x0112 }
            long r10 = java.lang.System.nanoTime()
            int r0 = r13.getRotatedWidth()
            float r9 = (float) r0
            int r0 = r13.getRotatedHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            java.lang.Object r1 = r2.layoutLock
            monitor-enter(r1)
            float r8 = r2.layoutAspectRatio     // Catch:{ all -> 0x010f }
            r5 = 0
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            r8 = r9
        L_0x0069:
            monitor-exit(r1)     // Catch:{ all -> 0x010f }
            r7 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a9
            float r8 = r8 / r9
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x0073:
            android.graphics.Matrix r0 = r2.drawMatrix
            r0.reset()
            android.graphics.Matrix r0 = r2.drawMatrix
            r4 = 1056964608(0x3f000000, float:0.5)
            r0.preTranslate(r4, r4)
            android.graphics.Matrix r3 = r2.drawMatrix
            boolean r0 = r2.mirrorHorizontally
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0089
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0089:
            boolean r0 = r2.mirrorVertically
            if (r0 == 0) goto L_0x008f
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x008f:
            r3.preScale(r1, r7)
            android.graphics.Matrix r0 = r2.drawMatrix
            r0.preScale(r8, r9)
            android.graphics.Matrix r1 = r2.drawMatrix
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            r1.preTranslate(r0, r0)
            android.graphics.Matrix r1 = r2.drawMatrix
            int r0 = r2.rotationDegrees
            float r0 = (float) r0
            r1.preRotate(r0, r4, r4)
            if (r6 == 0) goto L_0x00e9
            goto L_0x00ad
        L_0x00a9:
            float r9 = r9 / r8
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0073
        L_0x00ad:
            android.opengl.GLES20.glClearColor(r5, r5, r5, r5)     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            org.webrtc.VideoFrameDrawer r12 = r2.frameDrawer     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            org.webrtc.RendererCommon$GlDrawer r14 = r2.drawer     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            android.graphics.Matrix r15 = r2.drawMatrix     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            r16 = 0
            org.webrtc.EglBase r0 = r2.eglBase     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            int r18 = r0.surfaceWidth()     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            org.webrtc.EglBase r0 = r2.eglBase     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            int r19 = r0.surfaceHeight()     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            r17 = r16
            r12.drawFrame(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            long r3 = java.lang.System.nanoTime()     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            r2.swapBuffersOnRenderThread(r13, r3)     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            java.lang.Object r5 = r2.statisticsLock     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            monitor-enter(r5)     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            int r0 = r2.framesRendered     // Catch:{ all -> 0x00e6 }
            int r0 = r0 + 1
            r2.framesRendered = r0     // Catch:{ all -> 0x00e6 }
            long r0 = r2.renderTimeNs     // Catch:{ all -> 0x00e6 }
            long r3 = r3 - r10
            long r0 = r0 + r3
            r2.renderTimeNs = r0     // Catch:{ all -> 0x00e6 }
            monitor-exit(r5)     // Catch:{ all -> 0x00e6 }
            goto L_0x00e9
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ GlOutOfMemoryException -> 0x00ed }
        L_0x00e9:
            r2.notifyCallbacks(r13, r6)     // Catch:{ GlOutOfMemoryException -> 0x00ed }
            goto L_0x012b
        L_0x00ed:
            r1 = move-exception
            java.lang.String r0 = "Error while drawing frame"
            r2.logE(r0, r1)     // Catch:{ all -> 0x010a }
            org.webrtc.EglRenderer$ErrorCallback r0 = r2.errorCallback     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x00fa
            r0.onGlOutOfMemory()     // Catch:{ all -> 0x010a }
        L_0x00fa:
            org.webrtc.RendererCommon$GlDrawer r0 = r2.drawer     // Catch:{ all -> 0x010a }
            r0.release()     // Catch:{ all -> 0x010a }
            org.webrtc.VideoFrameDrawer r0 = r2.frameDrawer     // Catch:{ all -> 0x010a }
            r0.release()     // Catch:{ all -> 0x010a }
            org.webrtc.GlTextureFrameBuffer r0 = r2.bitmapTextureFramebuffer     // Catch:{ all -> 0x010a }
            r0.release()     // Catch:{ all -> 0x010a }
            goto L_0x012b
        L_0x010a:
            r0 = move-exception
            r13.release()
            throw r0
        L_0x010f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010f }
            throw r0
        L_0x0112:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0112 }
            throw r0
        L_0x0115:
            r1 = move-exception
            java.lang.String r0 = "Error while eglMakeCurrent"
            r2.logE(r0, r1)
            r13.release()
            return
        L_0x011f:
            java.lang.String r0 = "Dropping frame - No surface"
            r2.logD(r0)
            org.webrtc.EglRenderer$ErrorCallback r0 = r2.errorCallback
            if (r0 == 0) goto L_0x012b
            r0.onNoSurface()
        L_0x012b:
            r13.release()
            return
        L_0x012f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.renderFrameOnRenderThread():void");
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0;
            this.renderSwapBufferTimeNs = 0;
        }
    }

    private void swapBuffersOnRenderThread(VideoFrame videoFrame, long j) {
        synchronized (this.threadLock) {
            EglThread eglThread2 = this.eglThread;
            if (eglThread2 != null) {
                eglThread2.scheduleRenderUpdate(new EglRenderer$$ExternalSyntheticLambda2(this, videoFrame, j));
            }
        }
    }

    public void addFrameDrawnListener(FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.frameDrawnListenersWithContext.addListener(frameDrawnListenerWithContext);
    }

    public void addRenderListener(RenderListener renderListener) {
        this.renderListeners.add(renderListener);
    }

    public void clearImage(float f, float f2, float f3, float f4) {
        synchronized (this.threadLock) {
            EglThread eglThread2 = this.eglThread;
            if (eglThread2 != null) {
                eglThread2.handler.postAtFrontOfQueue(new EglRenderer$$ExternalSyntheticLambda7(this, f, f2, f3, f4));
            }
        }
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(EglThread eglThread2, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.threadLock) {
            if (this.eglThread == null) {
                logD("Initializing EglRenderer");
                this.eglThread = eglThread2;
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
                eglThread2.addExceptionCallback(this.eglExceptionCallback);
                this.eglBase = EglBase.CC.create(eglThread2.eglConnection);
                eglThread2.handler.post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                eglThread2.handler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(10));
            } else {
                throw DbW.A0c(this.name, "Already initialized");
            }
        }
    }

    /* renamed from: lambda$addFrameListener$1$org-webrtc-EglRenderer  reason: not valid java name */
    public /* synthetic */ void m35lambda$addFrameListener$1$orgwebrtcEglRenderer(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    /* renamed from: lambda$releaseEglSurface$4$org-webrtc-EglRenderer  reason: not valid java name */
    public /* synthetic */ void m38lambda$releaseEglSurface$4$orgwebrtcEglRenderer(Runnable runnable) {
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 != null) {
            eglBase2.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* renamed from: lambda$swapBuffersOnRenderThread$6$org-webrtc-EglRenderer  reason: not valid java name */
    public /* synthetic */ void m41lambda$swapBuffersOnRenderThread$6$orgwebrtcEglRenderer(VideoFrame videoFrame, long j, boolean z) {
        if (!z) {
            EglBase eglBase2 = this.eglBase;
            if (eglBase2 != null && eglBase2.hasSurface()) {
                this.eglBase.makeCurrent();
            } else {
                return;
            }
        }
        boolean z2 = this.usePresentationTimeStamp;
        EglBase eglBase3 = this.eglBase;
        if (z2) {
            eglBase3.swapBuffers(videoFrame.timestampNs);
        } else {
            eglBase3.swapBuffers();
        }
        Iterator it = this.renderListeners.iterator();
        while (it.hasNext()) {
            ((RenderListener) it.next()).onRender(System.nanoTime());
        }
        notifyFrameDrawnListeners(videoFrame);
        synchronized (this.statisticsLock) {
            this.renderSwapBufferTimeNs += System.nanoTime() - j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r2 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        r1 = r5.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5.framesDropped++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrame(org.webrtc.VideoFrame r6) {
        /*
            r5 = this;
            java.lang.Object r1 = r5.statisticsLock
            monitor-enter(r1)
            int r0 = r5.framesReceived     // Catch:{ all -> 0x0055 }
            int r0 = r0 + 1
            r5.framesReceived = r0     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            java.lang.Object r4 = r5.threadLock
            monitor-enter(r4)
            org.webrtc.EglThread r0 = r5.eglThread     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "Dropping frame - Not initialized or already released."
            r5.logD(r0)     // Catch:{ all -> 0x0052 }
            org.webrtc.EglRenderer$ErrorCallback r0 = r5.errorCallback     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x001d
            r0.onRenderThreadNotInitialized()     // Catch:{ all -> 0x0052 }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            return
        L_0x001f:
            java.lang.Object r3 = r5.frameLock     // Catch:{ all -> 0x0052 }
            monitor-enter(r3)     // Catch:{ all -> 0x0052 }
            org.webrtc.VideoFrame r0 = r5.pendingFrame     // Catch:{ all -> 0x004f }
            r2 = 0
            if (r0 == 0) goto L_0x002b
            r2 = 1
            r0.release()     // Catch:{ all -> 0x004f }
        L_0x002b:
            r5.pendingFrame = r6     // Catch:{ all -> 0x004f }
            r6.retain()     // Catch:{ all -> 0x004f }
            org.webrtc.EglThread r0 = r5.eglThread     // Catch:{ all -> 0x004f }
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r1 = r0.handler     // Catch:{ all -> 0x004f }
            org.webrtc.EglRenderer$$ExternalSyntheticLambda0 r0 = new org.webrtc.EglRenderer$$ExternalSyntheticLambda0     // Catch:{ all -> 0x004f }
            r0.<init>(r5)     // Catch:{ all -> 0x004f }
            r1.post(r0)     // Catch:{ all -> 0x004f }
            monitor-exit(r3)     // Catch:{ all -> 0x004f }
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x004e
            java.lang.Object r1 = r5.statisticsLock
            monitor-enter(r1)
            int r0 = r5.framesDropped     // Catch:{ all -> 0x004b }
            int r0 = r0 + 1
            r5.framesDropped = r0     // Catch:{ all -> 0x004b }
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            return
        L_0x004b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            throw r0
        L_0x004e:
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            throw r0
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.onFrame(org.webrtc.VideoFrame):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r3 = r0.getStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void printStackTrace() {
        /*
            r5 = this;
            java.lang.Object r4 = r5.threadLock
            monitor-enter(r4)
            org.webrtc.EglThread r0 = r5.eglThread     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x002a
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r0 = r0.handler     // Catch:{ all -> 0x002c }
            java.lang.Thread r0 = X.C13988Tno.A0h(r0)     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x002a
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()     // Catch:{ all -> 0x002c }
            int r2 = r3.length     // Catch:{ all -> 0x002c }
            if (r2 <= 0) goto L_0x002a
            java.lang.String r0 = "EglRenderer stack trace:"
            r5.logW(r0)     // Catch:{ all -> 0x002c }
            r1 = 0
        L_0x001c:
            r0 = r3[r1]     // Catch:{ all -> 0x002c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x002c }
            r5.logW(r0)     // Catch:{ all -> 0x002c }
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x002a
            goto L_0x001c
        L_0x002a:
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.printStackTrace():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        org.webrtc.ThreadUtils.awaitUninterruptibly(r4);
        r1 = r5.frameLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r5.pendingFrame;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r0.release();
        r5.pendingFrame = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        logD("Releasing done.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r5 = this;
            java.lang.String r0 = "Releasing."
            r5.logD(r0)
            java.util.concurrent.CountDownLatch r4 = X.Pxf.A0y()
            java.lang.Object r3 = r5.threadLock
            monitor-enter(r3)
            org.webrtc.EglThread r0 = r5.eglThread     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x001b
            r0 = 352(0x160, float:4.93E-43)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x0057 }
            r5.logD(r0)     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)     // Catch:{ all -> 0x0057 }
            return
        L_0x001b:
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r1 = r0.handler     // Catch:{ all -> 0x0057 }
            java.lang.Runnable r0 = r5.logStatisticsRunnable     // Catch:{ all -> 0x0057 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0057 }
            org.webrtc.EglThread r1 = r5.eglThread     // Catch:{ all -> 0x0057 }
            java.lang.Runnable r0 = r5.eglExceptionCallback     // Catch:{ all -> 0x0057 }
            r1.removeExceptionCallback(r0)     // Catch:{ all -> 0x0057 }
            org.webrtc.EglThread r0 = r5.eglThread     // Catch:{ all -> 0x0057 }
            org.webrtc.EglThread$HandlerWithExceptionCallbacks r1 = r0.handler     // Catch:{ all -> 0x0057 }
            org.webrtc.EglRenderer$$ExternalSyntheticLambda3 r0 = new org.webrtc.EglRenderer$$ExternalSyntheticLambda3     // Catch:{ all -> 0x0057 }
            r0.<init>(r5, r4)     // Catch:{ all -> 0x0057 }
            r1.postAtFrontOfQueue(r0)     // Catch:{ all -> 0x0057 }
            org.webrtc.EglThread r0 = r5.eglThread     // Catch:{ all -> 0x0057 }
            r0.release()     // Catch:{ all -> 0x0057 }
            r2 = 0
            r5.eglThread = r2     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)     // Catch:{ all -> 0x0057 }
            org.webrtc.ThreadUtils.awaitUninterruptibly(r4)
            java.lang.Object r1 = r5.frameLock
            monitor-enter(r1)
            org.webrtc.VideoFrame r0 = r5.pendingFrame     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004d
            r0.release()     // Catch:{ all -> 0x0054 }
            r5.pendingFrame = r2     // Catch:{ all -> 0x0054 }
        L_0x004d:
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "Releasing done."
            r5.logD(r0)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            throw r0
        L_0x0057:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0057 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.release():void");
    }

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface((Object) null);
        synchronized (this.threadLock) {
            EglThread eglThread2 = this.eglThread;
            if (eglThread2 != null) {
                eglThread2.handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.eglThread.handler.postAtFrontOfQueue(new EglRenderer$$ExternalSyntheticLambda6(this, runnable));
                return;
            }
            runnable.run();
        }
    }

    public void removeFrameDrawnListener(FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.frameDrawnListenersWithContext.removeListener(frameDrawnListenerWithContext);
    }

    public void setErrorCallback(ErrorCallback errorCallback2) {
        this.errorCallback = errorCallback2;
    }

    public void setFpsReduction(float f) {
        long j;
        logD(002.A0N("setFpsReduction: ", f));
        synchronized (this.fpsReductionLock) {
            long j2 = this.minRenderPeriodNs;
            if (f <= 0.0f) {
                j = Long.MAX_VALUE;
            } else {
                j = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f);
            }
            this.minRenderPeriodNs = j;
            if (j != j2) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        logD(002.A0N("setLayoutAspectRatio: ", f));
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        logD(002.A1D("setMirrorHorizontally: ", z));
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        logD(002.A1D("setMirrorVertically: ", z));
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public void setRotation(int i) {
        logD(002.A0O("setRotation: ", i));
        synchronized (this.layoutLock) {
            this.rotationDegrees = i;
        }
    }

    private void logD(String str) {
        hashCode();
        boolean z = Logging.loggingEnabled;
    }

    private void logW(String str) {
        hashCode();
        boolean z = Logging.loggingEnabled;
    }

    /* renamed from: lambda$removeFrameListener$2$org-webrtc-EglRenderer  reason: not valid java name */
    public /* synthetic */ void m39lambda$removeFrameListener$2$orgwebrtcEglRenderer(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (((FrameListenerAndParams) it.next()).listener == frameListener) {
                it.remove();
            }
        }
    }

    /* renamed from: lambda$removeRenderListener$3$org-webrtc-EglRenderer  reason: not valid java name */
    public /* synthetic */ void m40lambda$removeRenderListener$3$orgwebrtcEglRenderer(CountDownLatch countDownLatch, RenderListener renderListener) {
        countDownLatch.countDown();
        Iterator it = this.renderListeners.iterator();
        while (it.hasNext()) {
            if (it.next() == renderListener) {
                it.remove();
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch A0y = Pxf.A0y();
        synchronized (this.threadLock) {
            EglThread eglThread2 = this.eglThread;
            if (eglThread2 != null) {
                if (Thread.currentThread() != C13988Tno.A0h(eglThread2.handler)) {
                    postToRenderThread(new EglRenderer$$ExternalSyntheticLambda1(this, A0y, frameListener));
                    ThreadUtils.awaitUninterruptibly(A0y);
                    return;
                }
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            }
        }
    }

    public void removeRenderListener(RenderListener renderListener) {
        CountDownLatch A0y = Pxf.A0y();
        synchronized (this.threadLock) {
            EglThread eglThread2 = this.eglThread;
            if (eglThread2 != null) {
                if (Thread.currentThread() != C13988Tno.A0h(eglThread2.handler)) {
                    postToRenderThread(new EglRenderer$$ExternalSyntheticLambda4(this, A0y, renderListener));
                    ThreadUtils.awaitUninterruptibly(A0y);
                    return;
                }
                throw new RuntimeException("removeRenderListener must not be called on the render thread.");
            }
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.threadLock = new Object();
        this.eglExceptionCallback = new Runnable() {
            public void run() {
                synchronized (EglRenderer.this.threadLock) {
                    EglRenderer.this.eglThread = null;
                }
            }
        };
        this.frameListeners = new ArrayList();
        this.renderListeners = new ArrayList();
        this.frameDrawnListenersWithContext = new ListenerManager();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.rotationDegrees = 0;
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() {
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.threadLock) {
                    EglRenderer eglRenderer = EglRenderer.this;
                    EglThread eglThread = eglRenderer.eglThread;
                    if (eglThread != null) {
                        eglThread.handler.removeCallbacks(eglRenderer.logStatisticsRunnable);
                        EglRenderer eglRenderer2 = EglRenderer.this;
                        eglRenderer2.eglThread.handler.postDelayed(eglRenderer2.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(10));
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation();
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
        postToRenderThread(new EglRenderer$$ExternalSyntheticLambda5(this, glDrawer, frameListener, f, z));
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, RenderSynchronizer renderSynchronizer) {
        init(context, iArr, glDrawer, false, renderSynchronizer);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, (RendererCommon.GlDrawer) null, false);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z, RenderSynchronizer renderSynchronizer) {
        init(EglThread.create((EglThread.ReleaseMonitor) null, context, iArr, renderSynchronizer), glDrawer, z);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        init(EglThread.create((EglThread.ReleaseMonitor) null, context, iArr, (RenderSynchronizer) null), glDrawer, z);
    }
}
