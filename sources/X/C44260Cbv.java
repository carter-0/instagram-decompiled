package X;

import java.io.IOException;

/* renamed from: X.Cbv  reason: case insensitive filesystem */
public abstract class C44260Cbv {
    public static C42068BFv parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            1Xj r6 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("highlighted_media_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("media".equals(A17)) {
                    r6 = 1Xj.A00(r8);
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("highlighted_media_id", r8, "ProductDetailsMediaContentImpl");
            } else if (r6 != null || !(r8 instanceof 0c9)) {
                return new C42068BFv(r6, str);
            } else {
                AnonymousClass7TF.A1L("media", r8, "ProductDetailsMediaContentImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
