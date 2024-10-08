package X;

import com.instagram.model.shopping.productfeed.ProductCollectionFooter;
import com.instagram.model.shopping.productfeed.ProductCollectionFooterLink;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KvM  reason: case insensitive filesystem */
public abstract class C63339KvM {
    public static ProductCollectionFooter parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ProductCollectionFooter productCollectionFooter = new ProductCollectionFooter();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("text".equals(A17)) {
                    productCollectionFooter.A00 = AnonymousClass7TG.A0l(r5);
                } else if (AnonymousClass000.A00(4467).equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            ProductCollectionFooterLink parseFromJson = C63338KvL.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    productCollectionFooter.A01 = arrayList;
                }
                r5.A0z();
            }
            return productCollectionFooter;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
