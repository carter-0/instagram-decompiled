package X;

import java.io.IOException;

/* renamed from: X.NzP  reason: case insensitive filesystem */
public abstract class C70233NzP {
    public static AnonymousClass1dM parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1dM r1 = new AnonymousClass1dM();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(2729).equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("live_username".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(1557).equals(A17)) {
                    r1.A01 = C45672D0x.parseFromJson(r3);
                } else if ("direct_forwarding_params".equals(A17)) {
                    r1.A00 = C49753F5e.parseFromJson(r3);
                } else if ("is_x_transport_forward".equals(A17)) {
                    r1.A05 = r3.A0d();
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
