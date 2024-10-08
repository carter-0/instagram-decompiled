package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CVX {
    public static Map A00(C270484go r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.Ach() != null) {
            List<DU4> Ach = r4.Ach();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (DU4 du4 : Ach) {
                if (du4 != null) {
                    A1C.add(du4.FHC());
                }
            }
            A1H.put("asset_recommendations", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
