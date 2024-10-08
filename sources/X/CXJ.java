package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CXJ {
    public static Map A00(DTD dtd) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList2 = null;
        if (dtd.Abc() != null) {
            List Abc = dtd.Abc();
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
        if (dtd.Azc() != null) {
            A1H.put("dynamic_item_id", dtd.Azc());
        }
        if (dtd.BIw() != null) {
            List BIw = dtd.BIw();
            if (BIw != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                Iterator it2 = BIw.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1V(arrayList2, it2);
                }
            }
            A1H.put("ios_links", arrayList2);
        }
        return 0Yt.A0B(A1H);
    }
}
