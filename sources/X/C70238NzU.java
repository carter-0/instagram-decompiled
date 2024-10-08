package X;

import java.io.IOException;

/* renamed from: X.NzU  reason: case insensitive filesystem */
public abstract class C70238NzU {
    public static AnonymousClass1f3 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1f3 r1 = new AnonymousClass1f3();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(1709).equals(A17)) {
                    r1.A00 = C70067Nwj.parseFromJson(r3);
                } else if ("direct_forwarding_params".equals(A17)) {
                    r1.A01 = C49753F5e.parseFromJson(r3);
                } else {
                    C66893Meb.A01(r3, r1, A17);
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
