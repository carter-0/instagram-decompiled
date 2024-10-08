package X;

import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import java.io.IOException;

/* renamed from: X.KvE  reason: case insensitive filesystem */
public abstract class C63331KvE {
    public static C61223JzG parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            IgFundedIncentive igFundedIncentive = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r5, "incentive_details")) {
                    igFundedIncentive = C63336KvJ.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (igFundedIncentive != null || !(r5 instanceof 0c9)) {
                return new C61223JzG(igFundedIncentive);
            }
            AnonymousClass7TF.A1L("incentive_details", r5, "IncentiveRichDestination");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
