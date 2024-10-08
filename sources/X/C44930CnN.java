package X;

import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformationImpl;
import java.io.IOException;

/* renamed from: X.CnN  reason: case insensitive filesystem */
public abstract class C44930CnN {
    public static ProductLaunchInformationImpl parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Long l = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("drops_campaign_id".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("has_launched".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if ("is_ig_exclusive".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r7);
                } else {
                    l = C41847B3o.A14(r7, l, A17, "launch_date");
                }
                r7.A0z();
            }
            return new ProductLaunchInformationImpl(bool, bool2, l, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
