package X;

import java.io.IOException;

/* renamed from: X.9zi  reason: invalid class name and case insensitive filesystem */
public abstract class C395409zi {
    public static C65761gb parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65761gb r1 = new C65761gb();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(771).equals(A17)) {
                    r1.A00 = C70076Nws.parseFromJson(r3);
                } else if (AnonymousClass000.A00(678).equals(A17)) {
                    r1.A02 = r3.A0d();
                } else if ("is_ae".equals(A17)) {
                    r1.A01 = r3.A0d();
                } else {
                    C66670Mad.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
