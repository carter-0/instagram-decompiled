package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ck3  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44735Ck3 {
    public static Map A00(DUW duw) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList2 = null;
        if (duw.BGH() != null) {
            List<C257563xb> BGH = duw.BGH();
            if (BGH != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C257563xb r0 : BGH) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("image_tags", arrayList);
        }
        if (duw.getMediaId() != null) {
            C41845B3m.A13(duw.getMediaId(), A1H);
        }
        List BgK = duw.BgK();
        if (BgK != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(BgK);
            Iterator it = BgK.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0r, it);
            }
            A1H.put(AnonymousClass000.A00(184), A0r);
        }
        if (duw.BgQ() != null) {
            List<DTM> BgQ = duw.BgQ();
            if (BgQ != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                for (DTM dtm : BgQ) {
                    if (dtm != null) {
                        arrayList2.add(dtm.FHC());
                    }
                }
            }
            A1H.put("product_picker_page_info", arrayList2);
        }
        return 0Yt.A0B(A1H);
    }
}
