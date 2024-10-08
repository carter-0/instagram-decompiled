package X;

import java.io.IOException;

/* renamed from: X.HcU  reason: case insensitive filesystem */
public abstract class C55121HcU {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.Hj7, java.lang.Object] */
    public static C55525Hj7 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            HMV hmv = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("tab_type".equals(AnonymousClass7TE.A17(r4))) {
                    String A1Q = r4.A1Q();
                    if (A1Q == null) {
                        0wb.A03("SavedCollectionTabType", "Can't parse null collection tab type ");
                    }
                    hmv = (HMV) HMV.A01.get(A1Q);
                    if (hmv == null) {
                        0wb.A03("SavedCollectionTabType", 002.A0R("Can't parse collection tab type ", A1Q));
                    }
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (hmv == null) {
                return obj;
            }
            obj.A00 = hmv;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
