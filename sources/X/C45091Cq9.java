package X;

import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import java.io.IOException;

/* renamed from: X.Cq9  reason: case insensitive filesystem */
public abstract class C45091Cq9 {
    public static ProductCollectionFeedTaggingMeta parseFromJson(16F r13) {
        String str;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Boolean bool = null;
            String str2 = null;
            ProductCollectionV2Type productCollectionV2Type = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("collection_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("collection_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    productCollectionV2Type = V81.A00(str);
                } else if (AnonymousClass000.A00(3244).equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if (AnonymousClass000.A00(629).equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("is_auto_tagged".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("merchant_id".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("collection_id", r13, "ProductCollectionFeedTaggingMeta");
            } else if (productCollectionV2Type == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("collection_type", r13, "ProductCollectionFeedTaggingMeta");
            } else if (bool != null || !(r13 instanceof 0c9)) {
                return new ProductCollectionFeedTaggingMeta(productCollectionV2Type, str2, str3, str4, str5, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_auto_tagged", r13, "ProductCollectionFeedTaggingMeta");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
