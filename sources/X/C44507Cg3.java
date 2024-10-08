package X;

import java.io.IOException;

/* renamed from: X.Cg3  reason: case insensitive filesystem */
public abstract class C44507Cg3 {
    public static C53351Gmb parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            Float f = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, "estimated_tax_rate")) {
                    f = AnonymousClass7TF.A0V(r6);
                }
                r6.A0z();
            }
            if (f != null || !(r6 instanceof 0c9)) {
                return new C53351Gmb(f.floatValue(), 0);
            }
            AnonymousClass7TF.A1L("estimated_tax_rate", r6, "TaxInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
