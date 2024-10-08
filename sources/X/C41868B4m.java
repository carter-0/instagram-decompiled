package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.B4m  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41868B4m {
    public static Map A00(C253353qe r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.B8h() != null) {
            List<C46322DUz> B8h = r4.B8h();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C46322DUz dUz : B8h) {
                if (dUz != null) {
                    A1C.add(dUz.FHC());
                }
            }
            A1H.put("fundraisers", A1C);
        }
        r4.C8h();
        return C41845B3m.A0u("total_count", Integer.valueOf(r4.C8h()), A1H);
    }
}
