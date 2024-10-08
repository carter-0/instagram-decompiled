package X;

import java.io.IOException;

public abstract class GWC {
    public static C52414GRr parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            Integer num = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num2 = null;
            C53401GnY gnY = null;
            C61073JwB jwB = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("pending_count".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                } else if ("new_leads_count".equals(A0q)) {
                    num2 = Integer.valueOf(r8.A1D());
                } else if ("coupon_data".equals(A0q)) {
                    gnY = C14310Ttk.parseFromJson(r8);
                } else if ("error".equals(A0q)) {
                    jwB = GWD.parseFromJson(r8);
                }
                r8.A0z();
            }
            if (num != null || !(r8 instanceof 0c9)) {
                return new C52414GRr(gnY, jwB, num2, num.intValue());
            }
            AnonymousClass7TF.A1L("pending_count", r8, "AdsManagerInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
