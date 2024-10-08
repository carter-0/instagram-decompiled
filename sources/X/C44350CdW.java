package X;

import java.io.IOException;

/* renamed from: X.CdW  reason: case insensitive filesystem */
public abstract class C44350CdW {
    public static BBI parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            C250533lb r4 = null;
            C270864hR r5 = null;
            String str2 = null;
            Integer num2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if (C41845B3m.A17(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A17)) {
                    r4 = C250523la.parseFromJson(r9);
                } else if ("layout".equals(A17)) {
                    r5 = C276404tH.A00(r9);
                } else if (!C41845B3m.A1W(A17)) {
                    num2 = C41847B3o.A13(r9, num2, A17, "view_state_item_type");
                } else if (r9.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r9.A1P();
                }
                r9.A0z();
            }
            return new BBI(num, r4, r5, num2, str, str2, 1);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
