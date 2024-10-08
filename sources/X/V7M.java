package X;

import java.io.IOException;

public abstract class V7M {
    public static UN3 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Float f = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num = null;
            Float f2 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("avg_rating".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r5);
                } else if ("review_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("satisfaction_score".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r5);
                }
                r5.A0z();
            }
            return new UN3(f, f2, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
