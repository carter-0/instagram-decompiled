package X;

import com.instagram.api.schemas.ProductMediaType;
import java.io.IOException;

/* renamed from: X.Cg1  reason: case insensitive filesystem */
public abstract class C44505Cg1 {
    public static C59721JVf parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            C53466Goy goy = null;
            ProductMediaType productMediaType = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("content".equals(A17)) {
                    goy = C44504Cg0.parseFromJson(r8);
                } else if ("media_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    productMediaType = (ProductMediaType) ProductMediaType.A01.get(str);
                    if (productMediaType == null) {
                        productMediaType = ProductMediaType.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (goy == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("content", r8, "TaggedProductMediaImpl");
            } else if (productMediaType != null || !(r8 instanceof 0c9)) {
                return new C59721JVf(productMediaType, (XA4) goy);
            } else {
                AnonymousClass7TF.A1L("media_type", r8, "TaggedProductMediaImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
