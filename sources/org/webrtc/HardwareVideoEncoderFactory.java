package org.webrtc;

import X.C13988Tno;
import X.C13989Tnp;
import X.C51973G9u;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.VideoEncoderFactory;

public class HardwareVideoEncoderFactory implements VideoEncoderFactory {
    public static final String C2_EXYNOS_PREFIX = "c2.exynos";
    public static final List H264_HW_EXCEPTION_MODELS = Arrays.asList(new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"});
    public static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    public static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    public static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    public static final String TAG = "HardwareVideoEncoderFactory";
    public boolean addH264HighProfileByDefault;
    public final Predicate codecAllowedPredicate;
    public final boolean enableExynosVp8Encoder;
    public final boolean enableH264HighProfile;
    public final boolean enableIntelVp8Encoder;
    public final boolean enableMTKH264Encoder;
    public final boolean enableMTKH265Encoder;
    public int periodicKeyFrameInterval;
    public final EglBase14.Context sharedContext;

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this(context, z, z2, (Predicate) null);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, org.webrtc.MediaCodecWrapperFactory] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004d, code lost:
        if (r0 == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo r18) {
        /*
            r17 = this;
            r6 = 0
            r4 = r18
            java.lang.String r0 = r4.name
            org.webrtc.VideoCodecMimeType r9 = org.webrtc.VideoCodecMimeType.valueOf(r0)
            r3 = r17
            android.media.MediaCodecInfo r5 = r3.findCodecForType(r9)
            if (r5 == 0) goto L_0x004f
            java.lang.String r8 = r5.getName()
            java.lang.String r2 = r9.mimeType()
            int[] r1 = org.webrtc.MediaCodecUtils.TEXTURE_COLOR_FORMATS
            android.media.MediaCodecInfo$CodecCapabilities r0 = r5.getCapabilitiesForType(r2)
            java.lang.Integer r10 = org.webrtc.MediaCodecUtils.selectColorFormat(r1, r0)
            int[] r1 = org.webrtc.MediaCodecUtils.ENCODER_COLOR_FORMATS
            android.media.MediaCodecInfo$CodecCapabilities r0 = r5.getCapabilitiesForType(r2)
            java.lang.Integer r11 = org.webrtc.MediaCodecUtils.selectColorFormat(r1, r0)
            org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H264
            if (r9 != r0) goto L_0x0050
            java.util.Map r1 = r4.params
            r0 = 1
            java.util.Map r0 = org.webrtc.MediaCodecUtils.getCodecProperties(r9, r0)
            boolean r2 = org.webrtc.H264Utils.nativeIsSameH264Profile(r1, r0)
            java.util.Map r1 = r4.params
            r0 = 0
            java.util.Map r0 = org.webrtc.MediaCodecUtils.getCodecProperties(r9, r0)
            boolean r0 = org.webrtc.H264Utils.nativeIsSameH264Profile(r1, r0)
            if (r2 == 0) goto L_0x004d
            boolean r0 = r3.isH264HighProfileSupported(r5)
        L_0x004d:
            if (r0 != 0) goto L_0x0050
        L_0x004f:
            return r6
        L_0x0050:
            org.webrtc.MediaCodecWrapperFactoryImpl r7 = new org.webrtc.MediaCodecWrapperFactoryImpl
            r7.<init>()
            java.util.Map r12 = r4.params
            int r13 = r3.getKeyFrameIntervalSec(r9)
            int r14 = r3.getForcedKeyFrameIntervalMs(r9, r8)
            org.webrtc.BitrateAdjuster r15 = r3.createBitrateAdjuster(r9, r8)
            org.webrtc.EglBase14$Context r0 = r3.sharedContext
            org.webrtc.HardwareVideoEncoder r6 = new org.webrtc.HardwareVideoEncoder
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.createEncoder(org.webrtc.VideoCodecInfo):org.webrtc.VideoEncoder");
    }

    public MediaCodecInfo findCodecForType(VideoCodecMimeType videoCodecMimeType) {
        MediaCodecInfo mediaCodecInfo;
        int i = 0;
        while (true) {
            mediaCodecInfo = null;
            if (i >= MediaCodecList.getCodecCount()) {
                break;
            }
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.e(TAG, "Cannot retrieve encoder codec info", e);
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType)) {
                break;
            }
            i++;
        }
        return mediaCodecInfo;
    }

    /* renamed from: getSupportedCodecs */
    public VideoCodecInfo[] getImplementations() {
        ArrayList arrayList = new ArrayList();
        VideoCodecMimeType videoCodecMimeType = VideoCodecMimeType.VP8;
        VideoCodecMimeType videoCodecMimeType2 = VideoCodecMimeType.VP9;
        VideoCodecMimeType videoCodecMimeType3 = VideoCodecMimeType.H264;
        VideoCodecMimeType[] videoCodecMimeTypeArr = {videoCodecMimeType, videoCodecMimeType2, videoCodecMimeType3, VideoCodecMimeType.H265};
        int i = 0;
        do {
            VideoCodecMimeType videoCodecMimeType4 = videoCodecMimeTypeArr[i];
            MediaCodecInfo findCodecForType = findCodecForType(videoCodecMimeType4);
            if (findCodecForType != null) {
                String name = videoCodecMimeType4.name();
                if (videoCodecMimeType4 == videoCodecMimeType3 && isH264HighProfileSupported(findCodecForType)) {
                    C13988Tno.A1R(name, arrayList, MediaCodecUtils.getCodecProperties(videoCodecMimeType4, true));
                }
                C13988Tno.A1R(name, arrayList, MediaCodecUtils.getCodecProperties(videoCodecMimeType4, false));
            }
            i++;
        } while (i < 4);
        return C13989Tnp.A1b(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3.addH264HighProfileByDefault != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isH264HighProfileSupported(android.media.MediaCodecInfo r4) {
        /*
            r3 = this;
            r2 = 1
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = "OMX.Exynos."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0012
            boolean r0 = r3.addH264HighProfileByDefault
            r1 = 0
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            boolean r0 = r3.enableH264HighProfile
            if (r0 == 0) goto L_0x001a
            if (r1 == 0) goto L_0x001a
            return r2
        L_0x001a:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.isH264HighProfileSupported(android.media.MediaCodecInfo):boolean");
    }

    /* renamed from: org.webrtc.HardwareVideoEncoderFactory$1  reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoCodecMimeType;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0018 */
        static {
            /*
                org.webrtc.VideoCodecMimeType[] r0 = org.webrtc.VideoCodecMimeType.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                $SwitchMap$org$webrtc$VideoCodecMimeType = r1
                org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.VP8     // Catch:{ NoSuchFieldError -> 0x000e }
                X.C66581MXm.A1N(r0, r1)     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.VP9     // Catch:{ NoSuchFieldError -> 0x0013 }
                X.C51970G9q.A1M(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H264     // Catch:{ NoSuchFieldError -> 0x0018 }
                X.C66581MXm.A1O(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H265     // Catch:{ NoSuchFieldError -> 0x001d }
                X.Pxf.A1J(r0, r1)     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.AnonymousClass1.<clinit>():void");
        }
    }

    private boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        if (name.startsWith(MediaCodecUtils.QCOM_PREFIX) || name.startsWith(MediaCodecUtils.EXYNOS_PREFIX) || (((name.startsWith(MediaCodecUtils.MTK_PREFIX) || name.startsWith(MediaCodecUtils.MS_PREFIX)) && this.enableMTKH264Encoder) || name.startsWith(C2_EXYNOS_PREFIX))) {
            return true;
        }
        return false;
    }

    private boolean isMediaCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        Predicate predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [org.webrtc.BitrateAdjuster, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [org.webrtc.BitrateAdjuster, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [org.webrtc.BitrateAdjuster, java.lang.Object] */
    public BitrateAdjuster createBitrateAdjuster(VideoCodecMimeType videoCodecMimeType, String str) {
        if (str.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) {
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new Object();
            }
            if (videoCodecMimeType == VideoCodecMimeType.VP9) {
                return new Object();
            }
        }
        return new Object();
    }

    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    public int getForcedKeyFrameIntervalMs(VideoCodecMimeType videoCodecMimeType, String str) {
        if (videoCodecMimeType != VideoCodecMimeType.VP8 || !str.startsWith(MediaCodecUtils.QCOM_PREFIX)) {
            return 0;
        }
        return 15000;
    }

    public int getKeyFrameIntervalSec(VideoCodecMimeType videoCodecMimeType) {
        int i = this.periodicKeyFrameInterval;
        if (i > 0) {
            return i;
        }
        int ordinal = videoCodecMimeType.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return 100;
        }
        if (ordinal == 2 || ordinal == 4) {
            return 20;
        }
        throw C51973G9u.A0g(videoCodecMimeType, "Unsupported VideoCodecMimeType ", new StringBuilder());
    }

    public void setPeriodicKeyFrameIntervalSec(int i) {
        boolean z = Logging.loggingEnabled;
        this.periodicKeyFrameInterval = i;
    }

    private boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        int ordinal = videoCodecMimeType.ordinal();
        if (ordinal == 0) {
            return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
        }
        if (ordinal == 1) {
            return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
        }
        if (ordinal == 2) {
            return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
        }
        if (ordinal != 4) {
            return false;
        }
        return isHardwareSupportedInCurrentSdkH265(mediaCodecInfo);
    }

    private boolean isHardwareSupportedInCurrentSdkH265(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith(MediaCodecUtils.QCOM_PREFIX) || ((name.startsWith(MediaCodecUtils.MTK_PREFIX) && this.enableMTKH265Encoder) || name.startsWith(C2_EXYNOS_PREFIX))) {
            return true;
        }
        return false;
    }

    private boolean isHardwareSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith(MediaCodecUtils.QCOM_PREFIX) || ((name.startsWith(MediaCodecUtils.EXYNOS_PREFIX) && this.enableExynosVp8Encoder) || ((name.startsWith(MediaCodecUtils.INTEL_PREFIX) && this.enableIntelVp8Encoder) || name.startsWith(C2_EXYNOS_PREFIX)))) {
            return true;
        }
        return false;
    }

    private boolean isHardwareSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith(MediaCodecUtils.QCOM_PREFIX) || name.startsWith(MediaCodecUtils.EXYNOS_PREFIX)) {
            return true;
        }
        return false;
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType) || MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) == null || !isHardwareSupportedInCurrentSdk(mediaCodecInfo, videoCodecMimeType) || !isMediaCodecAllowed(mediaCodecInfo)) {
            return false;
        }
        return true;
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, Predicate predicate) {
        this(context, z, z2, false, predicate);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Predicate predicate) {
        EglBase14.Context context2;
        this.periodicKeyFrameInterval = -1;
        this.addH264HighProfileByDefault = false;
        if (context instanceof EglBase14.Context) {
            context2 = (EglBase14.Context) context;
        } else {
            boolean z7 = Logging.loggingEnabled;
            context2 = null;
        }
        this.sharedContext = context2;
        this.enableMTKH264Encoder = z5;
        this.enableMTKH265Encoder = z6;
        this.enableIntelVp8Encoder = z;
        this.enableExynosVp8Encoder = z2;
        this.enableH264HighProfile = z3;
        this.addH264HighProfileByDefault = z4;
        this.codecAllowedPredicate = predicate;
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4, Predicate predicate) {
        this(context, z, z2, z3, false, z4, predicate);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Predicate predicate) {
        this(context, z, z2, z3, false, z5, false, predicate);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, boolean z3, Predicate predicate) {
        this(context, z, true, z2, z3, predicate);
    }

    @Deprecated
    public HardwareVideoEncoderFactory(boolean z, boolean z2) {
        this((EglBase.Context) null, z, z2);
    }
}
