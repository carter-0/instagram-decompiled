package X;

import com.instagram.user.model.ProductCollectionImpl;
import java.io.IOException;

/* renamed from: X.CXj  reason: case insensitive filesystem */
public abstract class C44144CXj {
    public static C42035BEn parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ProductCollectionImpl productCollectionImpl = null;
            String str = null;
            BFY bfy = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("collection_metadata".equals(A17)) {
                    productCollectionImpl = C45710D2j.parseFromJson(r9);
                } else if ("collection_type".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("discount_metadata".equals(A17)) {
                    bfy = CaZ.parseFromJson(r9);
                } else if ("highlight_bar_destination".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if (!AnonymousClass000.A00(629).equals(A17)) {
                    bool = C41847B3o.A0z(r9, bool, A17, "is_auto_tagged");
                } else if (r9.A11() == 16L.A0G) {
                    str3 = null;
                } else {
                    str3 = r9.A1P();
                }
                r9.A0z();
            }
            return new C42035BEn(bfy, productCollectionImpl, bool, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
