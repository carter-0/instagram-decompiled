package X;

import java.io.IOException;

/* renamed from: X.NzW  reason: case insensitive filesystem */
public abstract class C70240NzW {
    public static AnonymousClass1g2 parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1g2 r1 = new AnonymousClass1g2();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C66580MXl.A1Z(A17)) {
                    r1.A01 = C254733sx.parseFromJson(r3);
                } else if ("message_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r1.A02 = str;
                } else if ("reaction_mutation".equals(A17)) {
                    r1.A00 = C70068Nwk.parseFromJson(r3);
                } else if (AnonymousClass000.A00(678).equals(A17)) {
                    r1.A05 = r3.A0d();
                } else if ("is_ae".equals(A17)) {
                    r1.A04 = r3.A0d();
                } else if ("is_ae_open_eb".equals(A17)) {
                    r1.A03 = r3.A0d();
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
