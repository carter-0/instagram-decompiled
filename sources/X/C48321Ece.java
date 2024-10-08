package X;

import com.instagram.api.schemas.ActionButtonPartnerType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ece  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48321Ece {
    public static Map A00(C274674os r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Ac5() != null) {
            A1H.put("app_id", r3.Ac5());
        }
        if (r3.Ac9() != null) {
            A1H.put("app_logo_url", r3.Ac9());
        }
        if (r3.Ain() != null) {
            A1H.put("button_label", r3.Ain());
        }
        if (r3.AmM() != null) {
            A1H.put("category_type", r3.AmM());
        }
        if (r3.Ay3() != null) {
            A1H.put(C273654mx.A00(268), r3.Ay3());
        }
        if (r3.Bao() != null) {
            A1H.put("partner_name", r3.Bao());
        }
        if (r3.Bap() != null) {
            ActionButtonPartnerType Bap = r3.Bap();
            0qQ.A0B(Bap, 0);
            A1H.put(C273654mx.A00(874), Bap.A00);
        }
        if (r3.getUrl() != null) {
            A1H.put("url", r3.getUrl());
        }
        return 0Yt.A0B(A1H);
    }
}
