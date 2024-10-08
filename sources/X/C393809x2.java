package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9x2  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393809x2 {
    public static Map A00(DSS dss) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dss.Bzf() != null) {
            List<B39> Bzf = dss.Bzf();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (B39 b39 : Bzf) {
                if (b39 != null) {
                    A1C.add(b39.FHC());
                }
            }
            A1H.put(AnonymousClass000.A00(1843), A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
