package X;

import com.instagram.model.shopping.productfeed.ProductCollectionFooterLink;
import java.io.IOException;

/* renamed from: X.KvL  reason: case insensitive filesystem */
public abstract class C63338KvL {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductCollectionFooterLink] */
    public static ProductCollectionFooterLink parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("linkType".equals(A17)) {
                    obj.A00 = (AnonymousClass47L) AnonymousClass47L.A01.get(r3.A1D());
                } else if ("webUri".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("deeplinkUri".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
