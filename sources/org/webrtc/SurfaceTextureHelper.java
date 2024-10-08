package org.webrtc;

import X.002;
import X.C13988Tno;
import X.DbW;
import X.Pxf;
import X.Pxg;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

public class SurfaceTextureHelper {
    public static final String TAG = "SurfaceTextureHelper";
    public final EglBase eglBase;
    public final FrameRefMonitor frameRefMonitor;
    public int frameRotation;
    public final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public VideoSink listener;
    public final int oesTextureId;
    public VideoSink pendingListener;
    public final Runnable setListenerRunnable;
    public final SurfaceTexture surfaceTexture;
    public int textureHeight;
    public final TextureBufferImpl.RefCountMonitor textureRefCountMonitor;
    public int textureWidth;
    public final TimestampAligner timestampAligner;
    public final YuvConverter yuvConverter;

    public interface FrameRefMonitor {
        void onDestroyBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onNewBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onReleaseBuffer(VideoFrame.TextureBuffer textureBuffer);

        void onRetainBuffer(VideoFrame.TextureBuffer textureBuffer);
    }

    /* renamed from: lambda$dispose$5$org-webrtc-SurfaceTextureHelper  reason: not valid java name */
    public /* synthetic */ void m50lambda$dispose$5$orgwebrtcSurfaceTextureHelper() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
    }

    /* renamed from: lambda$new$0$org-webrtc-SurfaceTextureHelper  reason: not valid java name */
    public /* synthetic */ void m51lambda$new$0$orgwebrtcSurfaceTextureHelper(SurfaceTexture surfaceTexture2) {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    /* renamed from: lambda$returnTextureFrame$4$org-webrtc-SurfaceTextureHelper  reason: not valid java name */
    public /* synthetic */ void m52lambda$returnTextureFrame$4$orgwebrtcSurfaceTextureHelper() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    /* renamed from: lambda$stopListening$1$org-webrtc-SurfaceTextureHelper  reason: not valid java name */
    public /* synthetic */ void m55lambda$stopListening$1$orgwebrtcSurfaceTextureHelper() {
        this.listener = null;
        this.pendingListener = null;
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, new YuvConverter(), (FrameRefMonitor) null);
    }

    private void release() {
        if (C13988Tno.A0h(this.handler) != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            this.yuvConverter.release();
            GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
            this.surfaceTexture.release();
            this.eglBase.release();
            this.handler.getLooper().quit();
            TimestampAligner timestampAligner2 = this.timestampAligner;
            if (timestampAligner2 != null) {
                timestampAligner2.dispose();
            }
        }
    }

    /* access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new SurfaceTextureHelper$$ExternalSyntheticLambda5(this));
    }

    private void tryDeliverTextureFrame() {
        if (C13988Tno.A0h(this.handler) != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
            if (this.textureWidth == 0 || this.textureHeight == 0) {
                boolean z = Logging.loggingEnabled;
                return;
            }
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            updateTexImage();
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            long timestamp = this.surfaceTexture.getTimestamp();
            TimestampAligner timestampAligner2 = this.timestampAligner;
            if (timestampAligner2 != null) {
                timestamp = timestampAligner2.translateTimestamp(timestamp);
            }
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, this.textureRefCountMonitor);
            FrameRefMonitor frameRefMonitor2 = this.frameRefMonitor;
            if (frameRefMonitor2 != null) {
                frameRefMonitor2.onNewBuffer(textureBufferImpl);
            }
            VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
            this.listener.onFrame(videoFrame);
            videoFrame.release();
        }
    }

    /* access modifiers changed from: private */
    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        boolean z = Logging.loggingEnabled;
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, (Runnable) new SurfaceTextureHelper$$ExternalSyntheticLambda0(this));
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    /* renamed from: lambda$setFrameRotation$3$org-webrtc-SurfaceTextureHelper  reason: not valid java name */
    public /* synthetic */ void m53lambda$setFrameRotation$3$orgwebrtcSurfaceTextureHelper(int i) {
        this.frameRotation = i;
    }

    /* renamed from: lambda$setTextureSizeWithRotation$2$org-webrtc-SurfaceTextureHelper  reason: not valid java name */
    public /* synthetic */ void m54lambda$setTextureSizeWithRotation$2$orgwebrtcSurfaceTextureHelper(int i, int i2, int i3) {
        this.textureWidth = i;
        this.textureHeight = i2;
        this.frameRotation = i3;
        tryDeliverTextureFrame();
    }

    public void setFrameRotation(int i) {
        this.handler.post(new SurfaceTextureHelper$$ExternalSyntheticLambda3(this, i));
    }

    public void setTextureSize(int i, int i2) {
        setTextureSizeWithRotation(i, i2, this.frameRotation);
    }

    public void setTextureSizeWithRotation(int i, int i2, int i3) {
        if (i <= 0) {
            throw DbW.A0a("Texture width must be positive, but was ", i);
        } else if (i2 > 0) {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new SurfaceTextureHelper$$ExternalSyntheticLambda1(this, i, i2, i3));
        } else {
            throw DbW.A0a("Texture height must be positive, but was ", i2);
        }
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public void stopListening() {
        boolean z = Logging.loggingEnabled;
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, (Runnable) new SurfaceTextureHelper$$ExternalSyntheticLambda2(this));
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture2, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler2) {
        surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener, handler2);
    }

    public SurfaceTextureHelper(EglBase.Context context, Handler handler2, boolean z, YuvConverter yuvConverter2, FrameRefMonitor frameRefMonitor2) {
        TimestampAligner timestampAligner2;
        this.textureRefCountMonitor = new TextureBufferImpl.RefCountMonitor() {
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                SurfaceTextureHelper.this.returnTextureFrame();
                FrameRefMonitor frameRefMonitor = SurfaceTextureHelper.this.frameRefMonitor;
                if (frameRefMonitor != null) {
                    frameRefMonitor.onDestroyBuffer(textureBufferImpl);
                }
            }

            public void onRelease(TextureBufferImpl textureBufferImpl) {
                FrameRefMonitor frameRefMonitor = SurfaceTextureHelper.this.frameRefMonitor;
                if (frameRefMonitor != null) {
                    frameRefMonitor.onReleaseBuffer(textureBufferImpl);
                }
            }

            public void onRetain(TextureBufferImpl textureBufferImpl) {
                FrameRefMonitor frameRefMonitor = SurfaceTextureHelper.this.frameRefMonitor;
                if (frameRefMonitor != null) {
                    frameRefMonitor.onRetainBuffer(textureBufferImpl);
                }
            }
        };
        this.setListenerRunnable = new Runnable() {
            public void run() {
                boolean z = Logging.loggingEnabled;
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                surfaceTextureHelper.pendingListener = null;
                if (surfaceTextureHelper.hasPendingTexture) {
                    surfaceTextureHelper.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (C13988Tno.A0h(handler2) == Thread.currentThread()) {
            this.handler = handler2;
            if (z) {
                timestampAligner2 = new TimestampAligner();
            } else {
                timestampAligner2 = null;
            }
            this.timestampAligner = timestampAligner2;
            this.yuvConverter = yuvConverter2;
            this.frameRefMonitor = frameRefMonitor2;
            EglBase create = EglBase.CC.create(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = create;
            try {
                create.createDummyPbufferSurface();
                create.makeCurrent();
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture2;
                surfaceTexture2.setOnFrameAvailableListener(new SurfaceTextureHelper$$ExternalSyntheticLambda4(this), handler2);
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler2.getLooper().quit();
                throw e;
            }
        } else {
            throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
        }
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, YuvConverter yuvConverter2) {
        return create(str, context, z, yuvConverter2, (FrameRefMonitor) null);
    }

    public static SurfaceTextureHelper create(final String str, EglBase.Context context, boolean z, YuvConverter yuvConverter2, FrameRefMonitor frameRefMonitor2) {
        final Handler A0N = Pxg.A0N(Pxf.A0I(str));
        final EglBase.Context context2 = context;
        final boolean z2 = z;
        final YuvConverter yuvConverter3 = yuvConverter2;
        final FrameRefMonitor frameRefMonitor3 = frameRefMonitor2;
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(A0N, (Callable) new Callable() {
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(EglBase.Context.this, A0N, z2, yuvConverter3, frameRefMonitor3);
                } catch (RuntimeException e) {
                    Logging.e(SurfaceTextureHelper.TAG, 002.A0R(str, " create failure"), e);
                    return null;
                }
            }
        });
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false, new YuvConverter(), (FrameRefMonitor) null);
    }
}
