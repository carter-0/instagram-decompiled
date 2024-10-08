package X;

import java.io.IOException;

public abstract class CWR {
    public static BET parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            Long l = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("country_code".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r9);
                } else if ("cp_type".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if (!"full_cp_value".equals(A17)) {
                    l = C41847B3o.A14(r9, l, A17, AnonymousClass000.A00(5078));
                } else if (r9.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r9.A1P();
                }
                r9.A0z();
            }
            if (num != null || !(r9 instanceof 0c9)) {
                return new BET(num2, l, str, num.intValue());
            }
            AnonymousClass7TF.A1L("cp_type", r9, "CpContentImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
