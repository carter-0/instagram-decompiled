package org.webrtc;

import X.002;
import X.0BU;
import X.AnonymousClass000;
import X.AnonymousClass0fI;
import X.C13988Tno;
import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;

public class Camera1Session implements CameraSession {
    public static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    public static final String TAG = "Camera1Session";
    public static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, CameraCapturer.OPEN_CAMERA_TIMEOUT, 50);
    public static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, CameraCapturer.OPEN_CAMERA_TIMEOUT, 50);
    public final Context applicationContext;
    public final Camera camera;
    public final int cameraId;
    public final Handler cameraThreadHandler = new Handler();
    public final CameraEnumerationAndroid.CaptureFormat captureFormat;
    public final boolean captureToTexture;
    public final long constructionTimeNs;
    public final CameraSession.Events events;
    public boolean firstFrameReported;
    public final Camera.CameraInfo info;
    public SessionState state;
    public final SurfaceTextureHelper surfaceTextureHelper;

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    /* access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = CameraSession.CC.getDeviceOrientation(this.applicationContext);
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing == 0) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (cameraInfo.orientation + deviceOrientation) % 360;
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() {
            /* renamed from: lambda$onPreviewFrame$0$org-webrtc-Camera1Session$2  reason: not valid java name */
            public /* synthetic */ void m26lambda$onPreviewFrame$0$orgwebrtcCamera1Session$2(byte[] bArr) {
                Camera1Session camera1Session = Camera1Session.this;
                int i = Camera1Session.NUMBER_OF_CAPTURE_BUFFERS;
                if (camera1Session.state == SessionState.RUNNING) {
                    camera1Session.camera.addCallbackBuffer(bArr);
                }
            }

            /* renamed from: lambda$onPreviewFrame$1$org-webrtc-Camera1Session$2  reason: not valid java name */
            public /* synthetic */ void m27lambda$onPreviewFrame$1$orgwebrtcCamera1Session$2(byte[] bArr) {
                Camera1Session camera1Session = Camera1Session.this;
                int i = Camera1Session.NUMBER_OF_CAPTURE_BUFFERS;
                camera1Session.cameraThreadHandler.post(new Camera1Session$2$$ExternalSyntheticLambda0(this, bArr));
            }

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                Camera1Session.this.checkIsOnCameraThread();
                Camera1Session camera1Session = Camera1Session.this;
                if (camera == camera1Session.camera && camera1Session.state == SessionState.RUNNING) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                    Camera1Session camera1Session2 = Camera1Session.this;
                    if (!camera1Session2.firstFrameReported) {
                        Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - camera1Session2.constructionTimeNs));
                        camera1Session2 = Camera1Session.this;
                        camera1Session2.firstFrameReported = true;
                    }
                    CameraEnumerationAndroid.CaptureFormat captureFormat = camera1Session2.captureFormat;
                    VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, captureFormat.width, captureFormat.height, new Camera1Session$2$$ExternalSyntheticLambda1(this, bArr)), Camera1Session.this.getFrameOrientation(), nanos);
                    Camera1Session camera1Session3 = Camera1Session.this;
                    camera1Session3.events.onFrameCaptured(camera1Session3, videoFrame);
                    videoFrame.release();
                    return;
                }
                boolean z = Logging.loggingEnabled;
            }
        });
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new Camera1Session$$ExternalSyntheticLambda0(this));
    }

    private void startCapturing() {
        boolean z = Logging.loggingEnabled;
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() {
            public void onError(int i, Camera camera) {
                String A0O;
                if (0BU.A04()) {
                    0BU.A02(camera);
                }
                if (i == 100) {
                    A0O = "Camera server died!";
                } else {
                    A0O = 002.A0O("Camera error: ", i);
                }
                boolean z = Logging.loggingEnabled;
                Camera1Session.this.stopInternal();
                Camera1Session camera1Session = Camera1Session.this;
                CameraSession.Events events = camera1Session.events;
                if (i == 2) {
                    events.onCameraDisconnected(camera1Session);
                } else {
                    events.onCameraError(camera1Session, A0O);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            AnonymousClass0fI.A01(this.camera);
        } catch (RuntimeException e) {
            stopInternal();
            this.events.onCameraError(this, e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void stopInternal() {
        boolean z = Logging.loggingEnabled;
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            this.state = sessionState2;
            this.surfaceTextureHelper.stopListening();
            AnonymousClass0fI.A02(this.camera);
            AnonymousClass0fI.A00(this.camera);
            this.events.onCameraClosed(this);
        }
    }

    public void stop() {
        boolean z = Logging.loggingEnabled;
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            stopInternal();
            camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public Camera1Session(CameraSession.Events events2, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper2, int i, Camera camera2, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat2, long j) {
        boolean z2 = Logging.loggingEnabled;
        this.events = events2;
        this.captureToTexture = z;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.cameraId = i;
        this.camera = camera2;
        this.info = cameraInfo;
        this.captureFormat = captureFormat2;
        this.constructionTimeNs = j;
        surfaceTextureHelper2.setTextureSize(captureFormat2.width, captureFormat2.height);
        startCapturing();
    }

    /* access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != C13988Tno.A0h(this.cameraThreadHandler)) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void create(org.webrtc.CameraSession.CreateSessionCallback r14, org.webrtc.CameraSession.Events r15, boolean r16, android.content.Context r17, org.webrtc.SurfaceTextureHelper r18, int r19, int r20, int r21, int r22) {
        /*
            long r12 = java.lang.System.nanoTime()
            boolean r0 = org.webrtc.Logging.loggingEnabled
            r4 = r15
            r15.onCameraOpening()
            X.0fI r0 = X.AnonymousClass0fI.$redex_init_class     // Catch:{ RuntimeException -> 0x001c }
            r8 = r19
            android.hardware.Camera r9 = android.hardware.Camera.open(r8)     // Catch:{ RuntimeException -> 0x001c }
            boolean r0 = X.0BU.A04()     // Catch:{ RuntimeException -> 0x001c }
            if (r0 == 0) goto L_0x0029
            X.0BU.A03(r9)     // Catch:{ RuntimeException -> 0x001c }
            goto L_0x0029
        L_0x001c:
            r0 = move-exception
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            X.AnonymousClass0fI.A00(r9)
        L_0x0022:
            org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.ERROR
            java.lang.String r0 = r0.getMessage()
            goto L_0x0033
        L_0x0029:
            if (r9 != 0) goto L_0x0037
            org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.ERROR
            java.lang.String r0 = "android.hardware.Camera.open returned null for camera id = "
            java.lang.String r0 = X.002.A0O(r0, r8)
        L_0x0033:
            r14.onFailure(r1, r0)
            return
        L_0x0037:
            r7 = r18
            android.graphics.SurfaceTexture r0 = r7.surfaceTexture     // Catch:{ IOException | RuntimeException -> 0x001e }
            r9.setPreviewTexture(r0)     // Catch:{ IOException | RuntimeException -> 0x001e }
            android.hardware.Camera$CameraInfo r10 = new android.hardware.Camera$CameraInfo
            r10.<init>()
            android.hardware.Camera.getCameraInfo(r8, r10)
            android.hardware.Camera$Parameters r1 = r9.getParameters()     // Catch:{  }
            r3 = r20
            r2 = r21
            r0 = r22
            org.webrtc.CameraEnumerationAndroid$CaptureFormat r11 = findClosestCaptureFormat(r1, r3, r2, r0)     // Catch:{  }
            org.webrtc.Size r0 = findClosestPictureSize(r1, r3, r2)     // Catch:{  }
            r5 = r16
            updateCameraParameters(r9, r1, r11, r0, r5)     // Catch:{  }
            r3 = 0
            if (r16 != 0) goto L_0x0076
            int r2 = r11.frameSize()
            r1 = 0
        L_0x0065:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r2)
            byte[] r0 = r0.array()
            r9.addCallbackBuffer(r0)
            int r1 = r1 + 1
            r0 = 3
            if (r1 >= r0) goto L_0x0076
            goto L_0x0065
        L_0x0076:
            r9.setDisplayOrientation(r3)
            org.webrtc.Camera1Session r3 = new org.webrtc.Camera1Session
            r6 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.onDone(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera1Session.create(org.webrtc.CameraSession$CreateSessionCallback, org.webrtc.CameraSession$Events, boolean, android.content.Context, org.webrtc.SurfaceTextureHelper, int, int, int, int):void");
    }

    public static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i, int i2, int i3) {
        List convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        boolean z = Logging.loggingEnabled;
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i3);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i, i2);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    public static Size findClosestPictureSize(Camera.Parameters parameters, int i, int i2) {
        return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
    }

    public static void updateCameraParameters(Camera camera2, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat2, Size size, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat2.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat2.width, captureFormat2.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        String A00 = AnonymousClass000.A00(4658);
        if (supportedFocusModes.contains(A00)) {
            parameters.setFocusMode(A00);
        }
        camera2.setParameters(parameters);
    }

    /* renamed from: lambda$listenForTextureFrames$0$org-webrtc-Camera1Session  reason: not valid java name */
    public /* synthetic */ void m25lambda$listenForTextureFrames$0$orgwebrtcCamera1Session(VideoFrame videoFrame) {
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            boolean z = Logging.loggingEnabled;
            return;
        }
        boolean z2 = true;
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs));
            this.firstFrameReported = true;
        }
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) videoFrame.buffer;
        if (this.info.facing != 1) {
            z2 = false;
        }
        VideoFrame videoFrame2 = new VideoFrame(CameraSession.CC.createTextureBufferWithModifiedTransformMatrix(textureBufferImpl, z2, 0), getFrameOrientation(), videoFrame.timestampNs);
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }
}
