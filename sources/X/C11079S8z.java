package X;

import android.media.MediaCodecInfo;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.S8z  reason: case insensitive filesystem */
public abstract class C11079S8z {
    public static void A00(MediaCodecInfo.VideoCapabilities videoCapabilities, JSONObject jSONObject) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        JSONArray A1E = Pxe.A1E();
        if (supportedPerformancePoints != null) {
            for (MediaCodecInfo.VideoCapabilities.PerformancePoint obj : supportedPerformancePoints) {
                A1E.put(obj.toString());
            }
        }
        jSONObject.put("performance_point", A1E);
    }

    public static void A01(MediaCodecInfo mediaCodecInfo, JSONObject jSONObject) {
        jSONObject.put("vendor", mediaCodecInfo.isVendor());
        jSONObject.put("is_hw", mediaCodecInfo.isHardwareAccelerated());
        jSONObject.put("is_sw_only", mediaCodecInfo.isSoftwareOnly());
        jSONObject.put("is_alias", mediaCodecInfo.isAlias());
    }
}
