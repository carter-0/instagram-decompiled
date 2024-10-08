package org.webrtc;

import X.002;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51966G9m;
import X.DbT;
import X.DbW;
import X.Pxg;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.proxygen.LigerSamplePolicy;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

public class AndroidVideoDecoder implements VideoSink, VideoDecoder {
    public static final String DECODE_TIME_FIX_ENABLED = "fb-decode-time-fix-enabled";
    public static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    public static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    public static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    public static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    public static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    public static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    public static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    public static final String TAG = "AndroidVideoDecoder";
    public boolean adaptivePlaybackEnabled;
    public VideoDecoder.Callback callback;
    public MediaCodecWrapper codec;
    public final String codecName;
    public final VideoCodecMimeType codecType;
    public int colorFormat;
    public int configuredHeight;
    public int configuredWidth;
    public boolean decodeTimeFixEnabled;
    public ThreadUtils.ThreadChecker decoderThreadChecker;
    public final Object dimensionLock;
    public final Map extendedSettings;
    public final BlockingDeque frameInfos;
    public boolean hasDecodedFirstFrame;
    public int height;
    public boolean keyFrameRequired;
    public boolean maximumOperatingRate;
    public final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    public Thread outputThread;
    public ThreadUtils.ThreadChecker outputThreadChecker;
    public DecodedTextureMetadata renderedTextureMetadata;
    public final Object renderedTextureMetadataLock;
    public volatile boolean running;
    public final EglBase.Context sharedContext;
    public volatile Exception shutdownException;
    public int sliceHeight;
    public int stride;
    public Surface surface;
    public SurfaceTextureHelper surfaceTextureHelper;
    public int width;

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, (Runnable) null).toI420();
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        int i5;
        int i6;
        VideoFrame.Buffer copyNV12ToI420Buffer;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
            i5 = this.stride;
            i6 = this.sliceHeight;
        }
        int i7 = bufferInfo.size;
        if (i7 < ((i3 * i4) * 3) / 2) {
            boolean z = Logging.loggingEnabled;
            return;
        }
        if (i7 < ((i5 * i4) * 3) / 2 && i6 == i4 && i5 > i3) {
            i5 = (i7 * 2) / (i4 * 3);
        }
        ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i];
        Pxg.A1D(bufferInfo, byteBuffer);
        ByteBuffer slice = byteBuffer.slice();
        if (this.colorFormat == 19) {
            copyNV12ToI420Buffer = copyI420Buffer(slice, i5, i6, i3, i4);
        } else {
            copyNV12ToI420Buffer = copyNV12ToI420Buffer(slice, i5, i6, i3, i4);
        }
        this.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(copyNV12ToI420Buffer, i2, bufferInfo.presentationTimeUs * 1000);
        if (this.running) {
            this.callback.onDecodedFrame(videoFrame, (Integer) null, (Integer) null);
        } else {
            boolean z2 = Logging.loggingEnabled;
        }
        videoFrame.release();
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public class DecodedTextureMetadata {
        public final Integer decodeTimeMs;
        public final long presentationTimestampUs;

        public DecodedTextureMetadata(long j, Integer num) {
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
        }
    }

    public class FrameInfo {
        public final long decodeStartTimeMs;
        public final long presentationTimeUs;
        public final int rotation;

        public FrameInfo(long j, int i, long j2) {
            this.decodeStartTimeMs = j;
            this.rotation = i;
            this.presentationTimeUs = j2;
        }
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i;
        if (i % 2 == 0) {
            int i7 = i3;
            int i8 = (i3 + 1) / 2;
            int i9 = i2 % 2;
            int i10 = i4;
            if (i9 == 0) {
                i5 = (i4 + 1) / 2;
            } else {
                i5 = i4 / 2;
            }
            int i11 = i / 2;
            int i12 = i * i2;
            int i13 = i11 * i5;
            int i14 = i12 + i13;
            int i15 = i12 + ((i11 * i2) / 2);
            int i16 = i13 + i15;
            JavaI420Buffer allocate = JavaI420Buffer.allocate(i7, i10);
            ByteBuffer byteBuffer2 = byteBuffer;
            byteBuffer2.limit(i * i4);
            byteBuffer2.position(0);
            YuvHelper.nativeCopyPlane(byteBuffer2.slice(), i6, allocate.getDataY(), allocate.getStrideY(), i7, i10);
            byteBuffer2.limit(i14);
            byteBuffer2.position(i12);
            int i17 = i8;
            int i18 = i5;
            int i19 = i11;
            YuvHelper.nativeCopyPlane(byteBuffer2.slice(), i19, allocate.getDataU(), allocate.getStrideU(), i17, i18);
            if (i9 == 1) {
                int i20 = i12 + ((i5 - 1) * i11);
                byteBuffer2.limit(i20 + i8);
                byteBuffer2.position(i20);
                ByteBuffer dataU = allocate.getDataU();
                dataU.position(allocate.getStrideU() * i5);
                dataU.put(byteBuffer2.slice());
            }
            byteBuffer2.limit(i16);
            byteBuffer2.position(i15);
            YuvHelper.nativeCopyPlane(byteBuffer2.slice(), i19, allocate.getDataV(), allocate.getStrideV(), i17, i18);
            if (i9 == 1) {
                int i21 = i15 + (i11 * (i5 - 1));
                byteBuffer2.limit(i8 + i21);
                byteBuffer2.position(i21);
                ByteBuffer dataV = allocate.getDataV();
                dataV.position(allocate.getStrideV() * i5);
                dataV.put(byteBuffer2.slice());
            }
            return allocate;
        }
        throw new AssertionError(002.A0O("Stride is not divisible by two: ", i6));
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") {
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (true) {
                    boolean z = AndroidVideoDecoder.this.running;
                    AndroidVideoDecoder androidVideoDecoder = AndroidVideoDecoder.this;
                    if (z) {
                        androidVideoDecoder.deliverDecodedFrame();
                    } else {
                        androidVideoDecoder.releaseCodecOnOutputThread();
                        return;
                    }
                }
            }
        };
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        MediaCodecWrapper mediaCodecWrapper;
        boolean z;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                mediaCodecWrapper = this.codec;
                z = false;
            } else {
                this.surfaceTextureHelper.setTextureSize(i3, i4);
                this.surfaceTextureHelper.setFrameRotation(i2);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                mediaCodecWrapper = this.codec;
                z = true;
            }
            mediaCodecWrapper.releaseOutputBuffer(i, z);
        }
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        if (this.outputThread == null) {
            this.width = i;
            this.height = i2;
            this.stride = i;
            this.sliceHeight = i2;
            this.hasDecodedFirstFrame = false;
            this.keyFrameRequired = true;
            try {
                this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
                try {
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                    if (this.sharedContext == null) {
                        createVideoFormat.setInteger("color-format", this.colorFormat);
                    }
                    Map map = this.extendedSettings;
                    if (map != null) {
                        Iterator A0u = AnonymousClass7TF.A0u(map);
                        while (A0u.hasNext()) {
                            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                            A1J.getKey();
                            A1J.getValue();
                            createVideoFormat.setInteger(DbT.A13(A1J), ((Integer) A1J.getValue()).intValue());
                        }
                    }
                    if (this.maximumOperatingRate) {
                        createVideoFormat.setInteger("priority", 0);
                        createVideoFormat.setInteger("operating-rate", 32767);
                    }
                    this.codec.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                    this.codec.start();
                    this.configuredWidth = i;
                    this.configuredHeight = i2;
                    this.running = true;
                    AnonymousClass1 r0 = new Thread("AndroidVideoDecoder.outputThread") {
                        public void run() {
                            AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                            while (true) {
                                boolean z = AndroidVideoDecoder.this.running;
                                AndroidVideoDecoder androidVideoDecoder = AndroidVideoDecoder.this;
                                if (z) {
                                    androidVideoDecoder.deliverDecodedFrame();
                                } else {
                                    androidVideoDecoder.releaseCodecOnOutputThread();
                                    return;
                                }
                            }
                        }
                    };
                    this.outputThread = r0;
                    r0.start();
                    return VideoCodecStatus.OK;
                } catch (Exception e) {
                    Logging.e(TAG, "initDecode failed", e);
                    release();
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return VideoCodecStatus.FALLBACK_SOFTWARE;
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r11.surfaceTextureHelper != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r12.containsKey("color-format") == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        r1 = r12.getInteger("color-format");
        r11.colorFormat = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (isSupportedColorFormat(r1) != false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        stopOnOutputThread(X.DbW.A0b("Unsupported color format: ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        r3 = r11.dimensionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0099, code lost:
        if (r12.containsKey(MEDIA_FORMAT_KEY_STRIDE) == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        r11.stride = r12.getInteger(MEDIA_FORMAT_KEY_STRIDE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r12.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        r11.sliceHeight = r12.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        r2 = r11.stride;
        r1 = r11.sliceHeight;
        r11.stride = java.lang.Math.max(r11.width, r2);
        r11.sliceHeight = java.lang.Math.max(r11.height, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void reformat(android.media.MediaFormat r12) {
        /*
            r11 = this;
            org.webrtc.ThreadUtils$ThreadChecker r0 = r11.outputThreadChecker
            r0.checkIsOnValidThread()
            r12.toString()
            boolean r0 = org.webrtc.Logging.loggingEnabled
            java.lang.String r4 = "crop-left"
            boolean r0 = r12.containsKey(r4)
            if (r0 == 0) goto L_0x0044
            java.lang.String r3 = "crop-right"
            boolean r0 = r12.containsKey(r3)
            if (r0 == 0) goto L_0x0044
            java.lang.String r2 = "crop-bottom"
            boolean r0 = r12.containsKey(r2)
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = "crop-top"
            boolean r0 = r12.containsKey(r1)
            if (r0 == 0) goto L_0x0044
            int r0 = r12.getInteger(r3)
            int r9 = r0 + 1
            int r0 = r12.getInteger(r4)
            int r9 = r9 - r0
            int r0 = r12.getInteger(r2)
            int r10 = r0 + 1
            int r0 = r12.getInteger(r1)
            int r10 = r10 - r0
        L_0x0040:
            java.lang.Object r2 = r11.dimensionLock
            monitor-enter(r2)
            goto L_0x0051
        L_0x0044:
            java.lang.String r0 = "width"
            int r9 = r12.getInteger(r0)
            java.lang.String r0 = "height"
            int r10 = r12.getInteger(r0)
            goto L_0x0040
        L_0x0051:
            boolean r0 = r11.hasDecodedFirstFrame     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x0069
            int r7 = r11.width     // Catch:{ all -> 0x00e4 }
            if (r7 != r9) goto L_0x005d
            int r0 = r11.height     // Catch:{ all -> 0x00e4 }
            if (r0 == r10) goto L_0x0069
        L_0x005d:
            boolean r0 = r11.adaptivePlaybackEnabled     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00c8
            int r0 = r11.configuredWidth     // Catch:{ all -> 0x00e4 }
            if (r0 < r9) goto L_0x00c8
            int r0 = r11.configuredHeight     // Catch:{ all -> 0x00e4 }
            if (r0 < r10) goto L_0x00c8
        L_0x0069:
            r11.width = r9     // Catch:{ all -> 0x00e4 }
            r11.height = r10     // Catch:{ all -> 0x00e4 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e4 }
            org.webrtc.SurfaceTextureHelper r0 = r11.surfaceTextureHelper
            if (r0 != 0) goto L_0x0090
            java.lang.String r1 = "color-format"
            boolean r0 = r12.containsKey(r1)
            if (r0 == 0) goto L_0x0090
            int r1 = r12.getInteger(r1)
            r11.colorFormat = r1
            boolean r0 = r11.isSupportedColorFormat(r1)
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "Unsupported color format: "
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r1)
            r11.stopOnOutputThread(r0)
            return
        L_0x0090:
            java.lang.Object r3 = r11.dimensionLock
            monitor-enter(r3)
            java.lang.String r1 = "stride"
            boolean r0 = r12.containsKey(r1)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00a1
            int r0 = r12.getInteger(r1)     // Catch:{ all -> 0x00c5 }
            r11.stride = r0     // Catch:{ all -> 0x00c5 }
        L_0x00a1:
            java.lang.String r1 = "slice-height"
            boolean r0 = r12.containsKey(r1)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00af
            int r0 = r12.getInteger(r1)     // Catch:{ all -> 0x00c5 }
            r11.sliceHeight = r0     // Catch:{ all -> 0x00c5 }
        L_0x00af:
            int r2 = r11.stride     // Catch:{ all -> 0x00c5 }
            int r1 = r11.sliceHeight     // Catch:{ all -> 0x00c5 }
            int r0 = r11.width     // Catch:{ all -> 0x00c5 }
            int r0 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x00c5 }
            r11.stride = r0     // Catch:{ all -> 0x00c5 }
            int r0 = r11.height     // Catch:{ all -> 0x00c5 }
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x00c5 }
            r11.sliceHeight = r0     // Catch:{ all -> 0x00c5 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c5 }
            return
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c5 }
            throw r0
        L_0x00c8:
            java.lang.String r3 = "Unexpected size change. Configured "
            java.lang.String r4 = "*"
            int r8 = r11.height     // Catch:{ all -> 0x00e4 }
            java.lang.String r5 = ". New "
            r6 = r4
            java.lang.String r0 = X.002.A10(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00e4 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e4 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00e4 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e4 }
            r11.stopOnOutputThread(r0)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e4 }
            return
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.reformat(android.media.MediaFormat):void");
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        if (releaseInternal == VideoCodecStatus.OK) {
            return initDecodeInternal(i, i2);
        }
        return releaseInternal;
    }

    /* access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        boolean z = Logging.loggingEnabled;
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.e(TAG, "Media decoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.e(TAG, "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
    }

    private VideoCodecStatus releaseInternal() {
        if (this.outputThread == null) {
            boolean z = Logging.loggingEnabled;
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT)) {
                Logging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                VideoCodecStatus videoCodecStatus = VideoCodecStatus.ERROR;
                this.codec = null;
                this.outputThread = null;
                return videoCodecStatus;
            } else {
                this.codec = null;
                this.outputThread = null;
                return VideoCodecStatus.OK;
            }
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public /* synthetic */ long createNative(long j) {
        return 0;
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int remaining;
        int i;
        int i2;
        String str;
        String str2;
        this.decoderThreadChecker.checkIsOnValidThread();
        if (this.codec == null || this.callback == null || !this.running) {
            boolean z = Logging.loggingEnabled;
            return VideoCodecStatus.UNINITIALIZED;
        }
        EncodedImage encodedImage2 = encodedImage;
        ByteBuffer byteBuffer = encodedImage2.buffer;
        if (byteBuffer == null || (remaining = byteBuffer.remaining()) == 0) {
            boolean z2 = Logging.loggingEnabled;
            return VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            i = this.width;
            i2 = this.height;
        }
        int i3 = encodedImage2.encodedWidth;
        int i4 = encodedImage2.encodedHeight;
        if (i3 * i4 > 0 && !(i3 == i && i4 == i2)) {
            if (!this.adaptivePlaybackEnabled || i3 > this.configuredWidth || i4 > this.configuredHeight) {
                VideoCodecStatus reinitDecode = reinitDecode(i3, i4);
                if (reinitDecode != VideoCodecStatus.OK) {
                    boolean z3 = Logging.loggingEnabled;
                    return reinitDecode;
                }
            } else {
                this.keyFrameRequired = true;
                boolean z4 = Logging.loggingEnabled;
            }
        }
        if (!this.keyFrameRequired || encodedImage2.frameType == EncodedImage.FrameType.VideoFrameKey) {
            try {
                int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000);
                if (dequeueInputBuffer >= 0) {
                    try {
                        ByteBuffer byteBuffer2 = this.codec.getInputBuffers()[dequeueInputBuffer];
                        if (byteBuffer2.capacity() >= remaining) {
                            byteBuffer2.put(encodedImage2.buffer);
                            long micros = TimeUnit.NANOSECONDS.toMicros(encodedImage2.captureTimeNs);
                            this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage2.rotation, micros));
                            try {
                                this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, micros, 0);
                                if (this.keyFrameRequired) {
                                    this.keyFrameRequired = false;
                                }
                                return VideoCodecStatus.OK;
                            } catch (IllegalStateException e) {
                                Logging.e(TAG, "queueInputBuffer failed", e);
                                this.frameInfos.pollLast();
                                return VideoCodecStatus.ERROR;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        e = e2;
                        str = TAG;
                        str2 = "getInputBuffers failed";
                        Logging.e(str, str2, e);
                        return VideoCodecStatus.ERROR;
                    }
                }
                boolean z5 = Logging.loggingEnabled;
                return VideoCodecStatus.ERROR;
            } catch (IllegalStateException e3) {
                e = e3;
                str = TAG;
                str2 = "dequeueInputBuffer failed";
                Logging.e(str, str2, e);
                return VideoCodecStatus.ERROR;
            }
        } else {
            boolean z6 = Logging.loggingEnabled;
            return VideoCodecStatus.NO_OUTPUT;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r8 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deliverDecodedFrame() {
        /*
            r9 = this;
            java.lang.String r4 = "AndroidVideoDecoder"
            org.webrtc.ThreadUtils$ThreadChecker r0 = r9.outputThreadChecker
            r0.checkIsOnValidThread()
            android.media.MediaCodec$BufferInfo r6 = new android.media.MediaCodec$BufferInfo     // Catch:{ IllegalStateException -> 0x0067 }
            r6.<init>()     // Catch:{ IllegalStateException -> 0x0067 }
            org.webrtc.MediaCodecWrapper r2 = r9.codec     // Catch:{ IllegalStateException -> 0x0067 }
            r0 = 100000(0x186a0, double:4.94066E-319)
            int r5 = r2.dequeueOutputBuffer(r6, r0)     // Catch:{ IllegalStateException -> 0x0067 }
            r0 = -2
            if (r5 != r0) goto L_0x0022
            org.webrtc.MediaCodecWrapper r0 = r9.codec     // Catch:{ IllegalStateException -> 0x0067 }
            android.media.MediaFormat r0 = r0.getOutputFormat()     // Catch:{ IllegalStateException -> 0x0067 }
            r9.reformat(r0)     // Catch:{ IllegalStateException -> 0x0067 }
            return
        L_0x0022:
            if (r5 >= 0) goto L_0x0027
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch:{ IllegalStateException -> 0x0067 }
            return
        L_0x0027:
            java.util.concurrent.BlockingDeque r0 = r9.frameInfos     // Catch:{ IllegalStateException -> 0x0067 }
            java.lang.Object r8 = r0.poll()     // Catch:{ IllegalStateException -> 0x0067 }
            org.webrtc.AndroidVideoDecoder$FrameInfo r8 = (org.webrtc.AndroidVideoDecoder.FrameInfo) r8     // Catch:{ IllegalStateException -> 0x0067 }
            boolean r0 = r9.decodeTimeFixEnabled     // Catch:{ IllegalStateException -> 0x0067 }
            if (r0 == 0) goto L_0x0046
        L_0x0033:
            if (r8 == 0) goto L_0x0046
            long r2 = r8.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0067 }
            long r0 = r6.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0067 }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x004a
            java.util.concurrent.BlockingDeque r0 = r9.frameInfos     // Catch:{ IllegalStateException -> 0x0067 }
            java.lang.Object r8 = r0.poll()     // Catch:{ IllegalStateException -> 0x0067 }
            org.webrtc.AndroidVideoDecoder$FrameInfo r8 = (org.webrtc.AndroidVideoDecoder.FrameInfo) r8     // Catch:{ IllegalStateException -> 0x0067 }
            goto L_0x0033
        L_0x0046:
            r2 = 0
            r1 = 0
            if (r8 == 0) goto L_0x0058
        L_0x004a:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0067 }
            long r0 = r8.decodeStartTimeMs     // Catch:{ IllegalStateException -> 0x0067 }
            long r2 = r2 - r0
            int r0 = (int) r2     // Catch:{ IllegalStateException -> 0x0067 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalStateException -> 0x0067 }
            int r1 = r8.rotation     // Catch:{ IllegalStateException -> 0x0067 }
        L_0x0058:
            r0 = 1
            r9.hasDecodedFirstFrame = r0     // Catch:{ IllegalStateException -> 0x0067 }
            org.webrtc.SurfaceTextureHelper r0 = r9.surfaceTextureHelper     // Catch:{ IllegalStateException -> 0x0067 }
            if (r0 == 0) goto L_0x0063
            r9.deliverTextureFrame(r5, r6, r1, r2)     // Catch:{ IllegalStateException -> 0x0067 }
            return
        L_0x0063:
            r9.deliverByteFrame(r5, r6, r1, r2)     // Catch:{ IllegalStateException -> 0x0067 }
            return
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = "deliverDecodedFrame failed"
            org.webrtc.Logging.e(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.deliverDecodedFrame():void");
    }

    public String getImplementationName() {
        return this.codecName;
    }

    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback2) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        boolean z = Logging.loggingEnabled;
        this.callback = callback2;
        if (this.sharedContext != null) {
            SurfaceTextureHelper createSurfaceTextureHelper = createSurfaceTextureHelper();
            this.surfaceTextureHelper = createSurfaceTextureHelper;
            this.surface = new Surface(createSurfaceTextureHelper.surfaceTexture);
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    public void onFrame(VideoFrame videoFrame) {
        long j;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata != null) {
                j = decodedTextureMetadata.presentationTimestampUs * 1000;
                num = decodedTextureMetadata.decodeTimeMs;
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        VideoFrame videoFrame2 = new VideoFrame(videoFrame.buffer, videoFrame.rotation, j);
        if (this.running) {
            this.callback.onDecodedFrame(videoFrame2, num, (Integer) null);
        } else {
            boolean z = Logging.loggingEnabled;
        }
    }

    public VideoCodecStatus release() {
        boolean z = Logging.loggingEnabled;
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, VideoCodecMimeType videoCodecMimeType, int i, EglBase.Context context, boolean z, Map map) {
        this.dimensionLock = new Object();
        this.renderedTextureMetadataLock = new Object();
        if (isSupportedColorFormat(i)) {
            boolean z2 = Logging.loggingEnabled;
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
            this.codecName = str;
            this.codecType = videoCodecMimeType;
            this.colorFormat = i;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            this.extendedSettings = map;
            boolean z3 = false;
            this.decodeTimeFixEnabled = false;
            if (map != null) {
                Number A14 = C51966G9m.A14(DECODE_TIME_FIX_ENABLED, map);
                if (A14 != null) {
                    this.decodeTimeFixEnabled = AnonymousClass7TF.A1S(A14.intValue(), 1);
                }
                Number A142 = C51966G9m.A14(MediaCodecUtils.ADAPTIVE_PLAYBACK_ENABLED, map);
                if (AnonymousClass7TE.A0M(map.getOrDefault(MediaCodecUtils.MAXIMUM_OPERATING_RATE, 0)) == 1) {
                    this.maximumOperatingRate = true;
                }
                if (A142 != null) {
                    if (z && A142.intValue() == 1 && context != null) {
                        z3 = true;
                    }
                    this.adaptivePlaybackEnabled = z3;
                    return;
                }
                return;
            }
            return;
        }
        throw DbW.A0a("Unsupported color format: ", i);
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, VideoCodecMimeType videoCodecMimeType, int i, EglBase.Context context) {
        this(mediaCodecWrapperFactory2, str, videoCodecMimeType, i, context, false, (Map) null);
    }
}
