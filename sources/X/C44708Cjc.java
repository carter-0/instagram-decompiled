package X;

import java.io.IOException;

/* renamed from: X.Cjc  reason: case insensitive filesystem */
public abstract class C44708Cjc {
    public static AnonymousClass1dS parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1dS r1 = new AnonymousClass1dS();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("direct_media_share".equals(A17)) {
                    r1.A00 = C45673D0y.parseFromJson(r3);
                } else if ("direct_forwarding_params".equals(A17)) {
                    r1.A01 = C49753F5e.parseFromJson(r3);
                } else if ("is_x_transport_forward".equals(A17)) {
                    r1.A03 = r3.A0d();
                } else if ("send_as_quoted_reply".equals(A17)) {
                    r1.A04 = r3.A0d();
                } else if (AnonymousClass000.A00(787).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    r1.A02 = str;
                } else if (AnonymousClass000.A00(4003).equals(A17)) {
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
