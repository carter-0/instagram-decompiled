package X;

import java.io.IOException;

/* renamed from: X.8uM  reason: invalid class name and case insensitive filesystem */
public abstract class C369318uM {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.8uN, java.lang.Object] */
    public static C369328uN parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if (!"felix_links".equals(A0q)) {
                    if (!"total_ar_effects".equals(A0q)) {
                        if (!"swipe_up_urls".equals(A0q) && !"profile_shop_links".equals(A0q) && !"shopping_collection_links".equals(A0q) && !"shopping_product_collection_links".equals(A0q) && !"shopping_product_links".equals(A0q) && !"shopping_multi_product_links".equals(A0q)) {
                            if (!"shopping_multi_product_max_products".equals(A0q)) {
                                r3.A0z();
                            }
                        }
                    }
                    r3.A1D();
                    r3.A0z();
                }
                r3.A0d();
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
