package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.KqD  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63022KqD {
    public static Map A00(C2816758y r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.AqC() != null) {
            A1H.put(C273654mx.A00(135), r4.AqC().FHC());
        }
        r4.Ax0();
        A1H.put(C273654mx.A00(2246), Long.valueOf(r4.Ax0()));
        r4.Ax1();
        A1H.put("digital_product_id", Long.valueOf(r4.Ax1()));
        r4.Baw();
        A1H.put("payee_id", Long.valueOf(r4.Baw()));
        if (r4.BcY() != null) {
            A1H.put(C273654mx.A00(3127), r4.BcY().FHC());
        }
        if (r4.C7B() != null) {
            List<C2815958q> C7B = r4.C7B();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C2815958q r0 : C7B) {
                if (r0 != null) {
                    A1C.add(r0.FHC());
                }
            }
            A1H.put("tier_infos", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
