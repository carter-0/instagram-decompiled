package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CYr  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44178CYr {
    public static Map A00(C278644xI r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.AiA() != null) {
            List<C278624xG> AiA = r4.AiA();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C278624xG r0 : AiA) {
                if (r0 != null) {
                    A1C.add(r0.FHC());
                }
            }
            A1H.put("browse_info_dicts", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
