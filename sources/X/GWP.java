package X;

import java.io.IOException;

public abstract class GWP {
    public static GSP parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Integer num = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("pending_count".equals(A0q)) {
                    num = Integer.valueOf(r5.A1D());
                }
                r5.A0z();
            }
            if (num != null || !(r5 instanceof 0c9)) {
                return new GSP(num.intValue());
            }
            AnonymousClass7TF.A1L("pending_count", r5, "BrandedContentInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
