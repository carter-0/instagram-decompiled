package org.webrtc;

import X.AnonymousClass7TE;
import X.DbW;
import X.Pxe;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.LigerSamplePolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

public class HardwareVideoEncoder implements VideoEncoder {
    public static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    public static final String KEY_BITRATE_MODE = "bitrate-mode";
    public static final int MAX_ENCODER_Q_SIZE = 2;
    public static final int MAX_VIDEO_FRAMERATE = 30;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final int REQUIRED_RESOLUTION_ALIGNMENT = 16;
    public static final String TAG = "HardwareVideoEncoder";
    public static final int VIDEO_AVC_LEVEL_3 = 256;
    public static final int VIDEO_AVC_LEVEL_41 = 4096;
    public static final int VIDEO_AVC_PROFILE_HIGH = 8;
    public static final int VIDEO_ControlRateConstant = 2;
    public int adjustedBitrate;
    public boolean automaticResizeOn;
    public final BitrateAdjuster bitrateAdjuster;
    public VideoEncoder.Callback callback;
    public MediaCodecWrapper codec;
    public final String codecName;
    public final VideoCodecMimeType codecType;
    public ByteBuffer configBuffer;
    public boolean eglMakeCurrentOnEncodeEnabled;
    public final ThreadUtils.ThreadChecker encodeThreadChecker;
    public final long forcedKeyFrameNs;
    public int height;
    public final int keyFrameIntervalSec;
    public long lastKeyFrameNs;
    public final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    public ByteBuffer[] outputBuffers;
    public final BusyCount outputBuffersBusyCount;
    public final BlockingDeque outputBuilders = new LinkedBlockingDeque();
    public Thread outputThread;
    public final ThreadUtils.ThreadChecker outputThreadChecker;
    public final Map params;
    public boolean rescalingEnabled;
    public volatile boolean running;
    public final EglBase14.Context sharedContext;
    public volatile Exception shutdownException;
    public final Integer surfaceColorFormat;
    public final GlRectDrawer textureDrawer = new GlRectDrawer();
    public EglBase14 textureEglBase;
    public Surface textureInputSurface;
    public boolean useSurfaceMode;
    public final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    public int width;
    public final Integer yuvColorFormat;
    public final YuvFormat yuvFormat;

    public class BusyCount {
        public int count;
        public final Object countLock;

        public void decrement() {
            synchronized (this.countLock) {
                int i = this.count - 1;
                this.count = i;
                if (i == 0) {
                    this.countLock.notifyAll();
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z;
            synchronized (this.countLock) {
                z = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e) {
                        Logging.e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e);
                        z = true;
                    }
                }
            }
            if (z) {
                Pxe.A1F();
            }
        }

