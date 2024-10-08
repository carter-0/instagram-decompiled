package org.webrtc;

import X.002;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.Pxe;
import X.Pxg;
import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import java.util.Arrays;
import java.util.List;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

public abstract class CameraCapturer implements CameraVideoCapturer {
    public static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    public static final int OPEN_CAMERA_DELAY_MS = 500;
    public static final int OPEN_CAMERA_TIMEOUT = 10000;
    public static final String TAG = "CameraCapturer";
    public Context applicationContext;
    public final CameraEnumerator cameraEnumerator;
    public String cameraName;
    public final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() {
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                CameraSession cameraSession2 = cameraCapturer.currentSession;
                if (cameraSession == cameraSession2 || cameraSession2 == null) {
                    cameraCapturer.eventsHandler.onCameraClosed();
                } else {
                    boolean z = Logging.loggingEnabled;
                }
            }
        }

        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraSession != cameraCapturer.currentSession) {
                    boolean z = Logging.loggingEnabled;
                } else {
                    cameraCapturer.eventsHandler.onCameraDisconnected();
                    CameraCapturer.this.stopCapture();
                }
            }
        }

        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraSession != cameraCapturer.currentSession) {
                    boolean z = Logging.loggingEnabled;
                } else {
                    cameraCapturer.eventsHandler.onCameraError(str);
                    CameraCapturer.this.stopCapture();
                }
            }
        }

        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraCapturer.currentSession != null) {
                    boolean z = Logging.loggingEnabled;
                } else {
                    cameraCapturer.eventsHandler.onCameraOpening(cameraCapturer.cameraName);
                }
            }
        }

        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (cameraSession != cameraCapturer.currentSession) {
                    boolean z = Logging.loggingEnabled;
                } else {
                    if (!cameraCapturer.firstFrameObserved) {
                        cameraCapturer.eventsHandler.onFirstFrameAvailable();
                        cameraCapturer = CameraCapturer.this;
                        cameraCapturer.firstFrameObserved = true;
                    }
                    cameraCapturer.cameraStatistics.addFrame();
                    CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                }
            }
        }
    };
    public CameraVideoCapturer.CameraStatistics cameraStatistics;
    public Handler cameraThreadHandler;
    public CapturerObserver capturerObserver;
    public final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() {
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            boolean z = Logging.loggingEnabled;
            CameraCapturer cameraCapturer = CameraCapturer.this;
            cameraCapturer.uiThreadHandler.removeCallbacks(cameraCapturer.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                CameraCapturer cameraCapturer2 = CameraCapturer.this;
                cameraCapturer2.sessionOpening = false;
                cameraCapturer2.currentSession = cameraSession;
                cameraCapturer2.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer2.surfaceHelper, cameraCapturer2.eventsHandler);
                CameraCapturer cameraCapturer3 = CameraCapturer.this;
                cameraCapturer3.firstFrameObserved = false;
                cameraCapturer3.stateLock.notifyAll();
                CameraCapturer cameraCapturer4 = CameraCapturer.this;
                SwitchState switchState = cameraCapturer4.switchState;
                if (switchState == SwitchState.IN_PROGRESS) {
                    cameraCapturer4.switchState = SwitchState.IDLE;
                    CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler = cameraCapturer4.switchEventsHandler;
                    if (cameraSwitchHandler != null) {
                        cameraSwitchHandler.onCameraSwitchDone(cameraCapturer4.cameraEnumerator.isFrontFacing(cameraCapturer4.cameraName));
                        CameraCapturer.this.switchEventsHandler = null;
                    }
                } else if (switchState == SwitchState.PENDING) {
                    String str = cameraCapturer4.pendingCameraName;
                    cameraCapturer4.pendingCameraName = null;
                    cameraCapturer4.switchState = SwitchState.IDLE;
                    cameraCapturer4.m31lambda$switchCamera$3$orgwebrtcCameraCapturer(cameraCapturer4.switchEventsHandler, str);
                }
            }
        }

        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer cameraCapturer = CameraCapturer.this;
            cameraCapturer.uiThreadHandler.removeCallbacks(cameraCapturer.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                CameraCapturer cameraCapturer2 = CameraCapturer.this;
                CameraCapturer.access$1710(cameraCapturer2);
                if (cameraCapturer2.openAttemptsRemaining <= 0) {
                    boolean z = Logging.loggingEnabled;
                    cameraCapturer2.sessionOpening = false;
                    cameraCapturer2.stateLock.notifyAll();
                    CameraCapturer cameraCapturer3 = CameraCapturer.this;
                    SwitchState switchState = cameraCapturer3.switchState;
                    SwitchState switchState2 = SwitchState.IDLE;
                    if (switchState != switchState2) {
                        CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler = cameraCapturer3.switchEventsHandler;
                        if (cameraSwitchHandler != null) {
                            cameraSwitchHandler.onCameraSwitchError(str);
                            cameraCapturer3 = CameraCapturer.this;
                            cameraCapturer3.switchEventsHandler = null;
                        }
                        cameraCapturer3.switchState = switchState2;
                    }
                    if (failureType == CameraSession.FailureType.DISCONNECTED) {
                        cameraCapturer3.eventsHandler.onCameraDisconnected();
                    } else {
                        cameraCapturer3.eventsHandler.onCameraError(str);
                    }
                } else {
                    boolean z2 = Logging.loggingEnabled;
                    cameraCapturer2.createSessionInternal(CameraCapturer.OPEN_CAMERA_DELAY_MS);
                }
            }
        }
    };
    public CameraSession currentSession;
    public final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    public boolean firstFrameObserved;
    public int framerate;
    public int height;
    public int openAttemptsRemaining;
    public final Runnable openCameraTimeoutRunnable = new Runnable() {
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    public String pendingCameraName;
    public boolean sessionOpening;
    public final Object stateLock = new Object();
    public SurfaceTextureHelper surfaceHelper;
    public CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    public SwitchState switchState = SwitchState.IDLE;
    public final Handler uiThreadHandler;
    public int width;

    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        CameraVideoCapturer.CC.$default$addMediaRecorderToCamera(this, mediaRecorder, mediaRecorderHandler);
        throw AnonymousClass00P.createAndThrow();
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback2, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    public boolean isScreencast() {
        return false;
    }

    /* renamed from: lambda$createSessionInternal$0$org-webrtc-CameraCapturer  reason: not valid java name */
    public /* synthetic */ void m29lambda$createSessionInternal$0$orgwebrtcCameraCapturer() {
        createCameraSession(this.createSessionCallback, this.cameraSessionEventsHandler, this.applicationContext, this.surfaceHelper, this.cameraName, this.width, this.height, this.framerate);
    }

    public /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        CameraVideoCapturer.CC.$default$removeMediaRecorderFromCamera(this, mediaRecorderHandler);
        throw AnonymousClass00P.createAndThrow();
    }

    public static /* synthetic */ int access$1710(CameraCapturer cameraCapturer) {
        int i = cameraCapturer.openAttemptsRemaining;
        cameraCapturer.openAttemptsRemaining = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    public void createSessionInternal(int i) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, (long) (i + OPEN_CAMERA_TIMEOUT));
        this.cameraThreadHandler.postDelayed(new CameraCapturer$$ExternalSyntheticLambda2(this), (long) i);
    }

    public static void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        boolean z = Logging.loggingEnabled;
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: switchCameraInternal */
    public void m31lambda$switchCamera$3$orgwebrtcCameraCapturer(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        boolean z = Logging.loggingEnabled;
        if (!Arrays.asList(this.cameraEnumerator.getDeviceNames()).contains(str)) {
            reportCameraSwitchError(002.A0R("Attempted to switch to unknown camera device ", str), cameraSwitchHandler);
            return;
        }
        synchronized (this.stateLock) {
            if (this.switchState != SwitchState.IDLE) {
                reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
            } else {
                boolean z2 = this.sessionOpening;
                if (z2 || this.currentSession != null) {
                    this.switchEventsHandler = cameraSwitchHandler;
                    if (z2) {
                        this.switchState = SwitchState.PENDING;
                        this.pendingCameraName = str;
                    } else {
                        this.switchState = SwitchState.IN_PROGRESS;
                        this.cameraStatistics.release();
                        this.cameraStatistics = null;
                        this.cameraThreadHandler.post(new CameraCapturer$$ExternalSyntheticLambda0(this.currentSession));
                        this.currentSession = null;
                        this.cameraName = str;
                        this.sessionOpening = true;
                        this.openAttemptsRemaining = 1;
                        createSessionInternal(0);
                    }
                } else {
                    reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                }
            }
        }
    }

    public void changeCaptureFormat(int i, int i2, int i3) {
        boolean z = Logging.loggingEnabled;
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    public void dispose() {
        boolean z = Logging.loggingEnabled;
        stopCapture();
    }

    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver2) {
        this.applicationContext = context;
        this.capturerObserver = capturerObserver2;
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper.handler;
    }

    /* renamed from: lambda$switchCamera$2$org-webrtc-CameraCapturer  reason: not valid java name */
    public /* synthetic */ void m30lambda$switchCamera$2$orgwebrtcCameraCapturer(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        List asList = Arrays.asList(this.cameraEnumerator.getDeviceNames());
        if (asList.size() < 2) {
            reportCameraSwitchError("No camera to switch to.", cameraSwitchHandler);
        } else {
            m31lambda$switchCamera$3$orgwebrtcCameraCapturer(cameraSwitchHandler, AnonymousClass7TE.A19(asList, (asList.indexOf(this.cameraName) + 1) % asList.size()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r3 = r0.getStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void printStackTrace() {
        /*
            r4 = this;
            android.os.Handler r0 = r4.cameraThreadHandler
            if (r0 == 0) goto L_0x001e
            java.lang.Thread r0 = X.C13988Tno.A0h(r0)
            if (r0 == 0) goto L_0x001e
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x001e
            boolean r0 = org.webrtc.Logging.loggingEnabled
            r1 = 0
        L_0x0014:
            r0 = r3[r1]
            r0.toString()
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x001e
            goto L_0x0014
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.CameraCapturer.printStackTrace():void");
    }

    public void startCapture(int i, int i2, int i3) {
        boolean z = Logging.loggingEnabled;
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                if (!this.sessionOpening && this.currentSession == null) {
                    this.width = i;
                    this.height = i2;
                    this.framerate = i3;
                    this.sessionOpening = true;
                    this.openAttemptsRemaining = 3;
                    createSessionInternal(0);
                }
            }
            return;
        }
        throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
    }

    public void stopCapture() {
        boolean z = Logging.loggingEnabled;
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    Pxe.A1F();
                }
            }
            if (this.currentSession != null) {
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                this.cameraThreadHandler.post(new CameraCapturer$$ExternalSyntheticLambda1(this.currentSession));
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            }
        }
    }

    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        boolean z = Logging.loggingEnabled;
        this.cameraThreadHandler.post(new CameraCapturer$$ExternalSyntheticLambda4(this, cameraSwitchHandler));
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator2) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() {
            public void onCameraClosed() {
            }

            public void onCameraDisconnected() {
            }

            public void onCameraError(String str) {
            }

            public void onCameraFreezed(String str) {
            }

            public void onCameraOpening(String str) {
            }

            public void onFirstFrameAvailable() {
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator2;
        this.cameraName = str;
        List asList = Arrays.asList(cameraEnumerator2.getDeviceNames());
        this.uiThreadHandler = AnonymousClass7TF.A0D();
        if (asList.isEmpty()) {
            throw new RuntimeException("No cameras attached.");
        } else if (!asList.contains(this.cameraName)) {
            throw Pxg.A0c("Camera name ", this.cameraName, " does not match any known camera device.");
        }
    }

    /* access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != C13988Tno.A0h(this.cameraThreadHandler)) {
            boolean z = Logging.loggingEnabled;
            throw new RuntimeException("Not on camera thread.");
        }
    }

    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        boolean z = Logging.loggingEnabled;
        this.cameraThreadHandler.post(new CameraCapturer$$ExternalSyntheticLambda3(this, cameraSwitchHandler, str));
    }
}
