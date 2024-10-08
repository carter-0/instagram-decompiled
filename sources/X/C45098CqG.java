package X;

import java.io.IOException;

/* renamed from: X.CqG  reason: case insensitive filesystem */
public abstract class C45098CqG {
    public static C42143BIy parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Integer num = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num2 = null;
            Float f = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("op".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("p".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r5);
                } else if ("v".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r5);
                }
                r5.A0z();
            }
            return new C42143BIy(f, num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
