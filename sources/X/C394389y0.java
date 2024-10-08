package X;

import java.io.IOException;

/* renamed from: X.9y0  reason: invalid class name and case insensitive filesystem */
public abstract class C394389y0 {
    public static C40601Aep parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C40601Aep aep = new C40601Aep();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("file_path".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    aep.A04 = str;
                } else if (C273654mx.A00(2210).equals(A17)) {
                    aep.A02 = r4.A1D();
                } else if (C273654mx.A00(2209).equals(A17)) {
                    aep.A01 = r4.A1D();
                } else if ("orientation".equals(A17)) {
                    aep.A03 = r4.A1D();
                } else if ("corner_radius".equals(A17)) {
                    aep.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return aep;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
