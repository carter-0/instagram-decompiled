package X;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

public abstract class S90 {
    public static String A00(boolean z) {
        String str;
        JSONArray A1E = Pxe.A1E();
        for (MediaCodecInfo mediaCodecInfo : Pxg.A1Z(1)) {
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (!(supportedTypes == null || supportedTypes.length == 0 || (str = supportedTypes[0]) == null || true != str.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) || z != mediaCodecInfo.isEncoder())) {
                try {
                    JSONObject A11 = DbS.A11();
                    A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, mediaCodecInfo.getName());
                    A11.put("support_types", new JSONArray(mediaCodecInfo.getSupportedTypes()));
                    if (Build.VERSION.SDK_INT >= 29) {
                        C11079S8z.A01(mediaCodecInfo, A11);
                    }
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    JSONArray A1E2 = Pxe.A1E();
                    JSONArray A1E3 = Pxe.A1E();
                    if (capabilitiesForType != null) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            A1E2.put(codecProfileLevel.profile);
                            A1E3.put(codecProfileLevel.level);
                        }
                    }
                    A11.put("profiles", A1E2);
                    A11.put("levels", A1E3);
                    A1E.put(A11);
                } catch (Throwable unused) {
                }
            }
        }
        String obj = A1E.toString();
        if (obj != null) {
            return obj;
        }
        return "[]";
    }

    public static String A01(boolean z) {
        String[] strArr = {"video/hevc", "video/avc", "video/x-vnd.on2.vp9", "video/x-vnd.on2.vp8", "video/av01"};
        JSONObject A11 = DbS.A11();
        for (int i = 0; i < 5; i++) {
            String str = strArr[i];
            try {
                JSONArray A1E = Pxe.A1E();
                for (MediaCodecInfo mediaCodecInfo : Pxg.A1Z(1)) {
                    if (Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str) && z == mediaCodecInfo.isEncoder()) {
                        try {
                            JSONObject A112 = DbS.A11();
                            A112.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, mediaCodecInfo.getName());
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 29) {
                                C11079S8z.A01(mediaCodecInfo, A112);
                            }
                            for (String capabilitiesForType : mediaCodecInfo.getSupportedTypes()) {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType(capabilitiesForType);
                                if (capabilitiesForType2 != null) {
                                    A112.put("max_supported_instances", capabilitiesForType2.getMaxSupportedInstances());
                                    if (z) {
                                        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType2.getEncoderCapabilities();
                                        if (encoderCapabilities != null) {
                                            A112.put("complexity_range", encoderCapabilities.getComplexityRange());
                                            JSONArray A1E2 = Pxe.A1E();
                                            if (encoderCapabilities.isBitrateModeSupported(2)) {
                                                A1E2.put("CBR");
                                            }
                                            if (encoderCapabilities.isBitrateModeSupported(1)) {
                                                A1E2.put("VBR");
                                            }
                                            if (encoderCapabilities.isBitrateModeSupported(0)) {
                                                A1E2.put("CQ");
                                            }
                                            A112.put("bitrate_mode", A1E2);
                                            if (i2 >= 29) {
                                                A112.put("quality_range", encoderCapabilities.getQualityRange());
                                            }
                                        }
                                    } else {
                                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType2.getVideoCapabilities();
                                        if (videoCapabilities != null) {
                                            A112.put("supported_frame_rates", videoCapabilities.getSupportedFrameRates());
                                            A112.put("bitrate_range", videoCapabilities.getBitrateRange());
                                            A112.put("supported_heights", videoCapabilities.getSupportedHeights());
                                            A112.put("supported_widths", videoCapabilities.getSupportedWidths());
                                            if (i2 >= 29) {
                                                C11079S8z.A00(videoCapabilities, A112);
                                            }
                                        }
                                    }
                                }
                            }
                            A1E.put(A112);
                        } catch (Throwable unused) {
                        }
                    }
                }
                A11.put(str, A1E);
            } catch (Throwable unused2) {
            }
        }
        return A11.toString();
    }
}
