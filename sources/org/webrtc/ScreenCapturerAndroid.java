package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.view.Surface;

public class ScreenCapturerAndroid implements VideoSink, VideoCapturer {
    public static final int DISPLAY_FLAGS = 3;
    public static final int VIRTUAL_DISPLAY_DPI = 400;
    public CapturerObserver capturerObserver;
    public int height;
    public boolean isDisposed;
    public MediaProjection mediaProjection;
    public final MediaProjection.Callback mediaProjectionCallback;
    public MediaProjectionManager mediaProjectionManager;
    public final Intent mediaProjectionPermissionResultData;
    public long numCapturedFrames;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    public int width;

    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.handler, (Runnable) new Runnable() {
                public void run() {
                    ScreenCapturerAndroid.this.virtualDisplay.release();
                    ScreenCapturerAndroid.this.createVirtualDisplay();
                }
            });
        }
    }

    public synchronized void dispose() {
        this.isDisposed = true;
    }

    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper2, Context context, CapturerObserver capturerObserver2) {
        RuntimeException runtimeException;
        checkNotDisposed();
        if (capturerObserver2 != null) {
            this.capturerObserver = capturerObserver2;
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
            } else {
                runtimeException = new RuntimeException("surfaceTextureHelper not set.");
            }
        } else {
            runtimeException = new RuntimeException("capturerObserver not set.");
        }
        throw runtimeException;
    }

    public boolean isScreencast() {
        return true;
    }

    public synchronized void startCapture(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        MediaProjection mediaProjection2 = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        this.mediaProjection = mediaProjection2;
        mediaProjection2.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.handler);
        createVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        this.surfaceTextureHelper.startListening(this);
    }

    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.handler, (Runnable) new Runnable() {
            public void run() {
                ScreenCapturerAndroid.this.surfaceTextureHelper.stopListening();
                ScreenCapturerAndroid.this.capturerObserver.onCapturerStopped();
                ScreenCapturerAndroid screenCapturerAndroid = ScreenCapturerAndroid.this;
                VirtualDisplay virtualDisplay = screenCapturerAndroid.virtualDisplay;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    screenCapturerAndroid = ScreenCapturerAndroid.this;
                    screenCapturerAndroid.virtualDisplay = null;
                }
                MediaProjection mediaProjection = screenCapturerAndroid.mediaProjection;
                if (mediaProjection != null) {
                    mediaProjection.unregisterCallback(screenCapturerAndroid.mediaProjectionCallback);
                    ScreenCapturerAndroid.this.mediaProjection.stop();
                    ScreenCapturerAndroid.this.mediaProjection = null;
                }
            }
        });
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    /* access modifiers changed from: private */
    public void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, VIRTUAL_DISPLAY_DPI, 3, new Surface(this.surfaceTextureHelper.surfaceTexture), (VirtualDisplay.Callback) null, (Handler) null);
    }

    public void onFrame(VideoFrame videoFrame) {
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }
}
