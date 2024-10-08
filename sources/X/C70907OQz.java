package X;

import com.instagram.rtc.signaling.models.RtcConnectionEntity;

/* renamed from: X.OQz  reason: case insensitive filesystem */
public abstract /* synthetic */ class C70907OQz {
    public static String A01(RtcConnectionEntity rtcConnectionEntity) {
        return 002.A0R("igvc_", A00(rtcConnectionEntity));
    }

    public static String A00(RtcConnectionEntity rtcConnectionEntity) {
        return 002.A0T(rtcConnectionEntity.BkA(), rtcConnectionEntity.Bse(), '_');
    }
}
