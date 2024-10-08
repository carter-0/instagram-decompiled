package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ed2  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48345Ed2 {
    public static Map A00(C275914s9 r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.CZQ() != null) {
            A1H.put("is_possible_impersonator", r3.CZQ().FHC());
        }
        if (r3.CZR() != null) {
            A1H.put("is_possible_impersonator_threads", r3.CZR().FHC());
        }
        r3.CZT();
        A1H.put(AnonymousClass000.A00(4955), Boolean.valueOf(r3.CZT()));
        return 0Yt.A0B(A1H);
    }
}
