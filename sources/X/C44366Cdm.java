package X;

import com.instagram.api.schemas.SponsoredAdsDisclaimerType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cdm  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44366Cdm {
    public static Map A00(C257963yF r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Agq() != null) {
            A1H.put("bold_style_text", r3.Agq());
        }
        r3.BAh();
        A1H.put("has_bold_style_text", Boolean.valueOf(r3.BAh()));
        if (r3.BKL() != null) {
            A1H.put("label", r3.BKL());
        }
        if (r3.BKP() != null) {
            SponsoredAdsDisclaimerType BKP = r3.BKP();
            0qQ.A0B(BKP, 0);
            A1H.put("label_type", BKP.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
