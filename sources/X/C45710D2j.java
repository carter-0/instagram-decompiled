package X;

import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.user.model.ProductCollectionImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D2j  reason: case insensitive filesystem */
public abstract class C45710D2j {
    public static ProductCollectionImpl parseFromJson(16F r13) {
        String str;
        String str2;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str3 = null;
            ProductCollectionReviewStatus productCollectionReviewStatus = null;
            ProductCollectionV2Type productCollectionV2Type = null;
            ProductCollectionCoverImpl productCollectionCoverImpl = null;
            String str4 = null;
            ProductCollectionDropsMetadataImpl productCollectionDropsMetadataImpl = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            ArrayList arrayList = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("collection_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("collection_review_status".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                    productCollectionReviewStatus = (ProductCollectionReviewStatus) ProductCollectionReviewStatus.A01.get(str2);
                    if (productCollectionReviewStatus == null) {
                        productCollectionReviewStatus = ProductCollectionReviewStatus.UNRECOGNIZED;
                    }
                } else if ("collection_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    productCollectionV2Type = V81.A00(str);
                } else if ("cover".equals(A17)) {
                    productCollectionCoverImpl = C44924CnH.parseFromJson(r13);
                } else if (C41845B3m.A1Q(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("drops_collection_metadata".equals(A17)) {
                    productCollectionDropsMetadataImpl = C44926CnJ.parseFromJson(r13);
                } else if ("merchant_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r13.A1P();
                    }
                } else if ("users".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C41846B3n.A1E(r13, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r13.A0z();
            }
            return new ProductCollectionImpl(productCollectionV2Type, productCollectionReviewStatus, productCollectionCoverImpl, productCollectionDropsMetadataImpl, str3, str4, str5, str6, str7, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, ProductCollectionImpl productCollectionImpl) {
        r4.A0c();
        String str = productCollectionImpl.A04;
        if (str != null) {
            r4.A0R("collection_id", str);
        }
        ProductCollectionReviewStatus productCollectionReviewStatus = productCollectionImpl.A01;
        if (productCollectionReviewStatus != null) {
            r4.A0R("collection_review_status", productCollectionReviewStatus.A00);
        }
        ProductCollectionV2Type productCollectionV2Type = productCollectionImpl.A00;
        if (productCollectionV2Type != null) {
            r4.A0R("collection_type", productCollectionV2Type.A00);
        }
        ProductCollectionCover productCollectionCover = productCollectionImpl.A02;
        if (productCollectionCover != null) {
            r4.A0q("cover");
            ProductCollectionCoverImpl FFa = productCollectionCover.FFa();
            r4.A0c();
            ProductImageContainer productImageContainer = FFa.A00;
            if (productImageContainer != null) {
                r4.A0q("image");
                C275414q7.A00(r4, productImageContainer.FFc());
            }
            IgShowreelNativeAnimation igShowreelNativeAnimation = FFa.A01;
            if (igShowreelNativeAnimation != null) {
                r4.A0q("showreel_native_animation");
                AnonymousClass5HA.A00(r4, igShowreelNativeAnimation);
            }
            r4.A0Z();
        }
        String str2 = productCollectionImpl.A05;
        if (str2 != null) {
            r4.A0R(DevServerEntity.COLUMN_DESCRIPTION, str2);
        }
        ProductCollectionDropsMetadata productCollectionDropsMetadata = productCollectionImpl.A03;
        if (productCollectionDropsMetadata != null) {
            r4.A0q("drops_collection_metadata");
            ProductCollectionDropsMetadataImpl FFb = productCollectionDropsMetadata.FFb();
            r4.A0c();
            r4.A0S("collection_reminder_set", FFb.A02);
            r4.A0Q("launch_date", FFb.A00);
            Integer num = FFb.A01;
            if (num != null) {
                r4.A0P("num_products", num.intValue());
            }
            r4.A0Z();
        }
        C41846B3n.A14(r4, productCollectionImpl.A06);
        String str3 = productCollectionImpl.A07;
        if (str3 != null) {
            r4.A0R("subtitle", str3);
        }
        C41846B3n.A10(r4, productCollectionImpl.A08);
        List list = productCollectionImpl.A09;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r4, "users", list);
            while (A0s.hasNext()) {
                C41846B3n.A19(r4, A0s);
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}
