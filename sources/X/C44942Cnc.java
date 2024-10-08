package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cnc  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44942Cnc {
    public static Map A00(ShoppingDestinationMetadataIntf shoppingDestinationMetadataIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (shoppingDestinationMetadataIntf.BGm() != null) {
            ShoppingIncentiveMetadataIntf BGm = shoppingDestinationMetadataIntf.BGm();
            if (BGm != null) {
                treeUpdaterJNI = BGm.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("incentive_metadata", treeUpdaterJNI);
        }
        if (shoppingDestinationMetadataIntf.BsA() != null) {
            ProductCollectionLinkMetadata BsA = shoppingDestinationMetadataIntf.BsA();
            if (BsA != null) {
                treeUpdaterJNI2 = BsA.FHC();
            }
            A1H.put("seller_product_collection_metadata", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
