package X;

import java.io.IOException;

/* renamed from: X.Ckf  reason: case insensitive filesystem */
public abstract class C44768Ckf {
    public static C45346Cuo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45346Cuo cuo = new C45346Cuo();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("body".equals(A17)) {
                    cuo.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("header".equals(A17)) {
                    cuo.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("overview_points".equals(A17)) {
                    cuo.A00 = C44767Cke.parseFromJson(r3);
                }
                r3.A0z();
            }
            return cuo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
