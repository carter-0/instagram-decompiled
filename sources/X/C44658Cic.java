package X;

import java.io.IOException;

/* renamed from: X.Cic  reason: case insensitive filesystem */
public abstract class C44658Cic {
    public static C45339Cuh parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45339Cuh cuh = new C45339Cuh();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(1599).equals(A17)) {
                    cuh.A00 = r3.A1D();
                } else if ("last_updated".equals(A17)) {
                    cuh.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("milestone_type".equals(A17)) {
                    cuh.A02 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return cuh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
