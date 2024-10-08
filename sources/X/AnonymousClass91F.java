package X;

import com.instagram.model.shopping.ProductTagDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.91F  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass91F {
    public static Map A00(C275384q4 r4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r4.CHj() != null) {
            List<ProductTagDictIntf> CHj = r4.CHj();
            ArrayList arrayList = null;
            if (CHj != null) {
                arrayList = new ArrayList();
                for (ProductTagDictIntf productTagDictIntf : CHj) {
                    if (productTagDictIntf != null) {
                        arrayList.add(productTagDictIntf.FHC());
                    }
                }
            }
            linkedHashMap.put("in", arrayList);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
