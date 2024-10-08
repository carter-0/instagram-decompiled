package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class LHB {
    public static C61282K0t parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("pending_approval_requests_count".equals(A17)) {
                    r5.A03 = AnonymousClass7TF.A0X(r6);
                } else if ("require_ad_approval".equals(A17)) {
                    r5.A01 = AnonymousClass7TF.A0S(r6);
                } else if ("require_approval".equals(A17)) {
                    r5.A02 = AnonymousClass7TF.A0S(r6);
                } else if ("whitelisted_users".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1E(r6, arrayList);
                        }
                    }
                    r5.A04 = arrayList;
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            int A09 = JTP.A09(r5.A03);
            Boolean bool = r5.A01;
            boolean A14 = C41845B3m.A14(r5.A02);
            List list = r5.A04;
            0qQ.A0A(list);
            r5.A00 = new C61128Jxe(bool, list, A09, A14);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
