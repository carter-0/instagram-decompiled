package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductWrapperIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cn7  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44916Cn7 {
    public static Map A00(IGTVShoppingInfoIntf iGTVShoppingInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (iGTVShoppingInfoIntf.AoB() != null) {
            ClipsShoppingCTABarIntf AoB = iGTVShoppingInfoIntf.AoB();
            if (AoB != null) {
                treeUpdaterJNI2 = AoB.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("clips_shopping_cta_bar", treeUpdaterJNI2);
        }
        if (iGTVShoppingInfoIntf.Aoo() != null) {
            ProductCollection Aoo = iGTVShoppingInfoIntf.Aoo();
            if (Aoo != null) {
                treeUpdaterJNI = Aoo.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("collection_metadata", treeUpdaterJNI);
        }
        User BRo = iGTVShoppingInfoIntf.BRo();
        if (BRo != null) {
            C41847B3o.A1S(BRo, A1H);
        }
        if (iGTVShoppingInfoIntf.Bga() != null) {
            List<ProductWrapperIntf> Bga = iGTVShoppingInfoIntf.Bga();
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
