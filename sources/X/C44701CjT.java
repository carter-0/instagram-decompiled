package X;

import java.io.IOException;

/* renamed from: X.CjT  reason: case insensitive filesystem */
public abstract class C44701CjT {
    public static 1dd parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1dd r1 = new 1dd();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("clip".equals(A17)) {
                    r1.A00 = C45671D0w.parseFromJson(r3);
                } else if (C41845B3m.A1A(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("clipsSpinId".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(787).equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("is_x_transport_forward".equals(A17)) {
                    r1.A04 = r3.A0d();
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
