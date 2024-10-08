package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import com.instagram.user.model.ProductCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cqr  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45133Cqr {
    public static Map A00(ProductCollection productCollection) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        String str2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productCollection.Aoi() != null) {
            A1H.put("collection_id", productCollection.Aoi());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (productCollection.Aor() != null) {
            ProductCollectionReviewStatus Aor = productCollection.Aor();
            if (Aor != null) {
                str2 = Aor.A00;
            } else {
                str2 = null;
            }
            A1H.put("collection_review_status", str2);
        }
        if (productCollection.Aou() != null) {
            ProductCollectionV2Type Aou = productCollection.Aou();
            if (Aou != null) {
                str = Aou.A00;
            } else {
                str = null;
            }
            A1H.put("collection_type", str);
        }
        if (productCollection.Arp() != null) {
            ProductCollectionCover Arp = productCollection.Arp();
            if (Arp != null) {
                treeUpdaterJNI = Arp.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("cover", treeUpdaterJNI);
        }
        if (productCollection.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, productCollection.getDescription());
        }
        if (productCollection.AzC() != null) {
            ProductCollectionDropsMetadata AzC = productCollection.AzC();
            if (AzC != null) {
                treeUpdaterJNI2 = AzC.FHC();
            }
            A1H.put("drops_collection_metadata", treeUpdaterJNI2);
        }
        if (productCollection.BRr() != null) {
            A1H.put("merchant_id", productCollection.BRr());
        }
        if (productCollection.getSubtitle() != null) {
            A1H.put("subtitle", productCollection.getSubtitle());
        }
        if (productCollection.getTitle() != null) {
            C41845B3m.A12(productCollection.getTitle(), A1H);
        }
        List CD6 = productCollection.CD6();
        if (CD6 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(CD6);
            Iterator it = CD6.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("users", A0r);
        }
        return 0Yt.A0B(A1H);
    }
}
