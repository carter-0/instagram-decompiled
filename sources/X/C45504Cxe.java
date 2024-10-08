package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cxe  reason: case insensitive filesystem */
public abstract class C45504Cxe {
    public static C257573xc parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r4.A1J() != 16L.A09) {
                if ("end_scene_products".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1G(r4, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r4.A0z();
            }
            return new C257573xc(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C257573xc r3) {
        r2.A0c();
        List list = r3.A00;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "end_scene_products", list);
            while (A0s.hasNext()) {
                ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) A0s.next();
                if (productDetailsProductItemDict != null) {
                    C275404q6.A00(r2, productDetailsProductItemDict);
                }
            }
            r2.A0Y();
        }
        r2.A0Z();
    }
}
