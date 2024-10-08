package X;

import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CnK  reason: case insensitive filesystem */
public abstract class C44927CnK {
    public static ProductCollectionHeader parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ProductCollectionHeader productCollectionHeader = new ProductCollectionHeader();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("cover".equals(A17)) {
                    ProductCollectionCoverImpl parseFromJson = C44924CnH.parseFromJson(r5);
                    0qQ.A0B(parseFromJson, 0);
                    productCollectionHeader.A00 = parseFromJson;
                } else {
                    ArrayList arrayList = null;
                    if (C41845B3m.A1E(A17)) {
                        String A0l = AnonymousClass7TG.A0l(r5);
                        0qQ.A0B(A0l, 0);
                        productCollectionHeader.A04 = A0l;
                    } else if ("users".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                C41846B3n.A1E(r5, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        productCollectionHeader.A05 = arrayList;
                    } else if (C41845B3m.A1L(A17)) {
                        productCollectionHeader.A03 = AnonymousClass7TG.A0l(r5);
                    } else if (C41845B3m.A1Q(A17)) {
                        productCollectionHeader.A02 = AnonymousClass7TG.A0l(r5);
                    } else if ("drops_collection_metadata".equals(A17)) {
                        productCollectionHeader.A01 = C44926CnJ.parseFromJson(r5);
                    }
                }
                r5.A0z();
            }
            return productCollectionHeader;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
