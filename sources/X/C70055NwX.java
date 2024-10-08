package X;

import java.io.IOException;

/* renamed from: X.NwX  reason: case insensitive filesystem */
public abstract class C70055NwX {
    public static C70621ODs parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C70621ODs oDs = new C70621ODs();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("product_type".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    C69405Nkj nkj = (C69405Nkj) C69405Nkj.A01.get(str);
                    if (nkj == null) {
                        nkj = C69405Nkj.UNRECOGNIZED;
                    }
                    oDs.A00 = nkj;
                } else if ("ephemeral_duration_sec".equals(A17)) {
                    oDs.A01 = AnonymousClass7TF.A0Z(r3);
                } else if ("ephemeral_view_duration_sec".equals(A17)) {
                    oDs.A02 = AnonymousClass7TF.A0Z(r3);
                }
                r3.A0z();
            }
            return oDs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
