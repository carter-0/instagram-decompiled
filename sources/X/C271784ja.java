package X;

import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.4ja  reason: invalid class name and case insensitive filesystem */
public abstract class C271784ja {
    public static final HashMap A00(ProductCollectionLinkIntf productCollectionLinkIntf, ProfileShopLinkIntf profileShopLinkIntf, ReelMultiProductLinkIntf reelMultiProductLinkIntf, ReelProductLink reelProductLink) {
        List Bga;
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf;
        User BRo;
        String A00;
        String str;
        String str2;
        User user;
        ShoppingIncentiveMetadataIntf shoppingIncentiveMetadataIntf;
        ProductCollectionLinkMetadata productCollectionLinkMetadata;
        String Bg0;
        String str3;
        if (profileShopLinkIntf == null && productCollectionLinkIntf == null && reelProductLink == null && reelMultiProductLinkIntf == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str4 = "";
        if (profileShopLinkIntf != null) {
            hashMap.put("shopping_swipe_up_destination_type", AnonymousClass000.A00(3802));
            String BhF = profileShopLinkIntf.BhF();
            String str5 = str4;
            if (BhF != null) {
                str5 = BhF;
            }
            hashMap.put(AnonymousClass000.A00(89), str5);
        }
        if (productCollectionLinkIntf != null) {
            hashMap.put("shopping_swipe_up_destination_type", AnonymousClass000.A00(3980));
            hashMap.put("destination_type", productCollectionLinkIntf.Awh().A00);
            if (productCollectionLinkIntf.Awe() != null) {
                ShoppingDestinationMetadataIntf Awe = productCollectionLinkIntf.Awe();
                if (Awe != null) {
                    shoppingIncentiveMetadataIntf = Awe.BGm();
                } else {
                    shoppingIncentiveMetadataIntf = null;
                }
                ShoppingDestinationMetadataIntf Awe2 = productCollectionLinkIntf.Awe();
                if (Awe2 != null) {
                    productCollectionLinkMetadata = Awe2.BsA();
                } else {
                    productCollectionLinkMetadata = null;
                }
                if (shoppingIncentiveMetadataIntf != null) {
                    hashMap.put("merchant_id", shoppingIncentiveMetadataIntf.BRr());
                    Bg0 = shoppingIncentiveMetadataIntf.BGl();
                    str3 = "incentive_id";
                } else if (productCollectionLinkMetadata != null) {
                    String BRr = productCollectionLinkMetadata.BRr();
                    if (BRr == null) {
                        BRr = str4;
                    }
                    hashMap.put("merchant_id", BRr);
                    Bg0 = productCollectionLinkMetadata.Bg0();
                    str3 = "product_collection_id";
                }
                hashMap.put(str3, Bg0);
            }
        }
        if (reelProductLink != null) {
            ProductDetailsProductItemDict productDetailsProductItemDict = reelProductLink.A00;
            Product product = null;
            if (productDetailsProductItemDict != null) {
                product = new Product((TaggingFeedSessionInformation) null, productDetailsProductItemDict);
            }
            hashMap.put("shopping_swipe_up_destination_type", "instagram_shopping_pdp");
            if (product == null || (str = product.A0H) == null) {
                str = str4;
            }
            hashMap.put("product_id", str);
            if (product == null || (user = product.A0B) == null || (str2 = AnonymousClass3ZA.A00(user)) == null) {
                str2 = str4;
            }
            hashMap.put("merchant_id", str2);
        }
        if (!(reelMultiProductLinkIntf == null || reelMultiProductLinkIntf.Bga() == null || (Bga = reelMultiProductLinkIntf.Bga()) == null || !(!Bga.isEmpty()))) {
            List<ProductDetailsProductItemDictIntf> Bga2 = reelMultiProductLinkIntf.Bga();
            ArrayList arrayList = new ArrayList();
            if (Bga2 != null) {
                for (ProductDetailsProductItemDictIntf productId : Bga2) {
                    String productId2 = productId.getProductId();
                    if (productId2 != null) {
                        arrayList.add(productId2);
                    }
                }
            }
            hashMap.put("shopping_swipe_up_destination_type", "multi_product_sheet");
            hashMap.put("destination_type", C273654mx.A00(822));
            if (!(Bga2 == null || (productDetailsProductItemDictIntf = (ProductDetailsProductItemDictIntf) 00k.A0O(Bga2, 0)) == null || (BRo = productDetailsProductItemDictIntf.BRo()) == null || (A00 = AnonymousClass3ZA.A00(BRo)) == null)) {
                str4 = A00;
            }
            hashMap.put("merchant_id", str4);
            hashMap.put("product_ids", new JSONArray(arrayList).toString());
        }
        return hashMap;
    }
}
