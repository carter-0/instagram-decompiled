package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B70 {
    public static Map A00(C257563xb r4) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.AZ4() != null) {
            A1H.put("ad_id", r4.AZ4());
        }
        if (r4.Bdo() != null) {
            List<Number> Bdo = r4.Bdo();
            if (Bdo != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (Number floatValue : Bdo) {
                    Double A0p = 012.A0p(String.valueOf(floatValue.floatValue()));
                    if (A0p != null) {
                        arrayList.add(A0p);
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("position", arrayList);
        }
        if (r4.getSubtitle() != null) {
            A1H.put("subtitle", r4.getSubtitle());
        }
        if (r4.getTitle() != null) {
            C41845B3m.A12(r4.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
