package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VEs  reason: case insensitive filesystem */
public abstract class C17018VEs {
    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.model.shopping.ProductGroup, java.lang.Object] */
    public static ProductGroup parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            ? obj = new Object();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if (AnonymousClass000.A00(184).equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            ProductDetailsProductItemDict parseFromJson = C275404q6.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("variant_dimensions".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            ProductVariantDimension parseFromJson2 = C17022VEw.parseFromJson(r6);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                }
                r6.A0z();
            }
            int i = 0;
            while (i < obj.A02.size()) {
                ProductVariantDimension productVariantDimension = (ProductVariantDimension) obj.A02.get(i);
                if (productVariantDimension.A00 != ProductVariantVisualStyle.THUMBNAIL) {
                    i++;
                } else if (i == 0) {
                    return obj;
                } else {
                    obj.A02.remove(productVariantDimension);
                    obj.A02.add(0, productVariantDimension);
                    return obj;
                }
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
