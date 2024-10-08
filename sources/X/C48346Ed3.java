package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ed3  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48346Ed3 {
    public static Map A00(C275894s7 r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Aq1() != null) {
            A1H.put("connected_similar_user_id", r3.Aq1());
        }
        r3.Cdm();
        A1H.put("is_unconnected_impersonator", Boolean.valueOf(r3.Cdm()));
        return 0Yt.A0B(A1H);
    }
}
