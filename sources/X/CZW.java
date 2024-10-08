package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CZW {
    public static Map A00(C257783xx r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.Axq() != null) {
            List<AnonymousClass5CX> Axq = r4.Axq();
            ArrayList arrayList = null;
            if (Axq != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (AnonymousClass5CX r0 : Axq) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            }
            A1H.put("disclaimers", arrayList);
        }
        if (r4.B93() != null) {
            A1H.put(C273654mx.A00(716), r4.B93());
        }
        return 0Yt.A0B(A1H);
    }
}
