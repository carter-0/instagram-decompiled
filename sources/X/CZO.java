package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CZO {
    public static Map A00(C257983yH r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.BVS() != null) {
            List<C21034XAn> BVS = r4.BVS();
            ArrayList arrayList = null;
            if (BVS != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C21034XAn xAn : BVS) {
                    if (xAn != null) {
                        arrayList.add(xAn.FHC());
                    }
                }
            }
            A1H.put("native_payload_v1", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
