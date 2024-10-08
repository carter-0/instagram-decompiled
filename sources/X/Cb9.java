package X;

import com.instagram.api.schemas.OrganicCTAType;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class Cb9 {
    public static Map A00(AnonymousClass5HT r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AtA() != null) {
            A1H.put("cta_action_links", r3.AtA());
        }
        if (r3.getCtaSubtitle() != null) {
            A1H.put("cta_subtitle", r3.getCtaSubtitle());
        }
        if (r3.getCtaTitle() != null) {
            A1H.put("cta_title", r3.getCtaTitle());
        }
        if (r3.AtT() != null) {
            OrganicCTAType AtT = r3.AtT();
            0qQ.A0B(AtT, 0);
            A1H.put("cta_type", AtT.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
