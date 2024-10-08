package X;

import java.io.IOException;

/* renamed from: X.Cg0  reason: case insensitive filesystem */
public abstract class C44504Cg0 {
    public static C53466Goy parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1Xj r1 = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            C42109BHn bHn = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("ig_media_content".equals(A17)) {
                    r1 = 1Xj.A00(r4);
                } else if ("product_image_content".equals(A17)) {
                    bHn = C44503Cfz.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C53466Goy(bHn, r1);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
