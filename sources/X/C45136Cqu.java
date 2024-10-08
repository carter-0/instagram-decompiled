package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductWrapperIntf;
import com.instagram.user.model.ScheduledLiveProductsMetadataIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cqu  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45136Cqu {
    public static Map A00(ScheduledLiveProductsMetadataIntf scheduledLiveProductsMetadataIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (scheduledLiveProductsMetadataIntf.AaE() != null) {
            ScheduledLiveAffiliateInfo AaE = scheduledLiveProductsMetadataIntf.AaE();
            if (AaE != null) {
                treeUpdaterJNI3 = AaE.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("affiliate_info", treeUpdaterJNI3);
        }
        if (scheduledLiveProductsMetadataIntf.Aoo() != null) {
            ProductCollection Aoo = scheduledLiveProductsMetadataIntf.Aoo();
            if (Aoo != null) {
                treeUpdaterJNI2 = Aoo.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("collection_metadata", treeUpdaterJNI2);
        }
        if (scheduledLiveProductsMetadataIntf.Axt() != null) {
            ScheduledLiveDiscountInfo Axt = scheduledLiveProductsMetadataIntf.Axt();
            if (Axt != null) {
                treeUpdaterJNI = Axt.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("discount_info", treeUpdaterJNI);
        }
        User BRo = scheduledLiveProductsMetadataIntf.BRo();
        if (BRo != null) {
            C41847B3o.A1S(BRo, A1H);
        }
        if (scheduledLiveProductsMetadataIntf.Bga() != null) {
            List<ProductWrapperIntf> Bga = scheduledLiveProductsMetadataIntf.Bga();
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
