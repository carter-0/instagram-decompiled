package X;

import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CnI  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44925CnI {
    public static Map A00(ProductCollectionDropsMetadata productCollectionDropsMetadata) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        productCollectionDropsMetadata.Aoq();
        A1H.put("collection_reminder_set", Boolean.valueOf(productCollectionDropsMetadata.Aoq()));
        productCollectionDropsMetadata.BLf();
        A1H.put("launch_date", Long.valueOf(productCollectionDropsMetadata.BLf()));
        if (productCollectionDropsMetadata.BXB() != null) {
            A1H.put("num_products", productCollectionDropsMetadata.BXB());
        }
        return 0Yt.A0B(A1H);
    }
}
