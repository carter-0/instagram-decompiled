package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cfl  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44489Cfl {
    public static Map A00(AnonymousClass3IQ r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.BdP() != null) {
            A1H.put(AnonymousClass000.A00(1691), r4.BdP());
        }
        if (r4.C2y() != null) {
            List<C46302DUf> C2y = r4.C2y();
            ArrayList arrayList = null;
            if (C2y != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46302DUf dUf : C2y) {
                    if (dUf != null) {
                        arrayList.add(dUf.FHC());
                    }
                }
            }
            A1H.put(AnonymousClass000.A00(1867), arrayList);
        }
        if (r4.C30() != null) {
            A1H.put(AnonymousClass000.A00(1868), r4.C30());
        }
        return 0Yt.A0B(A1H);
    }
}
