package org.webrtc;

import X.C51973G9u;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

public class MediaCodecUtils {
    public static final String ADAPTIVE_PLAYBACK_ENABLED = "fb-adaptive-playback-enabled";
    public static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    public static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    public static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    public static final String EXYNOS_PREFIX = "OMX.Exynos.";
    public static final String INTEL_PREFIX = "OMX.Intel.";
    public static final String MAXIMUM_OPERATING_RATE = "fb-maximum-operating-rate";
    public static final String MS_PREFIX = "OMX.MS.";
    public static final String MTK_PREFIX = "OMX.MTK.";
    public static final String NVIDIA_PREFIX = "OMX.Nvidia.";
    public static final String QCOM_PREFIX = "OMX.qcom.";
    public static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC.", "c2.android"};
    public static final String TAG = "MediaCodecUtils";
    public static final int[] TEXTURE_COLOR_FORMATS = {2130708361};

    public static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }

    /* renamed from: org.webrtc.MediaCodecUtils$1  reason: invalid class name */
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
                org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H265     // Catch:{ NoSuchFieldError -> 0x0018 }
                X.C66581MXm.A1O(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.H264     // Catch:{ NoSuchFieldError -> 0x001d }
                X.Pxf.A1J(r0, r1)     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecUtils.AnonymousClass1.<clinit>():void");
        }
    }

    public static boolean codecSupportsAdaptivePlayback(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return isHardwareAcceleratedQOrHigher(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo);
    }

    public static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return isSoftwareOnlyQOrHigher(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        for (String startsWith : SOFTWARE_IMPLEMENTATION_PREFIXES) {
            if (name.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, VideoCodecMimeType videoCodecMimeType) {
        for (String equals : mediaCodecInfo.getSupportedTypes()) {
            if (videoCodecMimeType.mimeType().equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static Map getCodecProperties(VideoCodecMimeType videoCodecMimeType, boolean z) {
        int ordinal = videoCodecMimeType.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 4) {
            return new HashMap();
        }
        if (ordinal == 2) {
            return H264Utils.getDefaultH264Params(z);
        }
        throw C51973G9u.A0g(videoCodecMimeType, "Unsupported codec: ", new StringBuilder());
    }

    public static int[] getTextureColorFormats() {
        return new int[]{2130708361};
    }

    public static boolean isHardwareAcceleratedQOrHigher(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean isSoftwareOnlyQOrHigher(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }
}
