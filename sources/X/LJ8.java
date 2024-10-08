package X;

import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LJ8 {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata, java.lang.Object] */
    public static IGTVShoppingMetadata parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("merchant_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    obj.A02 = A0l;
                } else if ("product_ids".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    obj.A03 = arrayList;
                } else if ("collection_id".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r5);
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, IGTVShoppingMetadata iGTVShoppingMetadata) {
        String str;
        r2.A0c();
        String str2 = iGTVShoppingMetadata.A02;
        if (str2 != null) {
            r2.A0R("merchant_id", str2);
            if (iGTVShoppingMetadata.A03 != null) {
                16P.A03(r2, "product_ids");
                List list = iGTVShoppingMetadata.A03;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C41846B3n.A18(r2, it);
                    }
                    r2.A0Y();
                    String str3 = iGTVShoppingMetadata.A01;
                    if (str3 != null) {
                        r2.A0R("collection_id", str3);
                    }
                    r2.A0Z();
                    return;
                }
            }
            str = "productIds";
        } else {
            str = "merchantId";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
