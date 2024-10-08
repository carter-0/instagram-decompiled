package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiProductComponentDestinationType;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CnQ {
    public static Map A00(ProductCollectionLinkIntf productCollectionLinkIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productCollectionLinkIntf.Air() != null) {
            A1H.put("button_text", productCollectionLinkIntf.Air());
        }
        if (productCollectionLinkIntf.Awd() != null) {
            A1H.put("destination_id", productCollectionLinkIntf.Awd());
        }
        if (productCollectionLinkIntf.Awe() != null) {
            ShoppingDestinationMetadataIntf Awe = productCollectionLinkIntf.Awe();
            if (Awe != null) {
                treeUpdaterJNI = Awe.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(585), treeUpdaterJNI);
        }
        if (productCollectionLinkIntf.Awf() != null) {
            A1H.put("destination_subtitle", productCollectionLinkIntf.Awf());
        }
        if (productCollectionLinkIntf.Awg() != null) {
            A1H.put("destination_title", productCollectionLinkIntf.Awg());
        }
        if (productCollectionLinkIntf.Awh() != null) {
            MultiProductComponentDestinationType Awh = productCollectionLinkIntf.Awh();
            0qQ.A0B(Awh, 0);
            A1H.put("destination_type", Awh.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
