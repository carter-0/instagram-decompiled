package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ccv  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44313Ccv {
    public static Map A00(C46300DUd dUd) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUd.Bmu() != null) {
            A1H.put("repost_context", dUd.Bmu());
        }
        if (dUd.Bmw() != null) {
            A1H.put("repost_fbid", dUd.Bmw());
        }
        if (dUd.Bmx() != null) {
            A1H.put("repost_id", dUd.Bmx());
        }
        dUd.Bn0();
        A1H.put("reposted_at", Long.valueOf(dUd.Bn0()));
        if (dUd.Bn4() != null) {
            A1H.put("reposter", dUd.Bn4().A08());
        }
        return 0Yt.A0B(A1H);
    }
}
