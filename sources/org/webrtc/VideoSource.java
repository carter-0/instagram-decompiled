package org.webrtc;

import X.Pxe;

public class VideoSource extends MediaSource {
    public final CapturerObserver capturerObserver = new CapturerObserver() {
        public void onCapturerStarted(boolean z) {
            VideoSource.this.nativeAndroidVideoTrackSource.setState(z);
            synchronized (VideoSource.this.videoProcessorLock) {
                VideoSource videoSource = VideoSource.this;
                videoSource.isCapturerRunning = z;
                VideoProcessor videoProcessor = videoSource.videoProcessor;
                if (videoProcessor != null) {
                    videoProcessor.onCapturerStarted(z);
                }
            }
        }

        public void onCapturerStopped() {
            VideoSource.this.nativeAndroidVideoTrackSource.setState(false);
            synchronized (VideoSource.this.videoProcessorLock) {
                VideoSource videoSource = VideoSource.this;
                videoSource.isCapturerRunning = false;
                VideoProcessor videoProcessor = videoSource.videoProcessor;
                if (videoProcessor != null) {
                    videoProcessor.onCapturerStopped();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            r3.this$0.nativeAndroidVideoTrackSource.onFrameCaptured(r1);
            r1.release();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r1 = org.webrtc.VideoProcessor.CC.applyFrameAdaptationParameters(r4, r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onFrameCaptured(org.webrtc.VideoFrame r4) {
            /*
                r3 = this;
                org.webrtc.VideoSource r0 = org.webrtc.VideoSource.this
                org.webrtc.NativeAndroidVideoTrackSource r0 = r0.nativeAndroidVideoTrackSource
                org.webrtc.VideoProcessor$FrameAdaptationParameters r2 = r0.adaptFrame(r4)
                org.webrtc.VideoSource r0 = org.webrtc.VideoSource.this
                java.lang.Object r1 = r0.videoProcessorLock
                monitor-enter(r1)
                org.webrtc.VideoSource r0 = org.webrtc.VideoSource.this     // Catch:{ all -> 0x002a }
                org.webrtc.VideoProcessor r0 = r0.videoProcessor     // Catch:{ all -> 0x002a }
                if (r0 == 0) goto L_0x0018
                r0.onFrameCaptured(r4, r2)     // Catch:{ all -> 0x002a }
                monitor-exit(r1)     // Catch:{ all -> 0x002a }
                return
            L_0x0018:
                monitor-exit(r1)     // Catch:{ all -> 0x002a }
                org.webrtc.VideoFrame r1 = org.webrtc.VideoProcessor.CC.applyFrameAdaptationParameters(r4, r2)
                if (r1 == 0) goto L_0x0029
                org.webrtc.VideoSource r0 = org.webrtc.VideoSource.this
                org.webrtc.NativeAndroidVideoTrackSource r0 = r0.nativeAndroidVideoTrackSource
                r0.onFrameCaptured(r1)
                r1.release()
            L_0x0029:
                return
            L_0x002a:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x002a }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.VideoSource.AnonymousClass1.onFrameCaptured(org.webrtc.VideoFrame):void");
        }
    };
    public boolean isCapturerRunning;
    public final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;
    public VideoProcessor videoProcessor;
    public final Object videoProcessorLock = Pxe.A0p();

    public void adaptOutputFormat(int i, int i2, int i3, int i4, int i5) {
        Integer valueOf = Integer.valueOf(i3 * i4);
        Integer valueOf2 = Integer.valueOf(i5);
        NativeAndroidVideoTrackSource.nativeAdaptOutputFormat(this.nativeAndroidVideoTrackSource.nativeAndroidVideoTrackSource, i, i2, Integer.valueOf(i * i2), i3, i4, valueOf, valueOf2);
    }

    public void dispose() {
        setVideoProcessor((VideoProcessor) null);
        super.dispose();
    }

    public class AspectRatio {
        public static final AspectRatio UNDEFINED = new AspectRatio(0, 0);
        public final int height;
        public final int width;

        public AspectRatio(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    public void setIsScreencast(boolean z) {
        this.nativeAndroidVideoTrackSource.setIsScreencast(z);
    }

    public void setVideoProcessor(VideoProcessor videoProcessor2) {
        synchronized (this.videoProcessorLock) {
            VideoProcessor videoProcessor3 = this.videoProcessor;
            if (videoProcessor3 != null) {
                videoProcessor3.setSink((VideoSink) null);
                if (this.isCapturerRunning) {
                    this.videoProcessor.onCapturerStopped();
                }
            }
            this.videoProcessor = videoProcessor2;
            if (videoProcessor2 != null) {
                NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource2 = this.nativeAndroidVideoTrackSource;
                nativeAndroidVideoTrackSource2.getClass();
                videoProcessor2.setSink(new VideoSource$$ExternalSyntheticLambda0(nativeAndroidVideoTrackSource2));
                if (this.isCapturerRunning) {
                    videoProcessor2.onCapturerStarted(true);
                }
            }
        }
    }

    public VideoSource(long j) {
        super(j);
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j);
    }

    public CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    public long getNativeVideoTrackSource() {
        return getNativeMediaSource();
    }

    public void adaptOutputFormat(int i, int i2, int i3) {
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        adaptOutputFormat(max, min, min, max, i3);
    }

    public void adaptOutputFormat(AspectRatio aspectRatio, Integer num, AspectRatio aspectRatio2, Integer num2, Integer num3) {
        this.nativeAndroidVideoTrackSource.adaptOutputFormat(aspectRatio, num, aspectRatio2, num2, num3);
    }
}
