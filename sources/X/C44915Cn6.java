package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductWrapperIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cn6  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44915Cn6 {
    public static Map A00(ClipsShoppingInfoIntf clipsShoppingInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (clipsShoppingInfoIntf.AoB() != null) {
            ClipsShoppingCTABarIntf AoB = clipsShoppingInfoIntf.AoB();
            if (AoB != null) {
                treeUpdaterJNI2 = AoB.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("clips_shopping_cta_bar", treeUpdaterJNI2);
        }
        if (clipsShoppingInfoIntf.Aoo() != null) {
            ProductCollection Aoo = clipsShoppingInfoIntf.Aoo();
            if (Aoo != null) {
                treeUpdaterJNI = Aoo.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("collection_metadata", treeUpdaterJNI);
        }
        if (clipsShoppingInfoIntf.Bga() != null) {
            List<ProductWrapperIntf> Bga = clipsShoppingInfoIntf.Bga();
            if (Bga != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (ProductWrapperIntf productWrapperIntf : Bga) {
                    if (productWrapperIntf != null) {
                        arrayList.add(productWrapperIntf.FHC());
                    }
                }
            }
            A1H.put("products", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
