package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class B4C {
    public static Map A00(C65281bi r4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r4.CHj() != null) {
            List<DU8> CHj = r4.CHj();
            ArrayList arrayList = new ArrayList();
            for (DU8 du8 : CHj) {
                if (du8 != null) {
                    arrayList.add(du8.FHC());
                }
            }
            linkedHashMap.put("in", arrayList);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
