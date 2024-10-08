package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class Cc3 {
    public static Map A00(DTM dtm) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList2 = null;
        if (dtm.Abc() != null) {
            List Abc = dtm.Abc();
            if (Abc != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = Abc.iterator();
                while (it.hasNext()) {
                    C41847B3o.A1V(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A1H.put("android_links", arrayList);
        }
        if (dtm.BIw() != null) {
            List BIw = dtm.BIw();
            if (BIw != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                Iterator it2 = BIw.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1V(arrayList2, it2);
                }
            }
            A1H.put("ios_links", arrayList2);
        }
        if (dtm.getProductId() != null) {
            A1H.put("product_id", dtm.getProductId());
        }
        return 0Yt.A0B(A1H);
    }
}
