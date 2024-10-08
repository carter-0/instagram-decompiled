package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYz  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44186CYz {
    public static Map A00(C2808454k r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AYw() != null) {
            A1H.put("adCategory", r3.AYw());
        }
        if (r3.getCtaText() != null) {
            A1H.put("cta_text", r3.getCtaText());
        }
        if (r3.BKL() != null) {
            A1H.put("label", r3.BKL());
        }
        if (r3.BYc() != null) {
            A1H.put("options", r3.BYc());
        }
        return 0Yt.A0B(A1H);
    }
}
