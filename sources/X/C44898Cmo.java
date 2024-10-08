package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cmo  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44898Cmo {
    public static Map A00(DUX dux) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dux.AZ3() != null) {
            A1H.put("ad_id", dux.AZ3());
        }
        if (dux.At9() != null) {
            A1H.put("cta", dux.At9().FHC());
        }
        if (dux.BRo() != null) {
            C41847B3o.A1S(dux.BRo(), A1H);
        }
        if (dux.BRq() != null) {
            A1H.put("merchant_details", dux.BRq());
        }
        if (dux.BgG() != null) {
            A1H.put("product_image_urls", dux.BgG());
        }
        return 0Yt.A0B(A1H);
    }
}
