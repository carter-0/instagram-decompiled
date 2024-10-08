package X;

import com.instagram.model.shopping.ProductTagDict;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4q5  reason: invalid class name and case insensitive filesystem */
public abstract class C275394q5 {
    public static ProductTagDict parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("destination".equals(A0q)) {
                    num = Integer.valueOf(r9.A1D());
                } else if ("hide_tag".equals(A0q)) {
                    num2 = Integer.valueOf(r9.A1D());
                } else if ("is_removable".equals(A0q)) {
                    bool = Boolean.valueOf(r9.A0d());
                } else if ("position".equals(A0q)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            arrayList.add(new Float(r9.A0U()));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("product".equals(A0q)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r9);
                }
                r9.A0z();
            }
            return new ProductTagDict(productDetailsProductItemDict, bool, num, num2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, ProductTagDict productTagDict) {
        r2.A0c();
        Integer num = productTagDict.A02;
        if (num != null) {
            r2.A0P("destination", num.intValue());
        }
        Integer num2 = productTagDict.A03;
        if (num2 != null) {
            r2.A0P("hide_tag", num2.intValue());
        }
        Boolean bool = productTagDict.A01;
        if (bool != null) {
            r2.A0S("is_removable", bool.booleanValue());
        }
        List<Number> list = productTagDict.A04;
        if (list != null) {
            16P.A03(r2, "position");
            for (Number number : list) {
                if (number != null) {
                    r2.A0f(number.floatValue());
                }
            }
            r2.A0Y();
        }
        ProductDetailsProductItemDict productDetailsProductItemDict = productTagDict.A00;
        if (productDetailsProductItemDict != null) {
            r2.A0q("product");
            C275404q6.A00(r2, productDetailsProductItemDict);
        }
        r2.A0Z();
    }
}
