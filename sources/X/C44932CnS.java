package X;

import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadataImpl;
import java.io.IOException;

/* renamed from: X.CnS  reason: case insensitive filesystem */
public abstract class C44932CnS {
    public static ProductCollectionLinkMetadataImpl parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ProductCollectionReviewStatus productCollectionReviewStatus = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("collection_type".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if ("merchant_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r9.A1P();
                    }
                } else if ("product_collection_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("review_status".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    productCollectionReviewStatus = (ProductCollectionReviewStatus) ProductCollectionReviewStatus.A01.get(str);
                    if (productCollectionReviewStatus == null) {
                        productCollectionReviewStatus = ProductCollectionReviewStatus.UNRECOGNIZED;
                    }
                }
                r9.A0z();
            }
            if (str2 != null || !(r9 instanceof 0c9)) {
                return new ProductCollectionLinkMetadataImpl(productCollectionReviewStatus, str3, str4, str2);
            }
            AnonymousClass7TF.A1L("product_collection_id", r9, "ProductCollectionLinkMetadataImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