        public BusyCount() {
            this.countLock = new Object();
        }
    }

    public enum YuvFormat {
        I420 {
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 {
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

        public static YuvFormat valueOf(int i) {
            if (i == 19) {
                return I420;
            }
            if (i == 21 || i == 2141391872 || i == 2141391876) {
                return NV12;
            }
            throw DbW.A0a("Unsupported colorFormat: ", i);
        }
    }

    public /* synthetic */ VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return new VideoEncoder.ResolutionBitrateLimits[0];
    }

    private boolean canUseSurface() {
        if (this.sharedContext == null || this.surfaceColorFormat == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        if (r0 == false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.webrtc.VideoCodecStatus initEncodeInternal() {
        /*
            r10 = this;
            java.lang.String r7 = "roi-enablement"
            java.lang.String r2 = "HardwareVideoEncoder"
            org.webrtc.ThreadUtils$ThreadChecker r0 = r10.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = -1
            r10.lastKeyFrameNs = r0
            org.webrtc.MediaCodecWrapperFactory r1 = r10.mediaCodecWrapperFactory     // Catch:{ Exception -> 0x014e }
            java.lang.String r0 = r10.codecName     // Catch:{ Exception -> 0x014e }
            org.webrtc.MediaCodecWrapper r0 = r1.createByCodecName(r0)     // Catch:{ Exception -> 0x014e }
            r10.codec = r0     // Catch:{ Exception -> 0x014e }
            boolean r0 = r10.useSurfaceMode
            if (r0 == 0) goto L_0x0022
            java.lang.Integer r0 = r10.surfaceColorFormat
        L_0x001d:
            int r5 = r0.intValue()
            goto L_0x0025
        L_0x0022:
            java.lang.Integer r0 = r10.yuvColorFormat
            goto L_0x001d
        L_0x0025:
            org.webrtc.VideoCodecMimeType r0 = r10.codecType     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r3 = r0.mimeType()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            int r1 = r10.width     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            int r0 = r10.height     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            android.media.MediaFormat r4 = android.media.MediaFormat.createVideoFormat(r3, r1, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r1 = "bitrate"
            int r0 = r10.adjustedBitrate     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r4.setInteger(r1, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r0 = "bitrate-mode"
            r9 = 2
            r4.setInteger(r0, r9)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r0 = "color-format"
            r4.setInteger(r0, r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            org.webrtc.BitrateAdjuster r0 = r10.bitrateAdjuster     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            double r0 = r0.getCodecConfigFramerate()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.util.Map r5 = r10.params     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r3 = "init-frame-rate"
            java.lang.String r3 = X.DbT.A11(r3, r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            if (r3 == 0) goto L_0x005c
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            if (r3 <= 0) goto L_0x005c
            double r0 = (double) r3     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
        L_0x005c:
            java.lang.String r5 = "frame-rate"
            float r3 = (float) r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r4.setFloat(r5, r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r1 = "i-frame-interval"
            int r0 = r10.keyFrameIntervalSec     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r4.setInteger(r1, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            org.webrtc.VideoCodecMimeType r1 = r10.codecType     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H264     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r8 = 0
            r3 = 1
            if (r1 != r0) goto L_0x00c7
            java.util.Map r1 = r10.params     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r0 = "profile-level-id"
            java.lang.String r6 = X.DbT.A11(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r5 = "42e01f"
            if (r6 != 0) goto L_0x007e
            r6 = r5
        L_0x007e:
            int r1 = r6.hashCode()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r0 = 1537948542(0x5bab3b7e, float:9.6395267E16)
            if (r1 == r0) goto L_0x00a1
            r0 = 1595523960(0x5f19c378, float:1.1079831E19)
            if (r1 == r0) goto L_0x0099
            r0 = 1595523974(0x5f19c386, float:1.1079847E19)
            if (r1 != r0) goto L_0x00a8
            java.lang.String r0 = "640c1f"
            boolean r0 = r6.equals(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r6 = 0
            goto L_0x00a6
        L_0x0099:
            java.lang.String r0 = "640c29"
            boolean r0 = r6.equals(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r6 = 1
            goto L_0x00a6
        L_0x00a1:
            boolean r0 = r6.equals(r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r6 = 2
        L_0x00a6:
            if (r0 != 0) goto L_0x00a9
        L_0x00a8:
            r6 = -1
        L_0x00a9:
            java.lang.String r5 = "level"
            r1 = 8
            java.lang.String r0 = "profile"
            if (r6 == 0) goto L_0x00bc
            if (r6 == r3) goto L_0x00b6
            if (r6 == r9) goto L_0x00c7
            goto L_0x00c5
        L_0x00b6:
            r4.setInteger(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x00c1
        L_0x00bc:
            r4.setInteger(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r0 = 256(0x100, float:3.59E-43)
        L_0x00c1:
            r4.setInteger(r5, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            goto L_0x00c7
        L_0x00c5:
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
        L_0x00c7:
            java.util.Map r0 = r10.params     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r6 = X.DbT.A11(r7, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r5 = "1"
            if (r6 == 0) goto L_0x00f2
            int r1 = r6.hashCode()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r0 = 48
            if (r1 == r0) goto L_0x00e7
            r0 = 49
            if (r1 != r0) goto L_0x0127
            boolean r0 = r6.equals(r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            if (r0 == 0) goto L_0x0127
            r4.setInteger(r7, r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            goto L_0x00f2
        L_0x00e7:
            java.lang.String r0 = "0"
            boolean r0 = r6.equals(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            if (r0 == 0) goto L_0x0127
            r4.setInteger(r7, r8)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
        L_0x00f2:
            java.util.Map r1 = r10.params     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r0 = "encoder-rescaling-enabled"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            boolean r0 = r5.equals(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r10.rescalingEnabled = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.util.Map r1 = r10.params     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.lang.String r0 = "encoder-egl-make-current-on-encode-enabled"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            boolean r0 = r5.equals(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r10.eglMakeCurrentOnEncodeEnabled = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            org.webrtc.MediaCodecWrapper r0 = r10.codec     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r1 = 0
            r0.configure(r4, r1, r1, r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r10.configureMediaCodecInput()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            org.webrtc.MediaCodecWrapper r0 = r10.codec     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r0.start()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            org.webrtc.MediaCodecWrapper r0 = r10.codec     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            r10.outputBuffers = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            goto L_0x012a
        L_0x0127:
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0142 }
            goto L_0x00f2
        L_0x012a:
            r10.maybeCloseOutputThread()
            org.webrtc.ThreadUtils$ThreadChecker r0 = r10.outputThreadChecker
            r0.thread = r1
            r10.running = r3
            java.lang.String r1 = "hwVidEncOut"
            org.webrtc.HardwareVideoEncoder$1 r0 = new org.webrtc.HardwareVideoEncoder$1
            r0.<init>(r1)
            r10.outputThread = r0
            r0.start()
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
        L_0x0142:
            r1 = move-exception
            java.lang.String r0 = "initEncodeInternal failed"
            org.webrtc.Logging.e(r2, r0, r1)
            r10.release()
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r0
        L_0x014e:
            r0 = move-exception
            r0.getMessage()
            boolean r0 = org.webrtc.Logging.loggingEnabled
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.initEncodeInternal():org.webrtc.VideoCodecStatus");
    }

    private VideoCodecStatus maybeCloseOutputThread() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread != null) {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT)) {
                boolean z = Logging.loggingEnabled;
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            }
            this.outputThread = null;
            return videoCodecStatus;
        }
        videoCodecStatus = VideoCodecStatus.OK;
        this.outputThread = null;
        return videoCodecStatus;
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    public void configureMediaCodecInput() {
        if (this.useSurfaceMode) {
            this.textureEglBase = EglBase.CC.createEgl14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
            Surface createInputSurface = this.codec.createInputSurface();
            this.textureInputSurface = createInputSurface;
            this.textureEglBase.createSurface(createInputSurface);
            if (!this.eglMakeCurrentOnEncodeEnabled) {
                this.textureEglBase.makeCurrent();
            }
        }
    }

    public /* synthetic */ long createNative(long j) {
        return 0;
    }

    public Thread createOutputThread() {
        return new Thread("hwVidEncOut") {
            public void run() {
                while (true) {
                    boolean z = HardwareVideoEncoder.this.running;
                    HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                    if (z) {
                        hardwareVideoEncoder.deliverEncodedImage();
                    } else {
                        hardwareVideoEncoder.releaseCodecOnOutputThread();
                        return;
                    }
                }
            }
        };
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090 A[Catch:{ IllegalStateException -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b A[Catch:{ IllegalStateException -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f A[Catch:{ IllegalStateException -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deliverEncodedImage() {
        /*
            r8 = this;
            java.lang.String r3 = "HardwareVideoEncoder"
            org.webrtc.ThreadUtils$ThreadChecker r0 = r8.outputThreadChecker
            r0.checkIsOnValidThread()
            android.media.MediaCodec$BufferInfo r5 = new android.media.MediaCodec$BufferInfo     // Catch:{ IllegalStateException -> 0x00a2 }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x00a2 }
            org.webrtc.MediaCodecWrapper r2 = r8.codec     // Catch:{ IllegalStateException -> 0x00a2 }
            r0 = 100000(0x186a0, double:4.94066E-319)
            int r4 = r2.dequeueOutputBuffer(r5, r0)     // Catch:{ IllegalStateException -> 0x00a2 }
            if (r4 >= 0) goto L_0x0028
            r0 = -3
            if (r4 != r0) goto L_0x00a8
            org.webrtc.HardwareVideoEncoder$BusyCount r0 = r8.outputBuffersBusyCount     // Catch:{ IllegalStateException -> 0x00a2 }
            r0.waitForZero()     // Catch:{ IllegalStateException -> 0x00a2 }
            org.webrtc.MediaCodecWrapper r0 = r8.codec     // Catch:{ IllegalStateException -> 0x00a2 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ IllegalStateException -> 0x00a2 }
            r8.outputBuffers = r0     // Catch:{ IllegalStateException -> 0x00a2 }
            return
        L_0x0028:
            java.nio.ByteBuffer[] r0 = r8.outputBuffers     // Catch:{ IllegalStateException -> 0x00a2 }
            r6 = r0[r4]     // Catch:{ IllegalStateException -> 0x00a2 }
            X.Pxg.A1D(r5, r6)     // Catch:{ IllegalStateException -> 0x00a2 }
            int r0 = r5.flags     // Catch:{ IllegalStateException -> 0x00a2 }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0043
            int r1 = r5.size     // Catch:{ IllegalStateException -> 0x00a2 }
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch:{ IllegalStateException -> 0x00a2 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ IllegalStateException -> 0x00a2 }
            r8.configBuffer = r0     // Catch:{ IllegalStateException -> 0x00a2 }
            r0.put(r6)     // Catch:{ IllegalStateException -> 0x00a2 }
            return
        L_0x0043:
            org.webrtc.BitrateAdjuster r1 = r8.bitrateAdjuster     // Catch:{ IllegalStateException -> 0x00a2 }
            int r0 = r5.size     // Catch:{ IllegalStateException -> 0x00a2 }
            r1.reportEncodedFrame(r0)     // Catch:{ IllegalStateException -> 0x00a2 }
            int r1 = r8.adjustedBitrate     // Catch:{ IllegalStateException -> 0x00a2 }
            org.webrtc.BitrateAdjuster r0 = r8.bitrateAdjuster     // Catch:{ IllegalStateException -> 0x00a2 }
            int r0 = r0.getAdjustedBitrateBps()     // Catch:{ IllegalStateException -> 0x00a2 }
            if (r1 == r0) goto L_0x0057
            r8.updateBitrate()     // Catch:{ IllegalStateException -> 0x00a2 }
        L_0x0057:
            int r0 = r5.flags     // Catch:{ IllegalStateException -> 0x00a2 }
            r7 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0094
            r8.hashCode()     // Catch:{ IllegalStateException -> 0x00a2 }
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch:{ IllegalStateException -> 0x00a2 }
            org.webrtc.VideoCodecMimeType r1 = r8.codecType     // Catch:{ IllegalStateException -> 0x00a2 }
            org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H264     // Catch:{ IllegalStateException -> 0x00a2 }
            if (r1 == r0) goto L_0x006d
            org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H265     // Catch:{ IllegalStateException -> 0x00a2 }
            if (r1 != r0) goto L_0x0095
        L_0x006d:
            int r1 = r5.size     // Catch:{ IllegalStateException -> 0x00a2 }
            java.nio.ByteBuffer r0 = r8.configBuffer     // Catch:{ IllegalStateException -> 0x00a2 }
            int r0 = r0.capacity()     // Catch:{ IllegalStateException -> 0x00a2 }
            int r1 = r1 + r0
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ IllegalStateException -> 0x00a2 }
            java.nio.ByteBuffer r0 = r8.configBuffer     // Catch:{ IllegalStateException -> 0x00a2 }
            r0.rewind()     // Catch:{ IllegalStateException -> 0x00a2 }
            java.nio.ByteBuffer r0 = r8.configBuffer     // Catch:{ IllegalStateException -> 0x00a2 }
            r2.put(r0)     // Catch:{ IllegalStateException -> 0x00a2 }
            r2.put(r6)     // Catch:{ IllegalStateException -> 0x00a2 }
            r2.rewind()     // Catch:{ IllegalStateException -> 0x00a2 }
        L_0x008a:
            org.webrtc.EncodedImage$FrameType r1 = org.webrtc.EncodedImage.FrameType.VideoFrameKey     // Catch:{ IllegalStateException -> 0x00a2 }
        L_0x008c:
            boolean r0 = r8.running     // Catch:{ IllegalStateException -> 0x00a2 }
            if (r0 == 0) goto L_0x009f
            r8.sendEncodedFrame(r1, r2, r4, r5)     // Catch:{ IllegalStateException -> 0x00a2 }
            goto L_0x009e
        L_0x0094:
            r7 = 0
        L_0x0095:
            java.nio.ByteBuffer r2 = r6.slice()     // Catch:{ IllegalStateException -> 0x00a2 }
            if (r7 != 0) goto L_0x008a
            org.webrtc.EncodedImage$FrameType r1 = org.webrtc.EncodedImage.FrameType.VideoFrameDelta     // Catch:{ IllegalStateException -> 0x00a2 }
            goto L_0x008c
        L_0x009e:
            return
        L_0x009f:
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch:{ IllegalStateException -> 0x00a2 }
            return
        L_0x00a2:
            r1 = move-exception
            java.lang.String r0 = "deliverOutput failed"
            org.webrtc.Logging.e(r3, r0, r1)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.deliverEncodedImage():void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [org.webrtc.EncodedImage$Builder, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0075, code lost:
        if (r3 == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        if (r3 == false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame r15, org.webrtc.VideoEncoder.EncodeInfo r16) {
        /*
            r14 = this;
            org.webrtc.ThreadUtils$ThreadChecker r0 = r14.encodeThreadChecker
            r0.checkIsOnValidThread()
            org.webrtc.MediaCodecWrapper r0 = r14.codec
            if (r0 != 0) goto L_0x000c
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.UNINITIALIZED
        L_0x000b:
            return r1
        L_0x000c:
            org.webrtc.VideoFrame$Buffer r7 = r15.buffer
            boolean r3 = r7 instanceof org.webrtc.VideoFrame.TextureBuffer
            boolean r0 = r14.rescalingEnabled
            r2 = 2
            r4 = 0
            if (r0 == 0) goto L_0x0089
            int r1 = r7.getWidth()
            int r0 = r14.width
            if (r1 != r0) goto L_0x0026
            int r1 = r7.getHeight()
            int r0 = r14.height
            if (r1 == r0) goto L_0x006e
        L_0x0026:
            int r5 = r7.getWidth()
            int r1 = r14.width
            int r0 = r7.getHeight()
            int r1 = r1 * r0
            int r0 = r14.height
            int r1 = r1 / r0
            int r10 = java.lang.Math.min(r5, r1)
            int r5 = r7.getHeight()
            int r1 = r14.height
            int r0 = r7.getWidth()
            int r1 = r1 * r0
            int r0 = r14.width
            int r1 = r1 / r0
            int r11 = java.lang.Math.min(r5, r1)
            int r0 = r7.getWidth()
            int r0 = r0 - r10
            int r8 = r0 / 2
            int r0 = r7.getHeight()
            int r0 = r0 - r11
            int r9 = r0 / 2
            int r12 = r14.width
            int r13 = r14.height
            org.webrtc.VideoFrame$Buffer r6 = r7.cropAndScale(r8, r9, r10, r11, r12, r13)
            int r5 = r15.rotation
            long r0 = r15.timestampNs
            org.webrtc.VideoFrame r15 = new org.webrtc.VideoFrame
            r15.<init>(r6, r5, r0)
            r7.release()
            org.webrtc.VideoFrame$Buffer r7 = r15.buffer
        L_0x006e:
            boolean r0 = r14.canUseSurface()
            if (r0 == 0) goto L_0x0077
            r5 = 1
            if (r3 != 0) goto L_0x0078
        L_0x0077:
            r5 = 0
        L_0x0078:
            boolean r0 = r14.useSurfaceMode
            if (r5 == r0) goto L_0x00ae
            int r1 = r14.width
            int r0 = r14.height
            org.webrtc.VideoCodecStatus r1 = r14.resetCodec(r1, r0, r5)
        L_0x0084:
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            if (r1 == r0) goto L_0x00ae
            return r1
        L_0x0089:
            int r6 = r7.getWidth()
            org.webrtc.VideoFrame$Buffer r0 = r15.buffer
            int r5 = r0.getHeight()
            boolean r0 = r14.canUseSurface()
            if (r0 == 0) goto L_0x009c
            r1 = 1
            if (r3 != 0) goto L_0x009d
        L_0x009c:
            r1 = 0
        L_0x009d:
            int r0 = r14.width
            if (r6 != r0) goto L_0x00a9
            int r0 = r14.height
            if (r5 != r0) goto L_0x00a9
            boolean r0 = r14.useSurfaceMode
            if (r1 == r0) goto L_0x00ae
        L_0x00a9:
            org.webrtc.VideoCodecStatus r1 = r14.resetCodec(r6, r5, r1)
            goto L_0x0084
        L_0x00ae:
            java.util.concurrent.BlockingDeque r0 = r14.outputBuilders
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x00be
            r14.hashCode()
            boolean r0 = org.webrtc.Logging.loggingEnabled
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.NO_OUTPUT
            return r1
        L_0x00be:
            r0 = r16
            org.webrtc.EncodedImage$FrameType[] r6 = r0.frameTypes
            int r5 = r6.length
            r3 = 0
        L_0x00c4:
            if (r4 >= r5) goto L_0x00d0
            r1 = r6[r4]
            org.webrtc.EncodedImage$FrameType r0 = org.webrtc.EncodedImage.FrameType.VideoFrameKey
            if (r1 != r0) goto L_0x00cd
            r3 = 1
        L_0x00cd:
            int r4 = r4 + 1
            goto L_0x00c4
        L_0x00d0:
            if (r3 != 0) goto L_0x00da
            long r0 = r15.timestampNs
            boolean r0 = r14.shouldForceKeyFrame(r0)
            if (r0 == 0) goto L_0x00df
        L_0x00da:
            long r0 = r15.timestampNs
            r14.requestKeyFrame(r0)
        L_0x00df:
            int r1 = r7.getHeight()
            int r0 = r7.getWidth()
            int r1 = r1 * r0
            int r3 = r1 * 3
            int r3 = r3 / r2
            org.webrtc.EncodedImage$Builder r2 = new org.webrtc.EncodedImage$Builder
            r2.<init>()
            long r0 = r15.timestampNs
            r2.captureTimeNs = r0
            org.webrtc.VideoFrame$Buffer r0 = r15.buffer
            int r0 = r0.getWidth()
            r2.encodedWidth = r0
            org.webrtc.VideoFrame$Buffer r0 = r15.buffer
            int r0 = r0.getHeight()
            r2.encodedHeight = r0
            int r0 = r15.rotation
            r2.rotation = r0
            java.util.concurrent.BlockingDeque r0 = r14.outputBuilders
            r0.offer(r2)
            boolean r0 = r14.useSurfaceMode
            if (r0 == 0) goto L_0x011f
            org.webrtc.VideoCodecStatus r1 = r14.encodeTextureBuffer(r15)
        L_0x0115:
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            if (r1 == r0) goto L_0x000b
            java.util.concurrent.BlockingDeque r0 = r14.outputBuilders
            r0.pollLast()
            return r1
        L_0x011f:
            org.webrtc.VideoCodecStatus r1 = r14.encodeByteBuffer(r15, r7, r3)
            goto L_0x0115
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.encode(org.webrtc.VideoFrame, org.webrtc.VideoEncoder$EncodeInfo):org.webrtc.VideoCodecStatus");
    }

    public VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, VideoFrame.Buffer buffer, int i) {
        String str;
        this.encodeThreadChecker.checkIsOnValidThread();
        long A0P = AnonymousClass7TE.A0P(videoFrame.timestampNs + 500);
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0);
            if (dequeueInputBuffer == -1) {
                boolean z = Logging.loggingEnabled;
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, A0P, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    e = e;
                    str = "queueInputBuffer failed";
                    Logging.e(TAG, str, e);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e2) {
                e = e2;
                str = "getInputBuffers failed";
                Logging.e(TAG, str, e);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e3) {
            e = e3;
            str = "dequeueInputBuffer failed";
            Logging.e(TAG, str, e);
            return VideoCodecStatus.ERROR;
        }
    }

    public VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            if (this.eglMakeCurrentOnEncodeEnabled) {
                this.textureEglBase.makeCurrent();
            }
            GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.buffer, 0, videoFrame.timestampNs), this.textureDrawer, (Matrix) null);
            this.textureEglBase.swapBuffers(videoFrame.timestampNs);
            return VideoCodecStatus.OK;
        } catch (RuntimeException e) {
            Logging.e(TAG, "encodeTexture failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer);
    }

    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(16, false);
    }

    public String getImplementationName() {
        return this.codecName;
    }

    public VideoEncoder.ScalingSettings getScalingSettings() {
        int i;
        int i2;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                i = 29;
                i2 = 95;
            } else if (videoCodecMimeType == VideoCodecMimeType.H264) {
                i = 24;
                i2 = 37;
            }
            return new VideoEncoder.ScalingSettings(i, i2);
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback2) {
        int i;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback2;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.useSurfaceMode = canUseSurface();
        int i2 = settings.startBitrate;
        if (!(i2 == 0 || (i = settings.maxFramerate) == 0)) {
            this.bitrateAdjuster.setTargets(i2 * IgNetworkConsentStorage.MAX_ENTRIES, (double) i);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        hashCode();
        boolean z = Logging.loggingEnabled;
        return initEncodeInternal();
    }

    public /* synthetic */ boolean isHardwareEncoder() {
        return true;
    }

    public boolean isRoiInfoSupported() {
        if (!this.codecName.startsWith(MediaCodecUtils.QCOM_PREFIX) || this.codecType != VideoCodecMimeType.H265) {
            return false;
        }
        return true;
    }

    /* renamed from: lambda$sendEncodedFrame$0$org-webrtc-HardwareVideoEncoder  reason: not valid java name */
    public /* synthetic */ void m46lambda$sendEncodedFrame$0$orgwebrtcHardwareVideoEncoder(int i) {
        try {
            this.codec.releaseOutputBuffer(i, false);
        } catch (Exception e) {
            Logging.e(TAG, "releaseOutputBuffer failed", e);
        }
        this.outputBuffersBusyCount.decrement();
    }

    public VideoCodecStatus release() {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus maybeCloseOutputThread = maybeCloseOutputThread();
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputBuffers = null;
        this.encodeThreadChecker.thread = null;
        return maybeCloseOutputThread;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        hashCode();
        boolean z = Logging.loggingEnabled;
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.e(TAG, "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.e(TAG, "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        hashCode();
    }

    public void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "requestKeyFrame failed", e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, org.webrtc.VideoEncoder$CodecSpecificInfo] */
    public void sendEncodedFrame(EncodedImage.FrameType frameType, ByteBuffer byteBuffer, int i, MediaCodec.BufferInfo bufferInfo) {
        this.outputBuffersBusyCount.increment();
        EncodedImage.Builder builder = (EncodedImage.Builder) this.outputBuilders.poll();
        builder.setBuffer(byteBuffer, new HardwareVideoEncoder$$ExternalSyntheticLambda0(this, i));
        builder.frameType = frameType;
        EncodedImage createEncodedImage = builder.createEncodedImage();
        this.callback.onEncodedFrame(createEncodedImage, new Object());
        createEncodedImage.release();
    }

    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i > 30) {
            i = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), (double) i);
        return VideoCodecStatus.OK;
    }

    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }

    public boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        if (j2 <= 0 || j <= this.lastKeyFrameNs + j2) {
            return false;
        }
        return true;
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map map, int i, int i2, BitrateAdjuster bitrateAdjuster2, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos((long) i2);
        this.bitrateAdjuster = bitrateAdjuster2;
        this.sharedContext = context;
        threadChecker.thread = null;
    }
}
