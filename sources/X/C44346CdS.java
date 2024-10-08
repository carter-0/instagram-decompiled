package X;

import java.io.IOException;

/* renamed from: X.CdS  reason: case insensitive filesystem */
public abstract class C44346CdS {
    public static BBV parseFromJson(16F r6) {
        String A00;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            while (true) {
                16L A1J = r6.A1J();
                16L r3 = 16L.A09;
                A00 = AnonymousClass000.A00(3930);
                if (A1J == r3) {
                    break;
                }
                if (C41846B3n.A1b(r6, A00)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            if (str != null || !(r6 instanceof 0c9)) {
                return new BBV(str, 9);
            }
            AnonymousClass7TF.A1L(A00, r6, "ShoppingDestinationSearch");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
