package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.HardwareVideoEncoderFactory;

public abstract class SDN {
    public static SNL A00 = A00("404,502");
    public static SNL A01 = SNL.A00(ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS, ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS);
    public static SNL A02 = SNL.A00(60000, 60000);
    public static SNL A03 = SNL.A00(61000, 61000);
    public static SNL A04 = SNL.A01(86400000, 86400000);
    public static SNL A05 = new SNL(new C10267RpR(false), false);
    public static SNL A06 = SNL.A01(10000, 10000);
    public static SNL A07 = SNL.A01(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    public static SNL A08 = SNL.A01(1800000, 1800000);
    public static SNL A09 = SNL.A01(86400000, 86400000);
    public static SNL A0A = SNL.A01(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    public static SNL A0B = new SNL(new C10267RpR(false), false);
    public static SNL A0C;
    public static SNL A0D = new SNL(new C10267RpR("GAv4-SVC"), "GAv4");
    public static SNL A0E = SNL.A00(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
    public static SNL A0F = SNL.A00(100, 100);
    public static SNL A0G = SNL.A01(1800000, 120000);
    public static SNL A0H = SNL.A01(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    public static SNL A0I = SNL.A01(7200000, 7200000);
    public static SNL A0J = SNL.A01(32400000, 32400000);
    public static SNL A0K = SNL.A00(20, 20);
    public static SNL A0L = SNL.A00(20, 20);
    public static SNL A0M = A00("http://www.google-analytics.com");
    public static SNL A0N = A00("https://ssl.google-analytics.com");
    public static SNL A0O = A00("/collect");
    public static SNL A0P = A00("/batch");
    public static SNL A0Q = SNL.A00(2036, 2036);
    public static SNL A0R = A00("BATCH_BY_COUNT");
    public static SNL A0S = A00("GZIP");
    public static SNL A0T = SNL.A00(8192, 8192);
    public static SNL A0U = SNL.A00(8192, 8192);
    public static SNL A0V = SNL.A00(8192, 8192);
    public static SNL A0W = SNL.A01(86400000, 86400000);
    public static SNL A0X = A00("");
    public static SNL A0Y = SNL.A00(0, 0);
    public static SNL A0Z = SNL.A01(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    public static SNL A0a = SNL.A01(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
    public static SNL A0b = new SNL(new C10267RpR(false), false);
    public static SNL A0c = SNL.A01(60, 60);
    public static SNL A0d;
    public static SNL A0e = SNL.A00(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
    public static SNL A0f = SNL.A01(120000, 120000);
    public static SNL A0g = SNL.A01(7200000, 7200000);
    public static SNL A0h = SNL.A00(20, 20);

    static {
        Boolean A0v = AnonymousClass7TE.A0v();
        A0C = new SNL(new C10267RpR(A0v), A0v);
        Float valueOf = Float.valueOf(0.5f);
        A0d = new SNL(new C10267RpR(valueOf), valueOf);
    }

    public static SNL A00(Object obj) {
        return new SNL(new C10267RpR(obj), obj);
    }
}
