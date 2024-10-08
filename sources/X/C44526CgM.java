package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CgM  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44526CgM {
    public static Map A00(DTU dtu) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dtu.getAttributionAppId() != null) {
            A1H.put("attribution_app_id", dtu.getAttributionAppId());
        }
        if (dtu.getAttributionAppName() != null) {
            A1H.put("attribution_app_name", dtu.getAttributionAppName());
        }
        if (dtu.AdC() != null) {
            A1H.put("attribution_url", dtu.AdC());
        }
        return 0Yt.A0B(A1H);
    }
}
