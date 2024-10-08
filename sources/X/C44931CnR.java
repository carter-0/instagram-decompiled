package X;

import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CnR  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44931CnR {
    public static Map A00(ProductCollectionLinkMetadata productCollectionLinkMetadata) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (productCollectionLinkMetadata.Aov() != null) {
            A1H.put("collection_type", productCollectionLinkMetadata.Aov());
        }
        if (productCollectionLinkMetadata.BRr() != null) {
            A1H.put("merchant_id", productCollectionLinkMetadata.BRr());
        }
        if (productCollectionLinkMetadata.Bg0() != null) {
            A1H.put("product_collection_id", productCollectionLinkMetadata.Bg0());
        }
        if (productCollectionLinkMetadata.BoL() != null) {
            ProductCollectionReviewStatus BoL = productCollectionLinkMetadata.BoL();
            if (BoL != null) {
                str = BoL.A00;
            } else {
                str = null;
            }
            A1H.put("review_status", str);
        }
        return 0Yt.A0B(A1H);
    }
}
