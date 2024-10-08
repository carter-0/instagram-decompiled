package X;

import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadataImpl;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadata;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadata;
import java.io.IOException;

/* renamed from: X.D1q  reason: case insensitive filesystem */
public abstract class C45691D1q {
    public static ShoppingDestinationMetadata parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ShoppingIncentiveMetadata shoppingIncentiveMetadata = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ProductCollectionLinkMetadataImpl productCollectionLinkMetadataImpl = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("incentive_metadata".equals(A17)) {
                    shoppingIncentiveMetadata = C44944Cne.parseFromJson(r4);
                } else if ("seller_product_collection_metadata".equals(A17)) {
                    productCollectionLinkMetadataImpl = C44932CnS.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new ShoppingDestinationMetadata(productCollectionLinkMetadataImpl, shoppingIncentiveMetadata);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, ShoppingDestinationMetadata shoppingDestinationMetadata) {
        r3.A0c();
        ShoppingIncentiveMetadata shoppingIncentiveMetadata = shoppingDestinationMetadata.A01;
        if (shoppingIncentiveMetadata != null) {
            r3.A0q("incentive_metadata");
            r3.A0c();
            String str = shoppingIncentiveMetadata.A00;
            if (str != null) {
                r3.A0R("incentive_id", str);
            }
            C41846B3n.A14(r3, shoppingIncentiveMetadata.A01);
            r3.A0Z();
        }
        ProductCollectionLinkMetadata productCollectionLinkMetadata = shoppingDestinationMetadata.A00;
        if (productCollectionLinkMetadata != null) {
            r3.A0q("seller_product_collection_metadata");
            ProductCollectionLinkMetadataImpl FFh = productCollectionLinkMetadata.FFh();
            r3.A0c();
            String str2 = FFh.A01;
            if (str2 != null) {
                r3.A0R("collection_type", str2);
            }
            C41846B3n.A14(r3, FFh.A02);
            String str3 = FFh.A03;
            if (str3 != null) {
                r3.A0R("product_collection_id", str3);
            }
            ProductCollectionReviewStatus productCollectionReviewStatus = FFh.A00;
            if (productCollectionReviewStatus != null) {
                r3.A0R("review_status", productCollectionReviewStatus.A00);
            }
            r3.A0Z();
        }
        r3.A0Z();
    }
}
