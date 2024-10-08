package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.ProductTagDictIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.91G  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass91G {
    public static Map A00(ProductTagDictIntf productTagDictIntf) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (productTagDictIntf.Awa() != null) {
            linkedHashMap.put("destination", productTagDictIntf.Awa());
        }
        if (productTagDictIntf.BDI() != null) {
            linkedHashMap.put(C273654mx.A00(726), productTagDictIntf.BDI());
        }
        if (productTagDictIntf.Caf() != null) {
            linkedHashMap.put(C273654mx.A00(2939), productTagDictIntf.Caf());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (productTagDictIntf.Bdo() != null) {
            List<Number> Bdo = productTagDictIntf.Bdo();
            if (Bdo != null) {
                arrayList = new ArrayList();
                for (Number floatValue : Bdo) {
                    Double A0p = 012.A0p(String.valueOf(floatValue.floatValue()));
                    if (A0p != null) {
                        arrayList.add(A0p);
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("position", arrayList);
        }
        if (productTagDictIntf.Bfu() != null) {
            ProductDetailsProductItemDictIntf Bfu = productTagDictIntf.Bfu();
            if (Bfu != null) {
                treeUpdaterJNI = Bfu.FHC();
            }
            linkedHashMap.put("product", treeUpdaterJNI);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
