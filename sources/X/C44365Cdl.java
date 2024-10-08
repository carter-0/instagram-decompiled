package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cdl  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44365Cdl {
    public static Map A00(AnonymousClass536 r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.CYy() != null) {
            A1H.put("is_pending", r3.CYy());
        }
        if (r3.Bbh() != null) {
            A1H.put("permission", r3.Bbh());
        }
        if (r3.ByI() != null) {
            A1H.put("sponsor", r3.ByI().A08());
        }
        if (r3.ByJ() != null) {
            A1H.put("sponsor_id", r3.ByJ());
        }
        if (r3.getUsername() != null) {
            A1H.put(Dbh.A00(), r3.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
