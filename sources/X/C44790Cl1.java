package X;

import java.io.IOException;

/* renamed from: X.Cl1  reason: case insensitive filesystem */
public abstract class C44790Cl1 {
    public static C45348Cuq parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45348Cuq cuq = new C45348Cuq();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("length".equals(A17)) {
                    cuq.A00 = r3.A1D();
                } else if ("offset".equals(A17)) {
                    cuq.A01 = r3.A1D();
                } else if ("entity".equals(A17)) {
                    cuq.A02 = C44789Cl0.parseFromJson(r3);
                }
                r3.A0z();
            }
            return cuq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
