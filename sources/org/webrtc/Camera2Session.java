package org.webrtc;

import X.002;
import X.0BU;
import X.AnonymousClass000;
import X.AnonymousClass0fG;
import X.AnonymousClass0fJ;
import X.AnonymousClass0fK;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13988Tno;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;

public class Camera2Session implements CameraSession {
    public static final String TAG = "Camera2Session";
    public static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, CameraCapturer.OPEN_CAMERA_TIMEOUT, 50);
    public static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, CameraCapturer.OPEN_CAMERA_TIMEOUT, 50);
    public final Context applicationContext;
    public final CameraSession.CreateSessionCallback callback;
    public CameraCharacteristics cameraCharacteristics;
    public CameraDevice cameraDevice;
    public final String cameraId;
    public final CameraManager cameraManager;
    public int cameraOrientation;
    public final Handler cameraThreadHandler;
    public CameraEnumerationAndroid.CaptureFormat captureFormat;
    public CameraCaptureSession captureSession;
    public final long constructionTimeNs;
    public final CameraSession.Events events;
    public boolean firstFrameReported;
    public int fpsUnitFactor;
    public final int framerate;
    public final int height;
    public boolean isCameraFrontFacing;
    public SessionState state = SessionState.RUNNING;
    public Surface surface;
    public final SurfaceTextureHelper surfaceTextureHelper;
    public final int width;

    public class CameraStateCallback extends CameraDevice.StateCallback {
        private String getErrorDescription(int i) {
            if (i == 1) {
                return "Camera device is in use already.";
            }
            if (i == 2) {
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            if (i == 3) {
                return "Camera device could not be opened due to a device policy.";
            }
            if (i == 4) {
                return AnonymousClass000.A00(2134);
            }
            if (i != 5) {
                return 002.A0O("Unknown camera error: ", i);
            }
            return "Camera service has encountered a fatal error.";
        }

        public CameraStateCallback() {
        }

        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            boolean z = Logging.loggingEnabled;
            Camera2Session camera2Session = Camera2Session.this;
            camera2Session.events.onCameraClosed(camera2Session);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
            if (r3.state == org.webrtc.Camera2Session.SessionState.STOPPED) goto L_0x0012;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onDisconnected(android.hardware.camera2.CameraDevice r5) {
            /*
                r4 = this;
                org.webrtc.Camera2Session r0 = org.webrtc.Camera2Session.this
                r0.checkIsOnCameraThread()
                org.webrtc.Camera2Session r3 = org.webrtc.Camera2Session.this
                android.hardware.camera2.CameraCaptureSession r0 = r3.captureSession
                if (r0 != 0) goto L_0x0012
                org.webrtc.Camera2Session$SessionState r1 = r3.state
                org.webrtc.Camera2Session$SessionState r0 = org.webrtc.Camera2Session.SessionState.STOPPED
                r2 = 1
                if (r1 != r0) goto L_0x0013
            L_0x0012:
                r2 = 0
            L_0x0013:
                org.webrtc.Camera2Session$SessionState r0 = org.webrtc.Camera2Session.SessionState.STOPPED
                r3.state = r0
                r3.stopInternal()
                org.webrtc.Camera2Session r1 = org.webrtc.Camera2Session.this
                if (r2 == 0) goto L_0x0028
                org.webrtc.CameraSession$CreateSessionCallback r2 = r1.callback
                org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.DISCONNECTED
                java.lang.String r0 = "Camera disconnected / evicted."
                r2.onFailure(r1, r0)
                return
            L_0x0028:
                org.webrtc.CameraSession$Events r0 = r1.events
                r0.onCameraDisconnected(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera2Session.CameraStateCallback.onDisconnected(android.hardware.camera2.CameraDevice):void");
        }

        public void onError(CameraDevice cameraDevice, int i) {
            AnonymousClass0fJ r0 = AnonymousClass0fJ.$redex_init_class;
            if (0BU.A04()) {
                0BU.A02(cameraDevice);
            }
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i));
        }

        public void onOpened(CameraDevice cameraDevice) {
            AnonymousClass0fJ r0 = AnonymousClass0fJ.$redex_init_class;
            if (0BU.A04()) {
                0BU.A03(cameraDevice);
            }
            Camera2Session.this.checkIsOnCameraThread();
            boolean z = Logging.loggingEnabled;
            Camera2Session camera2Session = Camera2Session.this;
            camera2Session.cameraDevice = cameraDevice;
            SurfaceTextureHelper surfaceTextureHelper = camera2Session.surfaceTextureHelper;
            CameraEnumerationAndroid.CaptureFormat captureFormat = camera2Session.captureFormat;
            surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
            Camera2Session camera2Session2 = Camera2Session.this;
            camera2Session2.surface = new Surface(camera2Session2.surfaceTextureHelper.surfaceTexture);
            try {
                cameraDevice.createCaptureSession(Arrays.asList(new Surface[]{Camera2Session.this.surface}), new CaptureSessionCallback(), Camera2Session.this.cameraThreadHandler);
            } catch (CameraAccessException e) {
                Camera2Session.this.reportError(AnonymousClass7TG.A0m(e, "Failed to create capture session. ", new StringBuilder()));
            }
        }
    }

    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        public CaptureSessionCallback() {
        }

        private void chooseFocusMode(CaptureRequest.Builder builder) {
            Camera2Session camera2Session = Camera2Session.this;
            String str = Camera2Session.TAG;
            int[] iArr = (int[]) camera2Session.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (iArr[i] == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    break;
                } else {
                    i++;
                }
            }
            boolean z = Logging.loggingEnabled;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
            r9.set(r0, 0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void chooseStabilizationMode(android.hardware.camera2.CaptureRequest.Builder r9) {
            /*
                r8 = this;
                org.webrtc.Camera2Session r1 = org.webrtc.Camera2Session.this
                java.lang.String r0 = org.webrtc.Camera2Session.TAG
                android.hardware.camera2.CameraCharacteristics r1 = r1.cameraCharacteristics
                android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION
                java.lang.Object r7 = r1.get(r0)
                int[] r7 = (int[]) r7
                r6 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
                r5 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                if (r7 == 0) goto L_0x0032
                int r2 = r7.length
                r1 = 0
            L_0x001c:
                if (r1 >= r2) goto L_0x0032
                r0 = r7[r1]
                if (r0 != r5) goto L_0x002f
                android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
                r9.set(r0, r3)
                android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            L_0x0029:
                r9.set(r0, r4)
            L_0x002c:
                boolean r0 = org.webrtc.Logging.loggingEnabled
                return
            L_0x002f:
                int r1 = r1 + 1
                goto L_0x001c
            L_0x0032:
                org.webrtc.Camera2Session r0 = org.webrtc.Camera2Session.this
                android.hardware.camera2.CameraCharacteristics r1 = r0.cameraCharacteristics
                android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
                java.lang.Object r2 = r1.get(r0)
                int[] r2 = (int[]) r2
                int r1 = r2.length
            L_0x003f:
                if (r6 >= r1) goto L_0x002c
                r0 = r2[r6]
                if (r0 != r5) goto L_0x004d
                android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
                r9.set(r0, r3)
                android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
                goto L_0x0029
            L_0x004d:
                int r6 = r6 + 1
                goto L_0x003f
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera2Session.CaptureSessionCallback.chooseStabilizationMode(android.hardware.camera2.CaptureRequest$Builder):void");
        }

        /* renamed from: lambda$onConfigured$0$org-webrtc-Camera2Session$CaptureSessionCallback  reason: not valid java name */
        public /* synthetic */ void m28lambda$onConfigured$0$orgwebrtcCamera2Session$CaptureSessionCallback(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session camera2Session = Camera2Session.this;
            if (camera2Session.state != SessionState.RUNNING) {
                boolean z = Logging.loggingEnabled;
                return;
            }
            if (!camera2Session.firstFrameReported) {
                camera2Session.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - camera2Session.constructionTimeNs));
            }
            Camera2Session camera2Session2 = Camera2Session.this;
            VideoFrame videoFrame2 = new VideoFrame(CameraSession.CC.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) videoFrame.buffer, camera2Session2.isCameraFrontFacing, -camera2Session2.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.timestampNs);
            Camera2Session camera2Session3 = Camera2Session.this;
            camera2Session3.events.onFrameCaptured(camera2Session3, videoFrame2);
            videoFrame2.release();
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            AnonymousClass0fG.A01(cameraCaptureSession);
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            boolean z = Logging.loggingEnabled;
            Camera2Session camera2Session = Camera2Session.this;
            camera2Session.captureSession = cameraCaptureSession;
            try {
                CaptureRequest.Builder createCaptureRequest = camera2Session.cameraDevice.createCaptureRequest(3);
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                Camera2Session camera2Session2 = Camera2Session.this;
                CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = camera2Session2.captureFormat.framerate;
                int i = framerateRange.min;
                int i2 = camera2Session2.fpsUnitFactor;
                createCaptureRequest.set(key, new Range(Integer.valueOf(i / i2), Integer.valueOf(framerateRange.max / i2)));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, C13988Tno.A0R());
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, AnonymousClass7TE.A0u());
                chooseStabilizationMode(createCaptureRequest);
                chooseFocusMode(createCaptureRequest);
                createCaptureRequest.addTarget(Camera2Session.this.surface);
                AnonymousClass0fG.A00(new CameraCaptureSession.CaptureCallback(), cameraCaptureSession, createCaptureRequest.build(), Camera2Session.this.cameraThreadHandler);
                Camera2Session.this.surfaceTextureHelper.startListening(new Camera2Session$CaptureSessionCallback$$ExternalSyntheticLambda0(this));
                Camera2Session camera2Session3 = Camera2Session.this;
                camera2Session3.callback.onDone(camera2Session3);
            } catch (CameraAccessException e) {
                Camera2Session.this.reportError(AnonymousClass7TG.A0m(e, "Failed to start capture request. ", new StringBuilder()));
            }
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, Context context, CameraManager cameraManager2, SurfaceTextureHelper surfaceTextureHelper2, String str, int i, int i2, int i3) {
        new Camera2Session(createSessionCallback, events2, context, cameraManager2, surfaceTextureHelper2, str, i, i2, i3);
    }

    /* access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = CameraSession.CC.getDeviceOrientation(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (this.cameraOrientation + deviceOrientation) % 360;
    }

    /* access modifiers changed from: private */
    public void stopInternal() {
        boolean z = Logging.loggingEnabled;
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            AnonymousClass0fG.A01(cameraCaptureSession);
            this.captureSession = null;
        }
        Surface surface2 = this.surface;
        if (surface2 != null) {
            surface2.release();
            this.surface = null;
        }
        CameraDevice cameraDevice2 = this.cameraDevice;
        if (cameraDevice2 != null) {
            AnonymousClass0fK.A00(cameraDevice2);
            this.cameraDevice = null;
        }
    }

    public void stop() {
        boolean z = Logging.loggingEnabled;
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, Context context, CameraManager cameraManager2, SurfaceTextureHelper surfaceTextureHelper2, String str, int i, int i2, int i3) {
        boolean z = Logging.loggingEnabled;
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events2;
        this.applicationContext = context;
        this.cameraManager = cameraManager2;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.cameraId = str;
        this.width = i;
        this.height = i2;
        this.framerate = i3;
        start();
    }

    /* access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != C13988Tno.A0h(this.cameraThreadHandler)) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor2 = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor2;
        List convertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor2);
        List supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        boolean z = Logging.loggingEnabled;
        if (convertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        this.captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private void openCamera() {
        checkIsOnCameraThread();
        boolean z = Logging.loggingEnabled;
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(), this.cameraThreadHandler);
        } catch (CameraAccessException e) {
            reportError(AnonymousClass7TG.A0m(e, "Failed to open camera: ", new StringBuilder()));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.state == org.webrtc.Camera2Session.SessionState.STOPPED) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void reportError(java.lang.String r4) {
        /*
            r3 = this;
            r3.checkIsOnCameraThread()
            boolean r0 = org.webrtc.Logging.loggingEnabled
            android.hardware.camera2.CameraCaptureSession r0 = r3.captureSession
            if (r0 != 0) goto L_0x0010
            org.webrtc.Camera2Session$SessionState r2 = r3.state
            org.webrtc.Camera2Session$SessionState r0 = org.webrtc.Camera2Session.SessionState.STOPPED
            r1 = 1
            if (r2 != r0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            org.webrtc.Camera2Session$SessionState r0 = org.webrtc.Camera2Session.SessionState.STOPPED
            r3.state = r0
            r3.stopInternal()
            if (r1 == 0) goto L_0x0022
            org.webrtc.CameraSession$CreateSessionCallback r1 = r3.callback
            org.webrtc.CameraSession$FailureType r0 = org.webrtc.CameraSession.FailureType.ERROR
            r1.onFailure(r0, r4)
            return
        L_0x0022:
            org.webrtc.CameraSession$Events r0 = r3.events
            r0.onCameraError(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera2Session.reportError(java.lang.String):void");
    }

    private void start() {
        checkIsOnCameraThread();
        boolean z = Logging.loggingEnabled;
        try {
            CameraCharacteristics cameraCharacteristics2 = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics2;
            this.cameraOrientation = AnonymousClass7TE.A0M(cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION));
            this.isCameraFrontFacing = AnonymousClass7TF.A1Q(AnonymousClass7TE.A0M(this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)));
            findCaptureFormat();
            openCamera();
        } catch (CameraAccessException e) {
            reportError(AnonymousClass7TF.A0m("getCameraCharacteristics(): ", e));
        }
    }

    public class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        public /* synthetic */ CameraCaptureCallback(AnonymousClass1 r1) {
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            boolean z = Logging.loggingEnabled;
        }

        public CameraCaptureCallback() {
        }
    }
}
