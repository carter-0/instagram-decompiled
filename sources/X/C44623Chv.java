package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Chv  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44623Chv {
    public static Map A00(DUF duf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (duf.getAttributionAppId() != null) {
            A1H.put("attribution_app_id", duf.getAttributionAppId());
        }
        if (duf.getAttributionAppName() != null) {
            A1H.put("attribution_app_name", duf.getAttributionAppName());
        }
        if (duf.Bch() != null) {
            A1H.put("pivot_page_header", duf.Bch().FHC());
        }
        return 0Yt.A0B(A1H);
    }
}
