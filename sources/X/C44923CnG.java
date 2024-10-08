package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CnG  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44923CnG {
    public static Map A00(ProductCollectionCover productCollectionCover) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (productCollectionCover.BFw() != null) {
            ProductImageContainer BFw = productCollectionCover.BFw();
            if (BFw != null) {
                treeUpdaterJNI = BFw.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("image", treeUpdaterJNI);
        }
        if (productCollectionCover.BwB() != null) {
            IgShowreelNativeAnimationIntf BwB = productCollectionCover.BwB();
            if (BwB != null) {
                treeUpdaterJNI2 = BwB.FHC();
            }
            A1H.put("showreel_native_animation", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
