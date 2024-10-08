package X;

import java.io.IOException;

/* renamed from: X.Nz0  reason: case insensitive filesystem */
public abstract class C70208Nz0 {
    public static C65751gX parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65751gX r1 = new C65751gX();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(771).equals(A17)) {
                    r1.A00 = C70075Nwr.parseFromJson(r3);
                } else if (AnonymousClass000.A00(678).equals(A17)) {
                    r1.A05 = r3.A0d();
                } else if ("is_ae".equals(A17)) {
                    r1.A03 = r3.A0d();
                } else if ("is_ae_open_eb".equals(A17)) {
                    r1.A04 = r3.A0d();
                } else if ("mime_type".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("object_id".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r3);
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
