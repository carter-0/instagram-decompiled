package X;

import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl;
import java.io.IOException;

/* renamed from: X.CnJ  reason: case insensitive filesystem */
public abstract class C44926CnJ {
    public static ProductCollectionDropsMetadataImpl parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            Boolean bool = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Long l = null;
            Integer num = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("collection_reminder_set".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("launch_date".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r8);
                } else {
                    num = C41847B3o.A13(r8, num, A17, "num_products");
                }
                r8.A0z();
            }
            if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("collection_reminder_set", r8, "ProductCollectionDropsMetadataImpl");
            } else if (l != null || !(r8 instanceof 0c9)) {
                return new ProductCollectionDropsMetadataImpl(num, l.longValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("launch_date", r8, "ProductCollectionDropsMetadataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
