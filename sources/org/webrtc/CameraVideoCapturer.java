package org.webrtc;

import X.C13988Tno;
import android.media.MediaRecorder;

public interface CameraVideoCapturer extends VideoCapturer {

    /* renamed from: org.webrtc.CameraVideoCapturer$-CC  reason: invalid class name */
    public abstract /* synthetic */ class CC {
        @Deprecated
        public static void $default$addMediaRecorderToCamera(CameraVideoCapturer cameraVideoCapturer, MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler) {
            throw new UnsupportedOperationException("Deprecated and not implemented.");
        }

        @Deprecated
        public static void $default$removeMediaRecorderFromCamera(CameraVideoCapturer cameraVideoCapturer, MediaRecorderHandler mediaRecorderHandler) {
            throw new UnsupportedOperationException("Deprecated and not implemented.");
        }
    }

    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    public class CameraStatistics {
        public static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 4000;
        public static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        public static final String TAG = "CameraStatistics";
        public final Runnable cameraObserver;
        public final CameraEventsHandler eventsHandler;
        public int frameCount;
        public int freezePeriodCount;
        public final SurfaceTextureHelper surfaceTextureHelper;

        public static /* synthetic */ int access$104(CameraStatistics cameraStatistics) {
            int i = cameraStatistics.freezePeriodCount + 1;
            cameraStatistics.freezePeriodCount = i;
            return i;
        }

        public void release() {
            this.surfaceTextureHelper.handler.removeCallbacks(this.cameraObserver);
        }

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper2, CameraEventsHandler cameraEventsHandler) {
            AnonymousClass1 r3 = new Runnable() {
                public void run() {
                    String str;
                    CameraStatistics cameraStatistics = CameraStatistics.this;
                    int i = cameraStatistics.frameCount;
                    boolean z = Logging.loggingEnabled;
                    if (i == 0) {
                        CameraStatistics.access$104(cameraStatistics);
                        if (cameraStatistics.freezePeriodCount * CameraStatistics.CAMERA_OBSERVER_PERIOD_MS >= 4000 && cameraStatistics.eventsHandler != null) {
                            boolean z2 = cameraStatistics.surfaceTextureHelper.isTextureInUse;
                            CameraEventsHandler cameraEventsHandler = CameraStatistics.this.eventsHandler;
                            if (z2) {
                                str = "Camera failure. Client must return video buffers.";
                            } else {
                                str = "Camera failure.";
                            }
                            cameraEventsHandler.onCameraFreezed(str);
                            return;
                        }
                    } else {
                        cameraStatistics.freezePeriodCount = 0;
                    }
                    cameraStatistics.frameCount = 0;
                    cameraStatistics.surfaceTextureHelper.handler.postDelayed(this, 2000);
                }
            };
            this.cameraObserver = r3;
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                surfaceTextureHelper2.handler.postDelayed(r3, 2000);
                return;
            }
            throw new IllegalArgumentException("SurfaceTextureHelper is null");
        }

        private void checkThread() {
            if (Thread.currentThread() != C13988Tno.A0h(this.surfaceTextureHelper.handler)) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }
    }

    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    @Deprecated
    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    @Deprecated
    void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler);

    @Deprecated
    void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler, String str);
}
