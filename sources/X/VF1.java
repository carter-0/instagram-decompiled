package X;

import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.io.IOException;

public abstract class VF1 {
    public static MultiProductComponent parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            MultiProductComponent multiProductComponent = new MultiProductComponent();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1C(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r3);
                    C16675UzB uzB = (C16675UzB) C16675UzB.A01.get(A0l);
                    if (uzB != null) {
                        multiProductComponent.A04 = uzB;
                    } else {
                        throw AnonymousClass7TF.A0W("Cannot parse product feed type = ", A0l);
                    }
                } else if ("collection_id".equals(A17)) {
                    multiProductComponent.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("label".equals(A17)) {
                    multiProductComponent.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("subtitle".equals(A17)) {
                    multiProductComponent.A08 = AnonymousClass7TG.A0l(r3);
                } else if ("display_style".equals(A17)) {
                    multiProductComponent.A02 = (C16671Uz7) C16671Uz7.A01.get(AnonymousClass7TG.A0l(r3));
                } else if ("label_display_style".equals(A17)) {
                    C16558UxA uxA = (C16558UxA) C16558UxA.A01.get(AnonymousClass7TG.A0l(r3));
                    if (uxA == null) {
                        uxA = C16558UxA.BELOW_THUMBNAIL;
                    }
                    multiProductComponent.A01 = uxA;
                } else if ("total_item_count".equals(A17)) {
                    multiProductComponent.A00 = r3.A1D();
                } else if ("product_feed".equals(A17)) {
                    multiProductComponent.A03 = LJM.parseFromJson(r3);
                } else if ("destination".equals(A17)) {
                    multiProductComponent.A05 = C45686D1l.parseFromJson(r3);
                }
                r3.A0z();
            }
            multiProductComponent.A01();
            return multiProductComponent;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
