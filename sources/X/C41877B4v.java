package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B4v  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41877B4v {
    public static Map A00(C267284bJ r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.B7i() != null) {
            A1H.put("formatted_mashups_count", r3.B7i());
        }
        if (r3.CWC() != null) {
            A1H.put("is_light_weight_check", r3.CWC());
        }
        r3.isPivotPageAvailable();
        A1H.put("is_pivot_page_available", Boolean.valueOf(r3.isPivotPageAvailable()));
        if (r3.BP3() != null) {
            A1H.put("mashups_allowed", r3.BP3());
        }
        if (r3.getMediaType() != null) {
            A1H.put("media_type", r3.getMediaType());
        }
        if (r3.BWT() != null) {
            A1H.put("non_privacy_filtered_mashups_media_count", r3.BWT());
        }
        if (r3.getPk() != null) {
            A1H.put("pk", r3.getPk());
        }
        if (r3.Bfn() != null) {
            A1H.put("privacy_filtered_mashups_media_count", r3.Bfn());
        }
        if (r3.getProductType() != null) {
            A1H.put("product_type", r3.getProductType());
        }
        if (r3.BwG() != null) {
            A1H.put("sidecar_child_media_ids", r3.BwG());
        }
        if (r3.CCd() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r3.CCd().A08());
        }
        return 0Yt.A0B(A1H);
    }
}
