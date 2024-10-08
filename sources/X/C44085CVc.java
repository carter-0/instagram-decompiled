package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CVc  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44085CVc {
    public static Map A00(C270534gt r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.B9M() != null) {
            List<C46279DTi> B9M = r4.B9M();
            ArrayList arrayList = null;
            if (B9M != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46279DTi dTi : B9M) {
                    if (dTi != null) {
                        arrayList.add(dTi.FHC());
                    }
                }
            }
            A1H.put("giphy_videos", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
