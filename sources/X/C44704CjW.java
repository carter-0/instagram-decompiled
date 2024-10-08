package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CjW  reason: case insensitive filesystem */
public abstract class C44704CjW {
    public static C65651fJ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65651fJ r0 = new C65651fJ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("fbpay_referral".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41848B3p.A1P(r4, arrayList);
                        }
                    }
                    r0.A01 = arrayList;
                } else if ("referral_id".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r4);
                } else {
                    C66893Meb.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
