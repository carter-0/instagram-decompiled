package X;

import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VEw  reason: case insensitive filesystem */
public abstract class C17022VEw {
    public static ProductVariantDimension parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ProductVariantDimension productVariantDimension = new ProductVariantDimension();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Y(r4, A0q)) {
                    productVariantDimension.A02 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A19(A0q)) {
                    productVariantDimension.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("values".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            VOX parseFromJson = C17021VEv.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    productVariantDimension.A04 = arrayList;
                } else if ("visual_style".equals(A0q)) {
                    ProductVariantVisualStyle productVariantVisualStyle = (ProductVariantVisualStyle) ProductVariantVisualStyle.A01.get(AnonymousClass7TG.A0l(r4));
                    if (productVariantVisualStyle == null) {
                        productVariantVisualStyle = ProductVariantVisualStyle.UNRECOGNIZED;
                    }
                    productVariantDimension.A00 = productVariantVisualStyle;
                } else if ("sizing_chart".equals(A0q)) {
                    productVariantDimension.A01 = C63342KvP.parseFromJson(r4);
                }
                r4.A0z();
            }
            List<VOX> list = productVariantDimension.A04;
            if (list == null) {
                return productVariantDimension;
            }
            for (VOX vox : list) {
                productVariantDimension.A05.add(vox.A00);
            }
            return productVariantDimension;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
