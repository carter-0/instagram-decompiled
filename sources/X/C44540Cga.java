package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cga  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44540Cga {
    public static Map A00(AnonymousClass3IS r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.AtD() != null) {
            A1H.put("cta_dest", r4.AtD());
        }
        if (r4.getCtaText() != null) {
            A1H.put("cta_text", r4.getCtaText());
        }
        if (r4.getId() != null) {
            C41845B3m.A0x(r4.getId(), A1H);
        }
        List BPz = r4.BPz();
        if (BPz != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(BPz);
            Iterator it = BPz.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0r, it);
            }
            A1H.put("media_dicts", A0r);
        }
        if (r4.BVq() != null) {
            A1H.put("netego_title", r4.BVq());
        }
        if (r4.Bir() != null) {
            A1H.put("quick_promotion_id", r4.Bir());
        }
        if (r4.C80() != null) {
            A1H.put("toast_text", r4.C80());
        }
        if (r4.C9L() != null) {
            A1H.put("tracking_token", r4.C9L());
        }
        return 0Yt.A0B(A1H);
    }
}
