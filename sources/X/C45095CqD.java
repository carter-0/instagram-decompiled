package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CqD  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45095CqD {
    public static Map A00(DST dst) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dst.B2Y() != null) {
            List<C46272DTb> B2Y = dst.B2Y();
            ArrayList arrayList = null;
            if (B2Y != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46272DTb dTb : B2Y) {
                    if (dTb != null) {
                        arrayList.add(dTb.FHC());
                    }
                }
            }
            A1H.put("exp", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
